package com.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import AnnotationDemo.Customer;

public class Customerdao_impl implements Customerdao{

	@Override
	public boolean addCustomer(Customer cus) {
		Configuration configure=new Configuration();
		configure.configure();
		SessionFactory factory=configure.buildSessionFactory();
		Session session=factory.openSession();
		session.save(cus);
		Transaction tx=session.beginTransaction();
		tx.commit();
		System.out.println("Added successfully");
		return true;
	}

	@Override
	public boolean updateCustomerById(Customer cus) {
		Configuration configure=new Configuration();//reads cfg and hbm file
		configure.configure();
		SessionFactory factory=configure.buildSessionFactory(); //buildSessionFactory is used to creates table
		Session session=factory.openSession();
		session.update(cus);
		Transaction tx=session.beginTransaction();
		tx.commit();
		System.out.println("Updated successfully");
		return true;
	}

	@Override
	public boolean deleteCustomerById(int cid) {
		Configuration configure=new Configuration();//reads cfg and hbm file
		configure.configure();
		SessionFactory factory=configure.buildSessionFactory(); //buildSessionFactory is used to creates table
		Session session=factory.openSession();
		Customer c=session.get(Customer.class, cid);
		session.delete(c);
		Transaction tx=session.beginTransaction();
		tx.commit();
		System.out.println("Deleted successfully");
		return true;
	}

	@Override
	public List<Customer> getAllCustomer() {
		Configuration configure=new Configuration();
		configure.configure();
		SessionFactory factory=configure.buildSessionFactory();
		Session session=factory.openSession();
		Query q=session.createQuery("FROM Customer");
		List<Customer> FoodList=q.list();
		System.out.println(FoodList);
		
		return null;
		
	}

	@Override
	public Customer searchCustomerById(int cusId) {
		Configuration configure= new Configuration();
		configure.configure();
		SessionFactory factory=configure.buildSessionFactory();
		Session session=factory.openSession();
		Customer c=session.get(Customer.class, cusId);
		System.out.println(c);
		return null;
	}

}
