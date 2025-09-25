package org.rohan.mapping.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MainManyToMany {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        student s1 = new student();
        student s2 = new student();

        s1.setRollNumber(1);
        s1.setStdName("Rohan");
        s1.setGender("Male");

        s2.setRollNumber(2);
        s2.setStdName("Gita");
        s2.setGender("Female");

        project p1 = new project();
        project p2 = new project();

        p1.setId(101);
        p1.setProjectName("Library-management-system");
        p1.setDuration(6);

        p2.setId(102);
        p2.setProjectName("Hotel-management-system");
        p2.setDuration(4);

        List<student>list1 = new ArrayList<>();
        List<project>list2 = new ArrayList<>();

        list1.add(s1);
        list1.add(s2);

        list2.add(p1);
        list2.add(p2);

        s1.setProjects(list2);
        s2.setProjects(list2);

        p1.setStudents(list1);
        p2.setStudents(list1);

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(s1);
        session.save(s2);
        session.save(p1);
        session.save(p2);


        tx.commit();
        session.close();
        factory.close();

    }
}
