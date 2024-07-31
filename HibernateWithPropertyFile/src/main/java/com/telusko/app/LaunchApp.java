package com.telusko.app;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.model.Student;



public class LaunchApp {

	public static void main(String[] args) {
		
		Configuration config=null;
		SessionFactory sf=null;
		Session session = null;
		Transaction transaction=null;
		boolean flag=false;
		/*Configuration using hibernate.properties file.
		 *In this approach we don't able provide mapping class details in hibernate.properties file.
		 * when we create Configuration object internally this object will look for 
		 * hibernate.properties file so we don;t have to invoke configure() method
		 */
		config=new Configuration();
				
		config.addAnnotatedClass(Student.class);
		
		sf=config.buildSessionFactory();
		session=sf.openSession();
		
		
		Student student=new Student();
		student.setSid(6);
		student.setSname("hardhik");
		student.setScity("ahmedabad");
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
