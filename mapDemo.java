package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mapDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		// creating question
		/*
		 * Question qu = new Question(); qu.setQuestionId(1212);
		 * qu.setQuestion("what is java ?");
		 * 
		 * // creating answer Answer an1 = new Answer(); an1.setAnswerId(33);
		 * an1.setAnswer("java programming language");
		 * 
		 * Answer an2 = new Answer(); an2.setAnswerId(334);
		 * an2.setAnswer("with help of java we can create softwear");
		 * 
		 * Answer an3 = new Answer(); an3.setAnswerId(343);
		 * an3.setAnswer("java is low level programing language"); List<Answer> list =
		 * new ArrayList<Answer>(); list.add(an1); list.add(an2); list.add(an3);
		 * qu.setAnswer(list);
		 */
		// session
		Session session = factory.openSession();
		Transaction txt = session.beginTransaction();
		// save
		/*
		 * session.save(qu); session.save(an1); session.save(an2); session.save(an3);
		 */
		
		Question q=(Question)session.get(Question.class,1212 );
		System.out.println(q.getQuestion());
		for(Answer a : q.getAnswers()) {
			System.out.println(a.getAnswer());
		}
		txt.commit();
		session.close();
		factory.close();
	}
}
