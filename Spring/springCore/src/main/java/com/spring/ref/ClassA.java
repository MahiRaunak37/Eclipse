package com.spring.ref;

public class ClassA {
	private int x;
	ClassB classB;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public ClassB getClassB() {
		return classB;
	}
	public void setClassB(ClassB classB) {
		this.classB = classB;
	}
	public ClassA() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ClassA [x=" + x + ", classB=" + classB + "]";
	}
	
}
