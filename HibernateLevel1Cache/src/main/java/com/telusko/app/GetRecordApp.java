package com.telusko.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.model.Student;

public class GetRecordApp {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure()
		.addAnnotatedClass(Student.class).buildSessionFactory();
		                   
		
		Session session1 = null;		
		Session session2 = null;
		try {
			
//			session1=sf.openSession();//for every one session one cache will be given by hibernate
//			Student std1=session1.get(Student.class, 1);//hibernate trigger query 1st time
//			System.out.println(std1);		
//			Student std2=session1.get(Student.class, 1);//hibernate will not trigger query for this
//			System.out.println(std2);
//			Student std3=session1.get(Student.class, 2);//hibernate will trigger query 2nd time for this
//			System.out.println(std3);
			
			session1=sf.openSession();// one cache will be given by hibernate
			session2=sf.openSession();//hibernate will create one more level 1cache memory
			Student std10=session1.get(Student.class, 100);//trigger query 1st time
			System.out.println(std10);
			Student std11=session1.get(Student.class, 100);//query will not trigger 2nd time bcz object is already present in level-1 cache memory of session1 object
			System.out.println(std11);

			Student std2=session2.get(Student.class, 100);//trigger query 2nd time bcz of different session 
			System.out.println(std2);
			Student std3=session2.get(Student.class, 100);//query will not trigger bcz object is already present in level-1 cache memory of session2 object
			System.out.println(std3);		            //number of database hits are less performance of application more
			
		}
		catch(HibernateException e) {
		     e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
			session1.close();
			session2.close();
			sf.close();
		}
		

	}

}
