package com.demo;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Hellotest {

	public static void main(String[] args) {
		
		Resource rs= new ClassPathResource("spring.xml");//to read xml file
		BeanFactory factory=new XmlBeanFactory(rs);//to start the container
		hello h= factory.getBean(hello.class);//obj gets created
		

	}

}
/*Disadvantage
 * BeanFactory is lazy loader.
 * it creates object when it gets first request
 * It is a singleton class. it creates the class only once when it get the first request
*/
