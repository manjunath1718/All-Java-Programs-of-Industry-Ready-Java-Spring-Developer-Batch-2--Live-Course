package com.telusko.app;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.telusko.model.Student;

public class LOBRetrievalApp {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure()
				.addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = null;				
		
		FileOutputStream fos = null;
		FileWriter fw = null;
		try {

			session=sf.openSession();
			
			fos=new FileOutputStream("Java.png");
			fw=new FileWriter("Queries.sql");
			
			Student student=session.get(Student.class, 1);
			
			fos.write(student.getImage());
			
			fw.write(student.getTextFile());
			
				
		}
		catch(HibernateException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
				try {
					fos.close();
					fw.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
				session.close();
				sf.close();
				
			}
			

	}

}
