package com.hiberProject1Pract.HiberPractice1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		// get-student data: id=8
		Student s = (Student) session.load(Student.class, 16);
		System.out.println(s);
		Address a = (Address) session.load(Address.class, 3);
		System.out.println(a.getaStreet() + " " + a.getaCity());

		session.close();
		factory.close();
	}
}
