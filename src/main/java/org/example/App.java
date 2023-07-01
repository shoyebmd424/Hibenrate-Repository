package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class App
{
    public static void main( String[] args ) throws IOException
    {

        System.out.println( "Hello World!" );
        Configuration cgf=new Configuration();
        cgf.configure();
        SessionFactory factory=cgf.buildSessionFactory();
    // Student class
        Student st=new Student();
        st.setCity("Delhi");
        st.setName("Iqbal");
        st.setId(100);
// Address
        Address add=new Address();add.setCity("Delhi");
        add.setStreet("street2");
        add.setOpen(true);
        add.setAddedDate(new Date());
        add.setX(124567.34);
        //image
        FileInputStream fils= new FileInputStream("src/main/java/pic.jpg");
        byte[] data=new byte[fils.available()];
        fils.read();
        add.setImage(data);

        System.out.println(st);
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(st);
        session.save(add);
        tx.commit();
        System.out.println("Done.....");





        session.close();
    }
}
