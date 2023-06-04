package com.spring.spEL.expression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
class Test {
	private int count;

	public int getCount() {
		return count;
	}

	@Value("#{22+44}")
	public void setCount(int count) {
		this.count = count;
	}

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Test [count=" + count + "]";
	}

}
