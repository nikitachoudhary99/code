package com.univ.springcfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.univ.daoimpl.ProductDaoImpl;

@Configuration
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
	 public JdbcTemplate getjTemplate()
	 {
		 JdbcTemplate jTemplate= new JdbcTemplate();
		 jTemplate.setDataSource(getDataSource());
		 return jTemplate;
	 }
	 @Bean
	 public ProductDaoImpl getProductDaoImpl()
	 {
		 ProductDaoImpl daoimpl=new ProductDaoImpl();
		 daoimpl.setjTemplate(getjTemplate());
		 return daoimpl;
	 }
}
