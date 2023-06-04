package com.spring.standAlone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/standAlone/config.xml");
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee);
		System.out.println(employee.getLang().getClass().getName());
		System.out.println(employee.getSalary());
		System.out.println(employee.getProperties());
	}
}
