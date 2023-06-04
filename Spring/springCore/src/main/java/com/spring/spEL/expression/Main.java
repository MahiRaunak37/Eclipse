package com.spring.spEL.expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/spring/spEL/expression/config.xml");
		Test test = applicationContext.getBean("test", Test.class);
		System.out.println(test);

	}

}
