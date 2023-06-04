package com.spring.autowiredAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired
	@Qualifier("address2")
	// <bean class="com.spring.autowiredAnno.Employee" name="employee"
	// autowire="byType"/>
	private Address address;

	public Address getAddress() {
		return address;
	}

	// @Autowired
	// <bean class="com.spring.autowiredAnno.Employee" name="employee"
	// autowire="byName"/>
	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	// @Autowired
	// <bean class="com.spring.autowiredAnno.Employee" name="employee"
	// autowire="constructor"/>
	public Employee(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
