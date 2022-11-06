package org.gorl.main;

import org.gorl.bean.Kiruba;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class KirubaMain {

	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory factory =  cf.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Kiruba obj = new Kiruba(2, "kavuthami", "female");
		session.save(obj);
		System.out.println(obj);
		
		
		transaction.commit();
		
		session.close();factory.close();

	}

}
