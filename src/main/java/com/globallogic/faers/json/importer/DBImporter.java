package com.globallogic.faers.json.importer;

import com.globallogic.faers.json.DAO;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DBImporter {

    public void importJson(String json, String ip, String port, String db, String username, String password) {
        Logger logger = LogManager.getLogger(DBImporter.class);
        logger.info("Importing file: " + json);
        DAO dao = new DAO();
        Event event;
        Session session = null;
        SessionFactory factory = null;
        Transaction tx = null;
        try {
            event = dao.getEventFromJSON(json);
            Configuration configuration = new Configuration();
            configuration.configure(new File("config/hibernate.cfg.xml"));
            String connectionURL = "jdbc:postgresql://" + ip + ":" + port + "/" + db;
            configuration.getProperties().setProperty("hibernate.connection.username", username);
            configuration.getProperties().setProperty("hibernate.connection.password", password);
            configuration.getProperties().setProperty("hibernate.connection.url", connectionURL);
            factory = configuration.buildSessionFactory();
            session = factory.openSession();
            tx = session.beginTransaction();
            session.save(event);
            tx.commit();
            logger.info("Data import successfully completed from file: " + json);
        } catch (HibernateException hibernateException) {
            if (tx != null) {
                tx.rollback();
            }
            logger.catching(hibernateException);
        } catch (ExceptionInInitializerError exceptionInInitializerError) {
            logger.fatal("Failed to create sessionFactory object");
            logger.catching(exceptionInInitializerError);
        } finally {
            if (session != null) {
                session.close();
            }
            if (factory != null) {
                factory.close();
            }
        }
    }

    public List<File> getAllJsonFromDirectory(File sourceDirectory) {
        List<File> jsonList = new LinkedList<>();
        Queue<File> directoryQueue = new LinkedList<>();
        File[] abstractPathnames = sourceDirectory.listFiles();
        if (abstractPathnames == null) {
            abstractPathnames = new File[0];
        }
        List<File> fileList = Arrays.asList(abstractPathnames);
        for (File file : fileList) {
            if (file.isDirectory()) {
                directoryQueue.add(file);
            } else if (file.isFile() && file.getName().endsWith(".json")) {
                jsonList.add(file);
            }
        }
        while (!directoryQueue.isEmpty()) {
            jsonList.addAll(getAllJsonFromDirectory(directoryQueue.poll()));
        }
        return jsonList;
    }

    public void importAllJsonFromDirectory(File sourceDirectory, String ip, String port, String db, String username, String password) {
        List<File> fileList = getAllJsonFromDirectory(sourceDirectory);
        for (File file : fileList) {
            importJson(file.getAbsolutePath(), ip, port, db, username, password);
        }
    }

}
