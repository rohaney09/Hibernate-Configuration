package org.rohan.mapping.hibernate_querry_language;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertRecord {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        studentRecord s1 = new studentRecord(101, "Rohan", 85);
        studentRecord s2 = new studentRecord(102, "Rakesh", 47);
        studentRecord s3 = new studentRecord(103, "Priya", 89);


        session.save(s1);
        session.save(s2);
        session.save(s3);

        tx.commit();
        session.close();
        factory.close();
        System.out.println("Student inserted successfully!");

    }
}
