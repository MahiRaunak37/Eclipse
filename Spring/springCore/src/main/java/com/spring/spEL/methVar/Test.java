package com.spring.spEL.methVar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("test")
class Test {
	private int count;
	private double pi;
	private double e;

	public int getCount() {
		return count;
	}

	@Value("#{22+44}")
	public void setCount(int count) {
		this.count = count;
	}

	public double getPi() {
		return pi;
	}

	@Value("#{T(java.lang.Math).PI}")
	public void setPi(double pi) {
		this.pi = pi;
	}

	public double getE() {
		return e;
	}

	@Value("#{T(java.lang.Math).E}")
	public void setE(double e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Test [count=" + count + ", pi=" + pi + ", e=" + e + "]";
	}

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
}
