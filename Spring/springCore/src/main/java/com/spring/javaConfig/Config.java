package com.spring.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.javaConfig")
public class Config {
	@Bean
	public Roll getRoll() {
		Roll roll = new Roll();
		return roll;
	}

	@Bean(name = { "getTest", "test", "t" })
	public Test getTest() {
		Test test = new Test(getRoll());
		return test;
	}
}
