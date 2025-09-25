package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Project Start..");

        // Create configuration object and build the session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        //for Dynamic input of student
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int id = sc.nextInt();
        System.out.println("Enter Name: ");
        String  name = sc.next();
        System.out.println("Enter City: ");
        String  city = sc.next();

        //for Dynamic input of student Addres
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter the Street: ");
        String street = scc.next();
        System.out.println("Enter the city: ");
        String citys = scc.next();

       System.out.println("Enter the city is open or close: ");
        Boolean isopen = scc.nextBoolean();
        //System.out.println("Enter the date: ");
        //Date date = scc.next();
        System.out.println("Enter your age: ");
        int age = scc.nextInt();


        // Create a new Student object to persist
        student st = new student();
        st.setId(id);
        st.setName(name);
        st.setCity(city);
        System.out.println("Student object to save: " + st);

        //Create a new Address object to persist
        Address ad = new Address();
        ad.setAddedDate(new Date());
       // ad.setImage();
        ad.setIsOpen(isopen);
        ad.setStreet(street);
        ad.setCity(citys);
        ad.setX(age);


        Session session = null;
        Transaction tx = null;

        try {
            // Open a new session from the factory
            session = factory.openSession();
            // Begin a new transaction
            tx = session.beginTransaction();
            // Save the student object to the database
            session.save(st);
            session.save(ad);
            // Commit the transaction
            tx.commit();
            System.out.println("Student saved successfully!");
        } catch (Exception e) {
            // If an error occurs, roll back the transaction
            if (tx != null) {
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

