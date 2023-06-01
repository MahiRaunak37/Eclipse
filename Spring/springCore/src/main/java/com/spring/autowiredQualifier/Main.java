package com.spring.autowiredQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/spring/autowiredqualifier/config.xml");
		Employee employee = applicationContext.getBean("employee", Employee.class);
		System.out.println(employee);
	}
}
