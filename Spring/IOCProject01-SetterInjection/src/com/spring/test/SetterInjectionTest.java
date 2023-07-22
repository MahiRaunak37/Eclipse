package com.spring.test;

/**
 * Step 1. main Method class called.
 */
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.sbeans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		// Step 2. create a IOC container and called xml file with full path and load
		// xml class
		// ApplicationContext applicationContext = new
		// ClassPathXmlApplicationContext("com/spring/config/applicationContext.xml");
		// Object object = applicationContext.getBean("wmg");

		// Step 2. create a IOC container and called xml file with full path and load
		// xml class
		FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext(
				"src/com/spring/config/applicationContext.xml");
		Object object = fileSystemXmlApplicationContext.getBean("wmg");
		WishMessageGenerator wishMessageGenerator = (WishMessageGenerator) object;
		String result = wishMessageGenerator.generateWishMessage("raunak");
		System.out.println(result);

	}

}
