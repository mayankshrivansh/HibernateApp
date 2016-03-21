package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Student_Info student = new Student_Info();
		
		student.setName("Harshit");
		//student.setRoll_no(821);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(student);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}

}
