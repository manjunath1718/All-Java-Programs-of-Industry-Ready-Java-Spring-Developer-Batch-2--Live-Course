package com.telusko.app;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.model.Course;
import com.telusko.model.Student;

public class LaunchApp {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure()
		.buildSessionFactory();
		                   
		
		Session session = null;		
//		Transaction transaction = null;
		boolean flag=false;
		try {
				
			session=sf.openSession();
//			transaction=session.beginTransaction();
/*
 * Many-To-Many Mapping refers to relation between 2 entities where Many instance of one entity
 * mapped to one or many instance of other entity
 * example==>Many Students has taken many courses
 * 
 */
//			Course c1=new Course();
//			c1.setcId(1);
//			c1.setcName("corejava");
//			
//			Course c2=new Course();
//			c2.setcId(2);
//			c2.setcName("hibernate");
//			
//			Course c3=new Course();
//			c3.setcId(3);
//			c3.setcName("spring");
//			
//			Set<Course> cSet1=new HashSet<>();
//			cSet1.add(c1);
//			cSet1.add(c2);
//			cSet1.add(c3);
//			
//			Set<Course> cSet2=new HashSet<>();
//			cSet2.add(c1);
//			cSet2.add(c2);
//			
//			Set<Course> cSet3=new HashSet<>();
//			cSet3.add(c1);			
//			
//			Student s1=new Student();
//			s1.setsId(1);
//			s1.setsName("Rohan");
//			s1.setsCity("Bengaluru");
//			s1.setCourses(cSet1);
//			
//			Student s2=new Student();
//			s2.setsId(2);
//			s2.setsName("Darshan");
//			s2.setsCity("Mysore");
//			s2.setCourses(cSet2);
//			
//			Student s3=new Student();
//			s3.setsId(3);
//			s3.setsName("Kishan");
//			s3.setsCity("Pune");
//			s3.setCourses(cSet3);	
//			
//			session.persist(s1);
//			session.persist(s2);
//			session.persist(s3);
//			flag = true;
			
			Student student = session.get(Student.class, 1);
			System.out.println(student);
			
		}
		catch(HibernateException e) {
		     e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
//			if(flag) {
//				transaction.commit();
//			}
//			else {
//				transaction.rollback();
//			}
			
			session.close();
			sf.close();
		}

	}

}
