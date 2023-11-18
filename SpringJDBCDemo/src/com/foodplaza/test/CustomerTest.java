package com.foodplaza.test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.foodplaza.dao.*;
import com.foodplaza.pojo.Customer;
import com.foodplaza.pojo.Food;
public class CustomerTest {

	public static void main(String[] args) {
		int cid,contact;
		String name,emailid,address,password;
		ApplicationContext context=new ClassPathXmlApplicationContext("Customer.xml");
		CustomerDAO_impl cdao=context.getBean(CustomerDAO_impl.class);
		Scanner sc=new Scanner(System.in);
		InputStreamReader str= new InputStreamReader(System.in);
		BufferedReader rd=new BufferedReader(str);
		boolean b;
		while(true) {
			System.out.println("1.Add Customer\n2.Update Customer\n3.Delete Customer\n4.Show all\n5.Search Customer By emailid");
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Customer Id");
				cid=sc.nextInt();
				System.out.println("Enter Name");
				name=sc.next();
				System.out.println("Enter Email id");
				emailid=sc.next();
				System.out.println("Enter Password");
				password=sc.next();
				System.out.println("Enter Address");
				address=sc.next();
				System.out.println("Enter Contact Number");
				contact=sc.nextInt();
				Customer customer= new Customer(cid,name,emailid,password,address,contact);
				b=cdao.addCustomer(customer);
				if(b) {
					System.out.println("Sucess");
				}else {
					System.out.println("Error");
				}
				break;
			case 2:
				System.out.println("Enter the Email Id to update");
				emailid=sc.next();
				System.out.println("Enter Customer Id");
				cid=sc.nextInt();
				System.out.println("Enter Name");
				name=sc.next();
				System.out.println("Enter Email id");
				emailid=sc.next();
				System.out.println("Enter Password");
				password=sc.next();
				System.out.println("Enter Address");
				address=sc.next();
				System.out.println("Enter Contact Number");
				contact=sc.nextInt();
				Customer customer= new Customer(cid,name,emailid,password,address,contact);
				b=cdao.addCustomer(customer);
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
}