package com.chandan.javaconfi;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.chandan.deo.StudentDao;
import com.chandan.deo.StudentDaoImpl;

@ComponentScan(basePackages =  "com.chandan.deo.")
@Configuration
public class config {
	
	@Bean
	public DataSource getDataSource()
	{
		
	DriverManagerDataSource dataSource=new DriverManagerDataSource();
	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc2");
	dataSource.setUsername("root");
	dataSource.setPassword("password");
	
	return dataSource;
		
	}
	@Bean("jdbc")
	public JdbcTemplate getJdbcTemplate() {
		
		
		JdbcTemplate jd=new JdbcTemplate();
		jd.setDataSource(getDataSource());
		
		return jd;
	}
	
	/*
@Bean("stdao")
	public StudentDao studentDao() {
		
		StudentDaoImpl dao=new StudentDaoImpl();
		dao.setJdbcTemplate(getJdbcTemplate());
		return dao;
	}*/
}
