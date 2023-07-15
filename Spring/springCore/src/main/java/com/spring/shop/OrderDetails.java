package com.spring.shop;

public class OrderDetails {
	private int orderId;
	private int price;
	boolean isOrderDelivered;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isOrderDelivered() {
		return isOrderDelivered;
	}

	public void setOrderDelivered(boolean isOrderDelivered) {
		this.isOrderDelivered = isOrderDelivered;
	}

	public OrderDetails(int orderId, int price, boolean isOrderDelivered) {
		super();
		this.orderId = orderId;
		this.price = price;
		this.isOrderDelivered = isOrderDelivered;
	}

	public OrderDetails() {
		super();
	}

}