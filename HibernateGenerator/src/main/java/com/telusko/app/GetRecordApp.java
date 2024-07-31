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
		Transaction transaction = null;
		boolean flag=false;
		try {
				
			session=sf.openSession();
			transaction=session.beginTransaction();

			Student std=new Student();
	 //     std.setSid(1); //If we using GeneratorValue annotation we don't have to specify Id(Primary key)
			std.setSname("kishan");
			std.setScity("mumbai");
			session.persist(std);
			flag = true;	
		}
		catch(HibernateException e) {
		     e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
			if(flag) {
				transaction.commit();
			}
			else {
				transaction.rollback();
			}
			
			session.close();
			sf.close();
		}
		

	}

}
