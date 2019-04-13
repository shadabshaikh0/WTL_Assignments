package com.shadab;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("application.xml");
		BeanFactory context = new XmlBeanFactory(resource);
		
		Employee employee = (Employee)context.getBean("employee");
		employee.setEid(101);
		employee.setEname("Shadab");
		
		Employee employee1 = (Employee)context.getBean("employee");
		employee1.setEid(101);
		employee1.setEname("Shadab");
		
		System.out.println(employee);
		System.out.println(employee1);
		
	}
}
