package org.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mapDemo {
    public static void main(String[] args) {
        Configuration cgf=new Configuration();
        cgf.configure();
        SessionFactory factory=cgf.buildSessionFactory();
//       Questions q1=new Questions(12,"size of integer in java",new Answer(13,"32 bit",q1));
//       Questions q2=new Questions(123,"what is java",new Answer(123,"32 bit"));
        Questions q1=new Questions();
        q1.setQuestionId(12);
        q1.setQuestion("what is java");
        Answer ans1=new Answer();
        ans1.setAnswer("java oops bases programing language");
        ans1.setAnswerId(13);
        ans1.setQuestion(q1);
        q1.setAnswer(ans1); Questions q2=new Questions();
        q2.setQuestionId(13);
        q2.setQuestion("what is java");
        Answer ans2=new Answer();
        ans2.setAnswer("java oops bases programing language");
        ans2.setAnswerId(14);
        q2.setAnswer(ans2);
        ans2.setQuestion(q2);
       Session s=factory.openSession();
      Transaction tx= s.beginTransaction();
      s.save(q1);
      s.save(q2);
    s.save(ans1);
    s.save(ans2);
      tx.commit();
      s.close();
      factory.close();
    }
}
