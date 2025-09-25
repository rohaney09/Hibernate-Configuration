package org.rohan.mapping.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CrudMain {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        // CREATE
        Transaction tx = session.beginTransaction();
        Doctor d1 = new Doctor(1,"Rohan",500);
        session.save(d1);
        tx.commit();
        System.out.println("Record created sucessfully");

        // READ
        Doctor d = session.get(Doctor.class, 1);
        System.out.println("Doctor Name: " + d.getName());
        System.out.println("Record Fetched sucessfully");

        // UPDATE
        tx = session.beginTransaction();
        d.setName("Rohan Paul");
        session.update(d);
        tx.commit();
        System.out.println("Record Updated sucessfully");

        // DELETE
        tx = session.beginTransaction();
        session.delete(d);
        tx.commit();
        System.out.println("Record Deleted sucessfully");

        session.close();
        factory.close();
    }
}
