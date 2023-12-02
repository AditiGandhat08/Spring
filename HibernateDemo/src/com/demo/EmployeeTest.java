package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class EmployeeTest {
	public void addEmployee() {
		Configuration configure=new Configuration();//reads cfg and hbm file
		configure.configure();
		SessionFactory factory=configure.buildSessionFactory(); //buildSessionFactory is used to creates table
//		if (factory!=null) {
//			System.out.println("Table created");
//		}
//		else {
//			System.out.println("Table creation failed");
//		}
		Session session=factory.openSession();
		Employee emp=new Employee(4,"Ram","Tester",20000);
		session.save(emp);
		Transaction tx=session.beginTransaction();
		tx.commit();
		System.out.println("Added successfully");
		
	}
	
	public void updateEmployee() {
		Configuration configure=new Configuration();//reads cfg and hbm file
		configure.configure();
		SessionFactory factory=configure.buildSessionFactory(); //buildSessionFactory is used to creates table
		Session session=factory.openSession();
		Employee emp=new Employee(4,"Rama","Trainee Accountant",30000);
		session.update(emp);
		Transaction tx=session.beginTransaction();
		tx.commit();
		System.out.println("Updated successfully");
		
	}
	public void deleteEmployee() {
		Configuration configure=new Configuration();//reads cfg and hbm file
		configure.configure();
		SessionFactory factory=configure.buildSessionFactory(); //buildSessionFactory is used to creates table
		Session session=factory.openSession();
		Employee emp=session.get(Employee.class, 4);
		session.delete(emp);
		Transaction tx=session.beginTransaction();
		tx.commit();
		System.out.println("Deleted successfully");
		
	}
	public void searchById() {
		Configuration configure= new Configuration();
		configure.configure();
		SessionFactory factory=configure.buildSessionFactory();
		Session session=factory.openSession();
		Employee emp=session.get(Employee.class, 1);
		System.out.println(emp);
	}
	public void getAllList() {
		Configuration configure=new Configuration();
		configure.configure();
		SessionFactory factory=configure.buildSessionFactory();
		Session session=factory.openSession();
		Query q=session.createQuery("FROM Employee");
		List<Employee> empList=q.list();
		//for(Employee emp:empList) {
			System.out.println(empList);
		//}
	}
	
	
public static void main(String[] args) {
		EmployeeTest t=new EmployeeTest();
		//t.addEmployee();
		//t.updateEmployee();
		//t.deleteEmployee();
		//t.searchById();
		t.getAllList();
}}
