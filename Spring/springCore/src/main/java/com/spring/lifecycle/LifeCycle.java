package com.spring.lifecycle;

public class LifeCycle {
	private int empId;
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public LifeCycle() {
		super();
	}
	@Override
	public String toString() {
		return "LifeCycle [empId=" + empId + ", empName=" + empName + "]";
	}
	
	public void init() {
		System.out.println("Inside the Init Method of XML");
	}
	
	public void destroy() {
		System.out.println("Destroying the Mehthod of XML");
	}
	
}
