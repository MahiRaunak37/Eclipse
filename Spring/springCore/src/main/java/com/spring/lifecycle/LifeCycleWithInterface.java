package com.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleWithInterface implements InitializingBean, DisposableBean{
	private double empId;

	public double getEmpId() {
		return empId;
	}

	public void setEmpId(double empId) {
		this.empId = empId;
	}

	public LifeCycleWithInterface() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initialing the method of Interface");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Distroying the Method of Interface");
		
	}

	@Override
	public String toString() {
		return "LifeCycleWithInterface [empId=" + empId + "]";
	}
}
