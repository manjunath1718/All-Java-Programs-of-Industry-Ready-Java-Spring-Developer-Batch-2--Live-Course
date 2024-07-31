package com.telusko.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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

//			QuestionTable question1=new QuestionTable();
//			question1.setqId(1);
//			question1.setqName("What is Hibernate?");
//			
//			AnswerTable answer1=new AnswerTable();
//			answer1.setaId(1);
//			answer1.setaName("Hibernate is ORM Tool");
//			answer1.setQuestion(question1);
//			System.out.println("***************************************************************");		
//			AnswerTable answer2=new AnswerTable();
//			answer2.setaId(2);
//			answer2.setaName("Implementation of JPA");	
//			answer2.setQuestion(question1);
//			System.out.println("***************************************************************");
//			List<AnswerTable> alist=new ArrayList<AnswerTable>();
//			alist.add(answer1);
//			alist.add(answer2);
//			
//			question1.setAnswerList(alist);
//			session.persist(question1);
//			
//			flag = true;	
			
			QuestionTable qa=session.get(QuestionTable.class, 1);
		
			System.out.println(qa.getqName());
			qa.getAnswerList().forEach(a->System.out.println(a.getaName()));
					
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
