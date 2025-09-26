package org.rohan.mapping.hibernate_querry_language;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class FetchRecord {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();

        String hql = "FROM studentRecord";
        Query q = session.createQuery(hql);
       // q.setParameter("r",103);
        List<studentRecord> list = q.list();
        for(studentRecord sr : list)
        {
            System.out.println(sr.getRoll()+" "+ sr.getName());
        }

        session.close();
        factory.close();
    }
}
