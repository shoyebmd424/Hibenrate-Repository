package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
    public static void main(String[] args) {
        Configuration cgf=new Configuration();
        cgf.configure();
        SessionFactory factory=cgf.buildSessionFactory();
        Session session=factory.openSession();
        Student student=(Student)session.get(Student.class,106);
        System.out.println(student);
        session.close();
        factory.close();
    }
}
