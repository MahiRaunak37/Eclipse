package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new  ClassPathXmlApplicationContext("com/spring/ref/refConfig.xml");
		ClassA classA =(ClassA)context.getBean("classAref");
		
		System.out.println(classA.getX());
		System.out.println(classA.classB.getY());
		System.out.println(classA);
	}
}
