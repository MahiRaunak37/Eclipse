package com.spring.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/autowired/config.xml");
		Employee employee = applicationContext.getBean("employee2", Employee.class);
		System.out.println(employee);
	}
}
