package com.Student_Managment_System_using_Spring_JDBC.DAO;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {
	
	private final JdbcTemplate jdbcTemplate;
	
	public StudentDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}

}
