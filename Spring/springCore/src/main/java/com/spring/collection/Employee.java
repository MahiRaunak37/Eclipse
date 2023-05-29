package com.spring.collection;

import java.util.*;

public class Employee {
	private String name;
	private Set<String> phone;
	private List<String> address;
	private Map<String, String> course;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getPhone() {
		return phone;
	}
	public void setPhone(Set<String> phone) {
		this.phone = phone;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	public Employee(String name, Set<String> phone, List<String> address, Map<String, String> course) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.course = course;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
