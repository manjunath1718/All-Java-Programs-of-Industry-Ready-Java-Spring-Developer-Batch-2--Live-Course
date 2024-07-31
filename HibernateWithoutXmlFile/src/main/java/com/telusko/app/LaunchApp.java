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
		/*Java Code Approach but this is not good approach bcz if we want to change anything for
		 * example we want to change database we have to recompile whole java code and we have
		 * to re-deploy application
		 */
		config=new Configuration();
		config.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/t_db");
		config.setProperty("hibernate.connection.username", "root");
		config.setProperty("hibernate.connection.password", "root");		
		config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		config.setProperty("hibernate.hbm2ddl.auto", "update");
		config.setProperty("hibernate.show_sql", "true");
		config.setProperty("hibernate.format_sql", "true");
		
		config.addAnnotatedClass(Student.class);
		
		sf=config.buildSessionFactory();
		session=sf.openSession();
		
		
		Student student=new Student();
		student.setSid(5);
		student.setSname("rishabh");
		student.setScity("delhi");
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
