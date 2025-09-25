package org.rohan.mapping.onetoone;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainOneToOne
{
    public static void main( String[] args ){
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Question q1 = new Question();
        q1.setQuestion_id(101);
        q1.setQuestion("What is Java?");
        Answer a1 = new Answer();
        a1.setAnswer_id(201);
        a1.setAnswer("It is an programming language.");
        q1.setAnswer(a1);

        Question q2 = new Question();
        q2.setQuestion_id(102);
        q2.setQuestion("What is Constructor?");
        Answer a2 = new Answer();
        a2.setAnswer_id(202);
        a2.setAnswer("What is Collection Framwork");
        q2.setAnswer(a2);

        Question q3 = new Question();
        q3.setQuestion_id(103);
        q3.setQuestion("What is Constructor?");
        Answer a3 = new Answer();
        a3.setAnswer_id(203);
        a3.setAnswer("API to work group of objects.");
        q3.setAnswer(a3);



        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();



        session.save(q1);
        session.save(q2);
        session.save(q3);

        session.save(a1);
        session.save(a2);
        session.save(a3);

        tx.commit();
        session.close();
        factory.close();
    }
}
