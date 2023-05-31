package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleAnno {
	private String empAddress;

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public LifeCycleAnno() {
		super();
	}

	@Override
	public String toString() {
		return "LifeCycleAnno [empAddress=" + empAddress + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("Starting of the method Of Annotation");
	}
	@PreDestroy
	public void distroy() {
		System.out.println("Ending of the Method of Annotation");
	}
	

}
