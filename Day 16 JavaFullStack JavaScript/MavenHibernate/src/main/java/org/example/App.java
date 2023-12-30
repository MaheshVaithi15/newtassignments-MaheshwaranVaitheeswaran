package org.example;

import org.example.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Users.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			Users user = new Users(10,"Jai");
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			System.out.println("Added Successfully");
			
		}
		finally {
			session.close();
			factory.close();
		}
		
	}

}
