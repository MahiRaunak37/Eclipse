package com.spring.cons;
public class Addition {
	private int a;
	private int b;
	
	public Addition(int a, int b) {
		this.a =a;
		this.b=b;
		System.out.println("Constructor: int , int");
	}
	
	public Addition(double a, double b) {
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor: double, double");
	}
	
	public Addition(String s1, String s2) {
		this.a = Integer.parseInt(s1);
		this.b = Integer.parseInt(s2);
		System.out.println("Constructor: String, String");
	}
	
	public void doSum() {
		System.out.println("value of a:- "+this.a+"Value of b:- "+this.b);
		System.out.println("Sum is "+(this.a+this.b));
 	}
	
}
