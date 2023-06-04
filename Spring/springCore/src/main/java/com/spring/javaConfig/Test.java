package com.spring.javaConfig;

//@Component

class Test {
	private Roll roll;

	public Roll getRoll() {
		return roll;
	}

	public void setRoll(Roll roll) {
		this.roll = roll;

	}

	public void name() {
		System.out.println("Hye it's me. I trapped in name method of Test class");
		this.roll.rollNo();
	}

	public Test(Roll roll) {
		super();
		this.roll = roll;
	}
}
