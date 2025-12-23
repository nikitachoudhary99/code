package com.univ.springcfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.univ.daoimpl.StudentDaoImpl;
@Component
@ComponentScan(basePackages = "com.univ")
public class SpringConfig {
     @Bean
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/25june25jeespring");
		ds.setUsername("root");
		ds.setPassword("mishthu99");
		return ds;
	}
	@Bean
	public JdbcTemplate getJtemplate()
	{
		JdbcTemplate jTemplate=new JdbcTemplate();
		jTemplate.setDataSource(getDataSource());
		return jTemplate;
	}
	@Bean
	public StudentDaoImpl getStudentDaoImpl()
	{
		StudentDaoImpl daoimpl=new StudentDaoImpl();
		daoimpl.setjTemplate(getJtemplate());
		return daoimpl;
	}
}
