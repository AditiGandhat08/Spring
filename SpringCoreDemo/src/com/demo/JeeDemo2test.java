package com.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class JeeDemo2test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("jeedemo2.xml");
		JeeDemo2 j=context.getBean(JeeDemo2.class);

	}

}
