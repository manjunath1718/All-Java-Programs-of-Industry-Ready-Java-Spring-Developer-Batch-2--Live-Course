package com.telusko.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.model.Employee1;

public class LaunchSelective {

	public static void main(String[] args) {

		SessionFactory sf=new Configuration().configure()
				.addAnnotatedClass(Employee1.class).buildSessionFactory();				                             

		Session session;
		Transaction transaction = null;
		boolean flag = false;
		try {
			session=sf.openSession();
			transaction = session.beginTransaction();

			Employee1 e=new Employee1();
			e.seteId(1);
			e.seteName("Raj");
			e.seteCity("BLR");//this column not added because of @Transient annotation
			e.seteAge(18);

			session.persist(e);
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
