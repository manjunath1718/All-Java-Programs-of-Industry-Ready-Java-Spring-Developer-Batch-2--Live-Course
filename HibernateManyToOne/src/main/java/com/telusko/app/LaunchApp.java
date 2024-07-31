package com.telusko.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.model.AnswerTable;
import com.telusko.model.QuestionTable;



public class LaunchApp {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure()
		.buildSessionFactory();
		                   
		
		Session session = null;		
		Transaction transaction = null;
		boolean flag=false;
		try {
				
			session=sf.openSession();
			transaction=session.beginTransaction();
/*
 * Many-To-One Mapping refers to relation between 2 entities where Many instance of one entity
 * mapped to one instance of other entity
 * example==>One Question has multiple answers
 * 
 */
			QuestionTable question1=new QuestionTable();
			question1.setqId(1);
			question1.setqName("What is Hibernate?");
			
			AnswerTable answer1=new AnswerTable();
			answer1.setaId(1);
			answer1.setaName("Hibernate is ORM Tool");	
			answer1.setQuestion(question1);
			System.out.println("***************************************************************");		
			AnswerTable answer2=new AnswerTable();
			answer2.setaId(2);
			answer2.setaName("Implementation of JPA");	
			answer2.setQuestion(question1);
			System.out.println("***************************************************************");		
			
			session.persist(answer1);
			session.persist(answer2);
			
			flag = true;	
			
			AnswerTable aq1=session.get(AnswerTable.class, 1);
			System.out.println(aq1);
			AnswerTable aq2=session.get(AnswerTable.class, 2);
			System.out.println(aq2);
			
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
			
			session.close();
			sf.close();
		}

	}

}
