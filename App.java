package com.hiberProject1Pract.HiberPractice1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		// student object create
		Student st = new Student();
		st.setsId(13);
		st.setsName("har har mahadev");
		st.setsCity("dev ghar");
		//System.out.println(st);

		// creating object of address class
		Address ad = new Address();
		ad.setaStreet("mirapatti");
		ad.setaCity("chhatapur");
		ad.setaIsOpenCity(true);
		ad.setAx(345.755);
		ad.setaDate(new Date());
		// Reading image
		/*
		 * FileInputStream fls = new FileInputStream("src/main/java.pic1.jpg"); byte[]
		 * data=new byte[fls.available()]; fls.read(data); ad.setaImage(data);
		 */
        
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(st);
		session.save(ad);
		session.getTransaction().commit();
		session.close();
	}
}
