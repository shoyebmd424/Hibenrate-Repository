package org.states;

import org.example.Certificate;
import org.example.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class State {
    public static void main(String[] args) {
//        States
//        Transient
//        presistent
//        detached
//         Removed
        SessionFactory f=new Configuration().configure().buildSessionFactory();
        // object
        Student s=new Student();
        s.setId(123450);
        s.setName("iqbal");
        s.setCity("Delhi");
        s.setCerti(new Certificate("java Hibernate course","3 Month"));


        f.close();
    }
}
