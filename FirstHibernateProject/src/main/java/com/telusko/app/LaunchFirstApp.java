package com.telusko.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.model.Student;

public class LaunchFirstApp {

	public static void main(String[] args) {
		// Create Configuration object
		Configuration config=new Configuration();
		
		//configure hibernate.cfg.xml file to Configuration object
		config.configure();
		
		//Create SessionFactory object
		SessionFactory sf = config.buildSessionFactory();
		
		//Getting session object from SessionFactory
		Session session = sf.openSession();
		
		//Begin Transaction within Session
		Transaction transaction = session.beginTransaction();
		
		//Perform Operation
		Student s=new Student();
		s.setSid(105);
		s.setSname("raghu");
		s.setScity("mumbai");
		session.save(s);
		
		//Perform Transaction Operation
		transaction.commit();

		//close Session
		session.close();
	}

}
