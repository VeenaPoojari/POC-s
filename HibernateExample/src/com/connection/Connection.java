package com.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.employee;

public class Connection {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		employee employee = new employee();
				employee.setEname("admin");
				employee.setUname("admin");
				employee.setPassword("admin");

				System.out.println(employee.getEid() + "\t" + employee.getEname()
						+ "\t" + employee.getUname() + "\t" + employee.getPassword());
		

		//employee employee = session.load(employee.class, 3);
		
		
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		//session.delete(employee);
		transaction.commit();

		session.close();
		sessionFactory.close();

	}
}



//session.save(employee);						 //insert into database
		//session.update(employee);						//update into database