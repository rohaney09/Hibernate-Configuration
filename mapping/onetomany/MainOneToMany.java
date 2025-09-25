package org.rohan.mapping.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MainOneToMany {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        //company 1
       Company c = new Company();
       c.setCompany_id(101);
       c.setCompany_name("Wipro");

       Employee e = new Employee();
       e.setEmp_id(201);
       e.setEmp_name("rohan");
       e.setDomain("Java Developer");

       Employee e1 = new Employee();
       e1.setEmp_id(202);
       e1.setEmp_name("Gita");
       e1.setDomain("Python Developer");

        Employee e2 = new Employee();
        e2.setEmp_id(203);
        e2.setEmp_name("Meena");
        e2.setDomain("Analyst");

        //company 2
        Company c1 = new Company();
        c1.setCompany_id(102);
        c1.setCompany_name("TCS");

        Employee e3 = new Employee();
        e3.setEmp_id(204);
        e3.setEmp_name("Manas");
        e3.setDomain("Manual Tester");

        Employee e4 = new Employee();
        e4.setEmp_id(205);
        e4.setEmp_name("Surash");
        e4.setDomain("Manager");

        // Wipro Employees
        e.setCompany(c);
        e1.setCompany(c);
        e2.setCompany(c);

        List<Employee> list1 = new ArrayList<>();
        list1.add(e);
        list1.add(e1);
        list1.add(e2);
        c.setEmployees(list1);

        // TCS Employees
        e3.setCompany(c1);
        e4.setCompany(c1);

        List<Employee> list2 = new ArrayList<>();
        list2.add(e3);
        list2.add(e4);
        c1.setEmployees(list2);



        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        // save
        session.save(c);
        session.save(c1);
        session.save(e);
        session.save(e1);
        session.save(e2);
        session.save(e3);
        session.save(e4);



        tx.commit();
        session.close();
        factory.close();
    }

}