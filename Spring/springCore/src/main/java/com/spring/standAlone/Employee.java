package com.spring.standAlone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

class Employee {
	private List<String> lang;
	private Map<String, Integer> salary;
	private Properties properties;

	public List<String> getLang() {
		return lang;
	}

	public void setLang(List<String> lang) {
		this.lang = lang;
	}

	public Map<String, Integer> getSalary() {
		return salary;
	}

	public void setSalary(Map<String, Integer> salary) {
		this.salary = salary;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Employee [lang=" + lang + ", salary=" + salary + "]";
	}

}
