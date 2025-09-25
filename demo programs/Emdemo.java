package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Embeddable;
import java.util.Scanner;
public class Emdemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter ID: ");
//        int id = sc.nextInt();
//        System.out.println("Enter Name: ");
//        String  name = sc.next();
//        System.out.println("Enter City: ");
//        String  city = sc.next();

        student st = new student();
        st.setId(201);
        st.setName("Sunil");
        st.setCity("Delhi");

        Certificate ct = new Certificate();
        ct.setCourse("Android");
        ct.setDuration("6 Hours");

        st.setCerti(ct);


//        System.out.println("Student object to save: " + st);
//        System.out.println("Student Certificate to save: " + ct);


        Session session = null;
        Transaction tx = null;

        try {
            // Open a new session from the factory
            session = factory.openSession();
            // Begin a new transaction
            tx = session.beginTransaction();
            // Save the student object to the database
            session.save(st);
            // Commit the transaction
            tx.commit();
            System.out.println("Student saved successfully!");
        } catch (Exception e) {
            // If an error occurs, roll back the transaction
            if (tx != null) {
                System.out.println(e);
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            // Ensure the session and factory are closed to release resources
            if (session != null) {
                session.close();
            }
            factory.close();
            System.out.println("Session and Factory closed.");
        }
    }
}
