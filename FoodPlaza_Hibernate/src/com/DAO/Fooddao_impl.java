package com.DAO;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


import com.pojo.FoodPojo;

public class Fooddao_impl implements Fooddao {

	@Override
	public boolean addFood(FoodPojo food) {
		Configuration configure=new Configuration();
		configure.configure();
		SessionFactory factory=configure.buildSessionFactory();
		Session session=factory.openSession();
		session.save(food);
		Transaction tx=session.beginTransaction();
		tx.commit();
		System.out.println("Added successfully");
		return true;
	}

	@Override
	public boolean updateFoodById(FoodPojo food) {
		Configuration configure=new Configuration();//reads cfg and hbm file
		configure.configure();
		SessionFactory factory=configure.buildSessionFactory(); //buildSessionFactory is used to creates table
		Session session=factory.openSession();
		session.update(food);
		Transaction tx=session.beginTransaction();
		tx.commit();
		System.out.println("Updated successfully");
		return true;
	}

	@Override
	public boolean deleteFoodById(int foodid) {
		Configuration configure=new Configuration();//reads cfg and hbm file
		configure.configure();
		SessionFactory factory=configure.buildSessionFactory(); //buildSessionFactory is used to creates table
		Session session=factory.openSession();
		FoodPojo f=session.get(FoodPojo.class, foodid);
		session.delete(f);
		Transaction tx=session.beginTransaction();
		tx.commit();
		System.out.println("Deleted successfully");
		return true;
	}

	@Override
	public List<FoodPojo> getAllFood() {
		Configuration configure=new Configuration();
		configure.configure();
		SessionFactory factory=configure.buildSessionFactory();
		Session session=factory.openSession();
		Query q=session.createQuery("FROM FoodPojo");
		List<FoodPojo> FoodList=q.list();
		System.out.println(FoodList);
		
		return null;
	}

	@Override
	public FoodPojo searchFoodById(int foodId) {
		Configuration configure= new Configuration();
		configure.configure();
		SessionFactory factory=configure.buildSessionFactory();
		Session session=factory.openSession();
		FoodPojo f=session.get(FoodPojo.class, foodId);
		System.out.println(f);
		return null;
	}

}
