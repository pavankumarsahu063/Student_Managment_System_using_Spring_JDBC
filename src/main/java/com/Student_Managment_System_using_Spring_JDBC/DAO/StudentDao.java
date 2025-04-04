package com.Student_Managment_System_using_Spring_JDBC.DAO;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Student_Managment_System_using_Spring_JDBC.Model.Student;

public class StudentDao {
	
	private final JdbcTemplate jdbcTemplate;
	
	public StudentDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
		
	
	public int save(Student student) {
		String sql="INSERT INTO students(email,name,password) VALUES(?,?,?)";
		return jdbcTemplate.update(sql, student.getEmail(),student.getName(),student.getPassword());
	}
}
