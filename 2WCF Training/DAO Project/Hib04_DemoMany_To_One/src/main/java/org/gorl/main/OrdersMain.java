package org.gorl.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OrdersMain 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		String hql = "from Orders where o_person.p_name like: person";
		//String hql = "from Orders where o_person.p_id = person";
		Query query = session.createQuery(hql);
		query.setParameter("person", "Manager");
		
		List list = query.list();
		/*for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		System.out.println("----------");
		list.forEach(System.out::println);
		System.out.println(list);*/
		for(Object obj:list)
			System.out.println(obj);
		
		transaction.commit();
		session.close();
		factory.close();
	}
}
