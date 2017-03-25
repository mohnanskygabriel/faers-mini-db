package com.globallogic.faers.app;

import com.globallogic.faers.event.Event;
import com.globallogic.faers.event.Result;
import java.util.List;
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
        Event event = eventDAO.getEventFromJSON();
        System.out.println("Result size: " + event.getResults().size());
        List<Result> results = event.getResults();

        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            for (Result result : results) {
                session.save(result);
            }
            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            /* Openfda first = session.get(Openfda.class, new Long(1));
            System.out.println(first.getGenericName().get(2));*/
            session.close();
            System.exit(0);
        }
    }
}
