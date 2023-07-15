package com.spring.ListSum;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ListSum/config.xml");
		Product product = (Product) context.getBean("product");

		System.out.println(product.getProductName());
		System.out.println(product.getPrice());
		List<Integer> listPrice = product.getPrice();
		int sum = 0;
		for (int i = 0; i < listPrice.size(); i++) {
			sum += listPrice.get(i);
		}
		System.out.println(sum);

	}

}
