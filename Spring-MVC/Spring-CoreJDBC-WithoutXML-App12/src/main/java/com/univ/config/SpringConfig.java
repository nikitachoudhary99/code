package com.univ.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.univ.daoimpl.EmployeeDaoImpl;

@Configuration
public class SpringConfig {

	@Bean
	public DriverManagerDataSource getdataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/25june25jee");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean
	public JdbcTemplate getJTemplate()
	{
		JdbcTemplate jTemplate = new JdbcTemplate();
		jTemplate.setDataSource(getdataSource());
		return jTemplate;
	}
	@Bean
	public EmployeeDaoImpl getEmpDaoImpl()
	{
		EmployeeDaoImpl daoimpl = new EmployeeDaoImpl();
		daoimpl.setjTemplate(getJTemplate());
		return daoimpl;
	}
	
}
