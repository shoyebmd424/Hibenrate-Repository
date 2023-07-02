package org.map.map1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class map1 {
    public static void main(String[] args) {
        Configuration cgf=new Configuration();
        cgf.configure();
        SessionFactory factory=cgf.buildSessionFactory();
    Emp e1=new Emp();
    Emp e2=new Emp();

    e1.setEmpId(2);
    e1.setEmpName("Md Sem");

    e2.setEmpId(3);
    e2.setEmpName("Md abubakar");

    Project pr1=new Project();
    Project pr2=new Project();

    pr1.setPid(1);
    pr1.setProjectName("Hotal management");
    pr2.setPid(2);
    pr2.setProjectName("E-commerce");


        List<Emp>list1=new ArrayList<>();
        List<Project>list2=new ArrayList<>();
        list1.add(e1);
        list1.add(e2);

        list2.add(pr1);
        list2.add(pr2);

       e1.setProjects(list2);
       pr2.setEmps(list1);
        Session s=factory.openSession();
        Transaction tx= s.beginTransaction();
s.save(e1);
s.save(e2);
s.save(pr2);
s.save(pr1);

        tx.commit();
        s.close();
        factory.close();
    }
}
