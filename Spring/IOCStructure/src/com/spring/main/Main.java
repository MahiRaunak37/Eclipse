package com.spring.main;

/**
 * Simple working of Spring	
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.sbean.Demo;

public class Main {

	// step 1. Call the main method
	public static void main(String[] args) {
		// step 2. Load the applicationContext.xml (IOC container)
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Step 6. get the bean from the xml file using applicationcontext and typecast
		// into the Demo class.
		// Step 7. To receive the return from IOC Container we use reference of Object
		// class or beans class.
		Demo demo = (Demo) applicationContext.getBean("demo");
		// step 8. Call the method of the demo class
		// Step 10. Return value display by the output stream on console.
		System.out.println(demo.getName());

	}

}
