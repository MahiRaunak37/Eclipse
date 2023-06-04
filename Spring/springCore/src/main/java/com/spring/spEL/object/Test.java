package com.spring.spEL.object;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("test")
class Test {
	private String name;

	public String getName() {
		return name;
	}

	@Value("#{new java.lang.String('Mahi raunak')}")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Test [name=" + name + "]";
	}
}
