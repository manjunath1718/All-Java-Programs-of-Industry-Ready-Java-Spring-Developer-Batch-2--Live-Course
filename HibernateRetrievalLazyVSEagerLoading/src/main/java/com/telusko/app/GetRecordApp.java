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
		                   
		
		Session session = null;		
		
		try {
//			============================Lazy & Eager Loading==============================
//			session=sf.openSession();		
//			Student std=session.get(Student.class, 2);//Eager Loading
//			System.out.println(std);
//			Student std=session.load(Student.class, 1);//deprecated method	//Lazy Loading 
//			Student std=session.getReference(Student.class, 3);//LazyLoading
//			System.out.println("Student ID-->"+std.getSid());
//			System.in.read();//pause execution till we press enter button
//			System.out.println("Student Name-->"+std.getSname());
//			System.out.println("Student City-->"+std.getScity());
			
			
			session=sf.openSession();
//			Student std=session.get(Student.class, 44);
//			Student std=session.load(Student.class, 44);
			Student std=session.getReference(Student.class, 55);
			if(std!=null) {
			//	System.out.println("Student ID-->"+std.getSid());
				System.out.println("Student Name-->"+std.getSname());
				System.out.println("Student City-->"+std.getScity());
			}
			else {
				System.out.println("There is No Record with given Id");
			}	
					
			
		}
		catch(HibernateException e) {
		     e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
			session.close();
			sf.close();
		}
		

	}

}
