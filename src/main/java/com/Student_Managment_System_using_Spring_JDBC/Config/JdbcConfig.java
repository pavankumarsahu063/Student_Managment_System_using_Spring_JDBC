package com.Student_Managment_System_using_Spring_JDBC.Config;


import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.Student_Managment_System_using_Spring_JDBC")
public class JdbcConfig {
	
	@Bean
	public DataSource getDataSource() {
		 BasicDataSource
		 dataSource = new BasicDataSource();
		 
//		 DriverManagerDataSource d=new DriverManagerDataSource();
		 
		 dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		 dataSource.setUrl("jdbc:mysql://localhost:3306/my_database");

		 dataSource.setUsername("root");
		 dataSource.setPassword("Pavan@123");
		 
		 return dataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(getDataSource());
	}
}
