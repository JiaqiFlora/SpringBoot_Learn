package com.example.springboot.learn_springboot.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.springboot.learn_springboot.course.Course;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERYString = 
			"""
				insert into COURSE(id, name, author) 
				values(?, ?, ?);
				
			""";
	
	private static String DELETE_QUERYString = 
			"""
				delete from course
				where id = ?;
				
			""";
	
	private static String SELECT_QUERYString = 
			"""
				select * from course
				where id = ?;
				
			""";
	
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERYString, course.getId(), course.getName(), course.getAuthor());
	}
	
	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_QUERYString, id);
	}
	
	public Course findById(long id) {
		// ResultSet -> Bean => Row Mapper => 
		return springJdbcTemplate.queryForObject(SELECT_QUERYString, new BeanPropertyRowMapper<>(Course.class), id);
		
	}

}
