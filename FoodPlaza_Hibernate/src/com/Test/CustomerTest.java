package com.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import com.DAO.Customerdao_impl;
import AnnotationDemo.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		int cid;
		String name,email,password;
		int contact;
		Customerdao_impl cip=new Customerdao_impl();
		Scanner sc=new Scanner(System.in);
		InputStreamReader str= new InputStreamReader(System.in);
		BufferedReader rd=new BufferedReader(str);
		boolean b;
		while(true) {
			System.out.println("1.Add Customer\n2.Update Customer\n3.Delete Customer\n4.Show all\n5.Search Customer By Id");
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Name");
				name=sc.next();
				System.out.println("Enter the email");
				email=sc.next();
				System.out.println("Enter the password");
				password=sc.next();
				System.out.println("Enter the contact");
				contact=sc.nextInt();
				Customer cus=new Customer(name,email, password,contact);
				b=cip.addCustomer(cus);
				if(b) {
					System.out.println("Success");
				}else {
					System.out.println("Error");
				}
				break;
			case 2:
				System.out.println("Enter Name");
				name=sc.next();
				System.out.println("Enter the email");
				email=sc.next();
				System.out.println("Enter the password");
				password=sc.next();
				System.out.println("Enter the contact");
				contact=sc.nextInt();
				Customer cus1=new Customer(name,email, password,contact);
				//cus1.setCid(cus);
				b=cip.updateCustomerById(cus1);
				if(b) {
					System.out.println("Sucess");
				}else {
					System.out.println("Error");
				}
				break;
//			
//			case 3:
//				System.out.println("Enter the Food id to delete");
//				foodid=sc.nextInt();
//				b=fdi.deleteFoodById(foodid);
//				if(b) {
//					System.out.println("Sucess");
//				}else {
//					System.out.println("Error");
//				}
//				break;
//			case 4:
//				System.out.println("Show All Food");
//				food=new FoodPojo();
//				List<FoodPojo> foodlist=fdi.getAllFood();
//				Iterator<FoodPojo> it= foodlist.iterator();
//				   while(it.hasNext()) {
//					   System.out.println(it.next());
//				   }
//				   break;
////				
//			case 5:
//				System.out.println("Search food by Id");
//				foodid=sc.nextInt();
//				food=fdi.searchFoodById(foodid);
//				System.out.println(food);
//				
//				
			}
		}
	
	

	}

}
