package com.demo;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class HelloWorldtest {

	public static void main(String[] args) 
	{
		Resource rs= new ClassPathResource("sprin_1.xml");
		BeanFactory factory= new XmlBeanFactory(rs);
		HelloWorld hw= factory.getBean(HelloWorld.class);
		hw.msg();
		
		
		
	

	}

}
