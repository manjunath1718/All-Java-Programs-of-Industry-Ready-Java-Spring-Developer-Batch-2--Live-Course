package com.telusko.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.model.Answer;
import com.telusko.model.Question;

import jakarta.persistence.CascadeType;



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
 * One-To-One Mapping is association between one persistence object and another one related 
 * persistence object.
 * If One persistence object uses other and in back if other is  using 1st persistence object
 * then it become bidirectional.
 */
			Question question1=new Question();
			question1.setqId(1);
			question1.setqName("What is Hibernate?");
			
			Answer answer1=new Answer();
			answer1.setaId(1);
			answer1.setaName("Hibernate is ORM Tool");
			question1.setAnswer(answer1);
			answer1.setQuestion(question1);
			System.out.println("***************************************************************");
			Question question2=new Question();
			question2.setqId(2);
			question2.setqName("What is JPA?");
			
			Answer answer2=new Answer();
			answer2.setaId(2);
			answer2.setaName("JPA is specification to store persist data"
					          +"between java object and relational database");
			question2.setAnswer(answer2);
			answer2.setQuestion(question2);
			System.out.println("***************************************************************");
			
			session.persist(question1);
			session.persist(question2);
			
//			session.persist(answer1);// saving answer1 optional bcz of cascade=CascadeType.ALL
//			session.persist(answer2);
			flag = true;	
			
//			Question qa=session.get(Question.class, 1);
//			System.out.println(qa);
			
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
