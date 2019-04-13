package com.shadab;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
	public static void main(String[] args) {
		
		//Method1
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//Method2
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		

		//Method3
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory context = new XmlBeanFactory(resource);
		
		Student s = (Student)context.getBean("student");
		s.setRollno(101);
		s.setName("shadab");

		System.out.println(s.getRollno());
		System.out.println(s.getName());
	}
}
