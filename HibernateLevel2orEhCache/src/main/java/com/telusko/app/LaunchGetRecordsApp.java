package com.telusko.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.telusko.model.Student;

public class LaunchGetRecordsApp {

	public static void main(String[] args) {
		
		
		SessionFactory sf = new Configuration().configure()
		.addAnnotatedClass(Student.class).buildSessionFactory();
		                	
		Session session1 = null;		
		Session session2 = null;
		try {
	
			session1=sf.openSession();
			session2=sf.openSession();
			
			Student std10=session1.get(Student.class, 1);
			System.out.println(std10);
			Student std11=session1.get(Student.class, 1);
			System.out.println(std11);

			Student std2=session2.get(Student.class, 1);
			System.out.println(std2);
			Student std3=session2.get(Student.class, 1);
			System.out.println(std3);
//			Student std4=session2.get(Student.class, 2);
//			System.out.println(std4);
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
