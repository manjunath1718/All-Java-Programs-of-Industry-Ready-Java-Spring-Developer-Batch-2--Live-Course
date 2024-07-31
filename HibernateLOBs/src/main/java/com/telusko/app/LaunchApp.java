package com.telusko.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.model.Student;

public class LaunchApp {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure()
		.addAnnotatedClass(Student.class).buildSessionFactory();
		                   	
		Session session = null;		
		Transaction transaction = null;
		boolean flag=false;
		byte[] image;
		char[] textFile;
		
		FileInputStream fis = null;
		FileReader fr = null;
		try {
				
			session=sf.openSession();
			transaction=session.beginTransaction();
			
			
			fis=new FileInputStream("D:\\htmlbyJBK\\kalogo.png");
            image= new byte[fis.available()];
            fis.read(image);
            
            File f=new File("C:\\Users\\betag\\OneDrive\\Documents\\QueriesOfEmpsLocsDeptsTbl.sql");
            fr=new FileReader(f);
            textFile=new char[(int) f.length()];
            fr.read(textFile);
            		
			Student std=new Student();
	 //     std.setSid(1); //If we using GeneratorValue annotation we don't have to specify Id(Primary key)
			std.setSname("Virat");
			std.setScity("Bengaluru");
			std.setImage(image);
			std.setTextFile(textFile);
			
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
				
				try {
					fis.close();
					fr.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
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
