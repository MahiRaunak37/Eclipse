package com.spring.jdbc.dao.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfig {
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbcdao");
		ds.setUsername("root");
		ds.setPassword("raunak37");
		return ds;
	}

	@Bean("jdbcTemplate")
	public JdbcTemplate geTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}

	@Bean("studentDao")
	public StudentDAO getStudentDAO() {
		StudentDaoImp studentDaoImp = new StudentDaoImp();
		studentDaoImp.setJdbcTemplate(geTemplate());
		return studentDaoImp;
	}
}
