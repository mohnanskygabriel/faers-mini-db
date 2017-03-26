package com.globallogic.faers.app;

import com.globallogic.faers.event.Event;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainCLI {

    private static SessionFactory factory;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventDAO eventDAO = new EventDAO();
        Event event;
        Session session = null;
        Transaction tx = null;
        try {
            event = eventDAO.getEventFromJSON();
            factory = new Configuration().configure().buildSessionFactory();
            session = factory.openSession();
            tx = session.beginTransaction();
            session.save(event);
            tx.commit();
            System.out.println("IMPORT ÚDAJOV PREBEHOL ÚSPEŠNE");
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainCLI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        } finally {
            if (session != null) {
                session.close();
            }
            System.exit(0);
        }

    }
}
