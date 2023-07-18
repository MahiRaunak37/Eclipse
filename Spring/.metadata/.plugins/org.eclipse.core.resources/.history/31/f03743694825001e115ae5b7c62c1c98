package com.spring.shop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// Creating IoC Container
		BeanFactory bean1 = new FileSystemXmlApplicationContext(
				"D:\\Program Files\\Tools\\GITTLWs\\Spring_First_App\\first.xml");

		// Passing Product class bean id from first.xml
		Product poduct = (Product) bean1.getBean("product");
		OrderDetails od = (OrderDetails) bean1.getBean("order");

		System.out.println("**** Order Details ****");
		System.out.println("    Order Id : " + od.getOrderId());

		for (int i = 0; i < pd.getProdId().size(); i++) {
			System.out.println("Product Id : " + pd.getProdId().get(i));
			System.out.println("Product Name : " + pd.getProdName().get(i));
			System.out.println("Product Price : " + pd.getProdPrice().get(i));
		}

		System.out.println("Grand Total : " + od.getPrice());
		String status = "Order Delivered";
		if (od.getIsOrderDelivered() == false)
			status = "Not Delivered";
		System.out.println("Status : " + status);
	}
}