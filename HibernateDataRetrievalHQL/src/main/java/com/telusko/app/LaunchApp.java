package com.telusko.app;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.telusko.model.Student;

public class LaunchApp {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure()
				         .addAnnotatedClass(Student.class).buildSessionFactory();		 
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		int noOfRowsAffected = 0;
		boolean flag = false;
	try {
				
//		Query<Student> query = session.createQuery("from Student",Student.class);
//		List<Student> list = query.list();		
//		for(Student student:list) {
//			System.out.println(student);
//		}
//		list.forEach(s->System.out.println(s));
		
//		Query<Student> query = session.createQuery("from Student where scity=:city",Student.class);
//		query.setParameter("city", "delhi");
//		List<Student> list = query.list();		
//		list.forEach(s->System.out.println(s));
		
		
//		Query<String> query = session.createQuery("select sname from Student where scity=:city",String.class);
//		query.setParameter("city", "delhi");
//		List<String> list = query.list();		
//		list.forEach(s->System.out.println(s));
		
//		Query<String> query = session.createQuery("select sname from Student where scity in(:city1,:city2)",String.class);
//		query.setParameter("city1", "delhi");
//		query.setParameter("city2", "BLR");
//		List<String> list = query.list();		
//		list.forEach(s->System.out.println(s));
		
//		MutationQuery query = session.createMutationQuery("update Student set scity=:city where sname=:name ");
//		query.setParameter("city", "pune");
//		query.setParameter("name", "rohit");
//		noOfRowsAffected=query.executeUpdate();
		
		noOfRowsAffected = session.createMutationQuery("delete from Student where sid=:id ")
		.setParameter("id",105 ).executeUpdate();
		
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
				System.out.println("No of Rows Affected "+noOfRowsAffected);
			}else {
				transaction.rollback();
				System.out.println("No Rows Affected ");
			}
			
			sf.close();
			session.close();
			
		}
	}

}
