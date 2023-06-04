package com.spring.spEL.methVar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/spring/spEL/methVar/config.xml");
		Test test = applicationContext.getBean("test", Test.class);
		System.out.println(test);

	}

}
