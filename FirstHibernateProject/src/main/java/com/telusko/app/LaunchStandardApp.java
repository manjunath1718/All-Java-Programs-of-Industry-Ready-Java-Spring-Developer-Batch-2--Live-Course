package com.telusko.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.model.Student;

public class LaunchStandardApp {

	public static void main(String[] args) {
		
		Configuration config=null;
		SessionFactory sf=null;
		Session session = null;
		Transaction transaction=null;
		boolean flag=false;
		
		config=new Configuration();
		config.configure();
		sf=config.buildSessionFactory();
		session=sf.openSession();
		
		
		Student student=new Student();
		student.setSid(3);
		student.setSname("dhoni");
		student.setScity("ranchi");
		try {					
			transaction=session.beginTransaction();
			session.persist(student);
			flag=true;			
		}
		catch(HibernateException e) {
			e.getMessage();
		}
		catch(Exception e) {
			e.getMessage();
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
