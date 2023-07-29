package com.bhatiya;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.bhatiya.dao.StudentDao;
import com.bhatiya.dao.StudentDaoImple;

@Configuration
public class JdbcConfig {
	
	@Bean("ds")
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Ch@7488457825");
		return ds;
	}
	@Bean("jdbcTemplate")
public JdbcTemplate getTemplate()
{
		JdbcTemplate jdbcTemlate=new JdbcTemplate();
		 jdbcTemlate.setDataSource(getDataSource());
		 
		 return  jdbcTemlate;
}
	@Bean("studentdao")
	public StudentDao getStudentDao()
	{
		StudentDaoImple studentDaoi=new StudentDaoImple();
		studentDaoi.setJdbcTemplate(getTemplate());
		
		return studentDaoi;
		
	}
}
