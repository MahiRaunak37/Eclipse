package com.spring.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/component/config.xml");
		Student student = applicationContext.getBean("std", Student.class);
		System.out.println(student);

	}

}
