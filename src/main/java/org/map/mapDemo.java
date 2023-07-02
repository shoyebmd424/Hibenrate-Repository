package org.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class mapDemo {
    public static void main(String[] args) {
        Configuration cgf=new Configuration();
        cgf.configure();
        SessionFactory factory=cgf.buildSessionFactory();
//       Questions q1=new Questions(12,"size of integer in java",new Answer(13,"32 bit",q1));
//       Questions q2=new Questions(123,"what is java",new Answer(123,"32 bit"));
//        Questions q1=new Questions();
//        q1.setQuestionId(12);
//        q1.setQuestion("what is java");
//        Answer ans1=new Answer();
//        ans1.setAnswer("java oops bases programing language");
//        ans1.setAnswerId(13);
//        ans1.setQuestion(q1);
//
//        Answer ans=new Answer();
//        ans.setAnswerId(14);
//        ans.setQuestion(q1);
//        ans.setAnswer("java is a platform independent programming language");
//        Answer ans2=new Answer();
//        ans2.setAnswerId(15);
//        ans2.setQuestion(q1);
//        ans2.setAnswer("java is a platform independent programming language");
//        List<Answer> list=new ArrayList<>();
//        list.add(ans);
//        list.add(ans1);
//        list.add(ans2);
//        q1.setAnswers(list);

       Session s=factory.openSession();
      Transaction tx= s.beginTransaction();
//      s.save(q1);
//      s.save(ans);
//      s.save(ans1);
//      s.save(ans2);

        Questions q=(Questions)s.get(Questions.class,12);
        for(Answer a:q.getAnswers()){
            System.out.println(a);
        }


      tx.commit();
      s.close();
      factory.close();
    }
}
