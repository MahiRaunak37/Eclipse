package com.spring.spEL.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/spEL/object/config.xml");
		Test test = applicationContext.getBean("test", Test.class);
		System.out.println(test);
	}

}
