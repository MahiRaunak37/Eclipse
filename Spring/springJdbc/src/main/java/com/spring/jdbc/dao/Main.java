package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/jdbc/dao/config.xml");
		StudentDAO studentDao = applicationContext.getBean("studentDaoImp", StudentDAO.class);

		// Insert query
//		Student student = new Student();
//		student.setId(4567);
//		student.setName("mahi");
//		student.setCity("Hyderabad");
//		int result = studentDao.insert(student);
//		System.out.println(result + "Student add");

		// Update query
//		Student student = new Student();
//		student.setId(3456);
//		student.setName("ranjan");
//		student.setCity("Agra");
//		int result = studentDao.update(student);
//		System.out.println(result + " row updated");

		// delete query
//		int result = studentDao.delete(2346);
//		System.out.println(result + " row is deleted");

		// Select query
//		Student student = studentDao.getStudent(123);
//		System.out.println(student);

		// select all in list
		List<Student> students = studentDao.getAllStudents();
		for (Student s : students)
			System.out.println(s);
	}

}
