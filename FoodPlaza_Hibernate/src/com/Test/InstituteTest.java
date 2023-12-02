package com.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import AnnotationDemo.Department;
import AnnotationDemo.Institute;



public class InstituteTest {
	public static void main(String[] args) {
		Configuration configure=new Configuration();//reads cfg and hbm file
		configure.configure();
		SessionFactory factory=configure.buildSessionFactory(); 
		
		Department dept=new Department();
		dept.setDeptname("Science");
		dept.setNoOfEmployee(4);
		
		Institute i=new Institute();
		i.setInsName("Squad");
		i.setBranch("vashi");
		
		dept.setIns(i);
		i.setDept(dept);
		
		Session session=factory.openSession();
		session.save(i);
		Transaction tx=session.beginTransaction();
		tx.commit();
		System.out.println("Added successfully");
	
	}

}
