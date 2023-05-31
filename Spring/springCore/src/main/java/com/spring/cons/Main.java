package com.spring.cons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/cons/consConfig.xml");
		Person person = (Person)context.getBean("person");
		System.out.println(person);
		
		Addition addition =(Addition)context.getBean("addition");
		addition.doSum();

	}

}
