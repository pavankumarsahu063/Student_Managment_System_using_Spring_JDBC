package com.Student_Managment_System_using_Spring_JDBC.DAO;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Student_Managment_System_using_Spring_JDBC.Model.Student;


@Repository
public class StudentDao {
	
	private final JdbcTemplate jdbcTemplate;
	
	public StudentDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
		
	
	public int save(Student student) {
		String sql="INSERT INTO students(email,name,password) VALUES(?,?,?)";
		return jdbcTemplate.update(sql, student.getEmail(),student.getName(),student.getPassword());
	}
	
	public int update(Student student){
	String sql="UPDATE TABLE students SET email =? ,name=? , password=? WHERE email=?";
	
	return jdbcTemplate.update(sql, student.getEmail(),student.getName(),student.getPassword(),student.getEmail());
	}
	
	
	public Student getStudent(int sId) {
		String sql="SELECT * FROM students WHERE id=?";
		
		
		return null;
		
	}
}
