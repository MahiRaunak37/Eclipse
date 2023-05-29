package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collection/cconfig.xml");
		Employee employee =(Employee)context.getBean("student3");
		System.out.println(employee.getName());
		System.out.println(employee.getPhone());
		System.out.println(employee.getAddress());
		System.out.println(employee.getCourses());
	}

}
