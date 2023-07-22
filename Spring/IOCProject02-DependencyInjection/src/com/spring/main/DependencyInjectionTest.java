package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object object = applicationContext.getBean("wmg");
		WishMessageGenerator wishMessageGenerator = (WishMessageGenerator) object;
		String result = wishMessageGenerator.generateWishMessage("raunak");
		System.out.println(result);

	}

}
