package org.rohan.mapping.hibernate_querry_language;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UpdateRecord {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        String hql = "update studentRecord set name=:n where roll=:r";
        Query q = session.createQuery(hql);
        q.setParameter("n","Honey");
        q.setParameter("r",102);
        int status = q.executeUpdate();
        System.out.println(status);

        tx.commit();
        session.close();
        factory.close();
        System.out.println("Student Updated successfully!");
    }
}
