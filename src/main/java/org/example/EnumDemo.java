package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.util.Date;

public class EnumDemo {
    public static void main(String[] args) {
        Configuration cgf=new Configuration();
        cgf.configure();
        SessionFactory factory=cgf.buildSessionFactory();
        // Student class
        Student st=new Student();
        st.setCity("Delhi");
        st.setName("Iqbal");
        st.setId(100);
        Certificate ct=new Certificate();
        ct.setCourse("Java Developer");
        ct.setDuration("2 Month");
        st.setCerti(ct);
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(st);
        tx.commit();
        System.out.println("Done.....");
    }
}
