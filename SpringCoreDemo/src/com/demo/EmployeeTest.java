//JEE Container
package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("employee.xml");
		Employee emp=context.getBean(Employee.class);
		

	}

}
/*ApplicationContext container is early loader
 * It creates all object when container gets start i.e without calling getbean the o/p will be seen
 * the object scope of applicationcontext is prototype
 * 
 */
