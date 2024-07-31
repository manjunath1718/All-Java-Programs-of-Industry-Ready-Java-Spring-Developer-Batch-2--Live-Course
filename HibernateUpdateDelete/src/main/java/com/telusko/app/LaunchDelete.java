package com.telusko.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.telusko.model.Student;

public class LaunchDelete {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure()
				              .addAnnotatedClass(Student.class).buildSessionFactory();				                             

		Session session;
		Transaction transaction = null;
		boolean flag = false;
		try {
			session=sf.openSession();
			transaction = session.beginTransaction();
			
			Student s=new Student();
			s.setSid(4);
			s.setSname("sachin");
			s.setScity("mumbai");
			
//			session.delete(s);
            session.remove(s);			
			flag=true;
			
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
		}
	}

}
