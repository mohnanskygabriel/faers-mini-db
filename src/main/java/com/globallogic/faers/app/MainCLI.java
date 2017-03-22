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
        int i = 0;
        for (Result result : results) {
            System.out.println(result.getSeriousnessother());
        }

        /*
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
            ResultDAO dao = new ResultDAO();
            List<Event> events = dao.getEventListFromJSON();
            for (Event event : events) {
                session.save(event);
            }
            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
         */
    }
}
