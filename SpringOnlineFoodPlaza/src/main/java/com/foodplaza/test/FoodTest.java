package com.foodplaza.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.foodplaza.dao.Fooddao;
import com.foodplaza.pojo.Food;

public class FoodTest {

	public static void main(String[] args) {
		int foodid;
		String foodname, foodtype,foodcategory;
		double price;
		ApplicationContext context=new ClassPathXmlApplicationContext("foodplaza.xml");
		Fooddao fdi=context.getBean(Fooddao.class);
		Scanner sc=new Scanner(System.in);
		InputStreamReader str= new InputStreamReader(System.in);
		BufferedReader rd=new BufferedReader(str);
		boolean b;
		while(true) {
			System.out.println("1.Add Food\n2.Update Food\n3.Delete Food\n4.Show all\n5.Search Food By Id");
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Name");
				foodname=sc.next();
				System.out.println("Enter the type");
				foodtype=sc.next();
				System.out.println("Enter the category");
				foodcategory=sc.next();
				System.out.println("Enter the price");
				price=sc.nextDouble();
				Food food=new Food(foodname,foodtype,foodcategory,price);
				b=fdi.addFood(food);
				if(b) {
					System.out.println("Sucess");
				}else {
					System.out.println("Error");
				}
				break;
			case 2:
				System.out.println("Enter the Food id to update");
				foodid=sc.nextInt();
				System.out.println("Enter Name");
				foodname=sc.next();
				System.out.println("Enter the type");
				foodtype=sc.next();
				System.out.println("Enter the category");
				foodcategory=sc.next();
				System.out.println("Enter the price");
				price=sc.nextDouble();
				Food food1=new Food(foodname,foodtype,foodcategory,price);
				food1.setFoodid(foodid);
				b=fdi.updateFoodById(food1);
				if(b) {
					System.out.println("Sucess");
				}else {
					System.out.println("Error");
				}
				break;
			
			case 3:
				System.out.println("Enter the Food id to delete");
				foodid=sc.nextInt();
				b=fdi.deleteFoodById(foodid);
				if(b) {
					System.out.println("Sucess");
				}else {
					System.out.println("Error");
				}
				break;
			case 4:
				System.out.println("Show All Food");
				food=new Food();
				List<Food> foodlist=fdi.getAllFood();
				Iterator<Food> it= foodlist.iterator();
				   while(it.hasNext()) {
					   System.out.println(it.next());
				   }
				   break;
				
			case 5:
				System.out.println("Search food by Id");
				foodid=sc.nextInt();
				food=fdi.searchFoodById(foodid);
				System.out.println(food);
				
				
			}
		}
	
	
	}

}