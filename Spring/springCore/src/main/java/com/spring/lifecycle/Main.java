package com.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/lifecycle/config.xml"); 
		LifeCycle lifeCycle =(LifeCycle)applicationContext.getBean("lifeCycle1");
		System.out.println(lifeCycle);
		applicationContext.registerShutdownHook();
		
		System.out.println("---------------Init Destroy using Interface ---------------------");
		
		LifeCycleWithInterface lifeCycleWithInterface=(LifeCycleWithInterface)applicationContext.getBean("lifeCycleWithInterface");
		System.out.println(lifeCycleWithInterface);
		
		System.out.println("---------------Annotation @PostConstruct & @PreDestory ----------");
		LifeCycleAnno lifeCycleAnno = (LifeCycleAnno) applicationContext.getBean("lifeCycleAnno");
		System.out.println(lifeCycleAnno);
	}

}
