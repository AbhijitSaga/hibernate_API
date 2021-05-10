package com.hiberProject1Pract.HiberPractice1;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbdedDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Student student = new Student();
		student.setsId(1001);
		student.setsName("pankaj kumar");
		student.setsCity("supaul,Bihar");
		Certificate certificate = new Certificate();
		certificate.setcCourse("Android");
		certificate.setcDuration("4 mounths");
		student.setCerti(certificate);

		Student student1 = new Student();
		student1.setsId(1002);
		student1.setsName("amrit kumar");
		student1.setsCity("chhatapur,supaul");
		Certificate certificate1 = new Certificate();
		certificate1.setcCourse("webDevelopment");
		certificate1.setcDuration("6 mounths");
		student.setCerti(certificate1);

		Session se=factory.openSession();
		Transaction tx=se.beginTransaction();
		//object save
		se.save(student);
		se.save(student1);
		tx.commit();
		factory.close();
	}

}
