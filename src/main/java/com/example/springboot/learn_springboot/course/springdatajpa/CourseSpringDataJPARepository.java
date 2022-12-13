package com.example.springboot.learn_springboot.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.learn_springboot.course.Course;

public interface CourseSpringDataJPARepository extends JpaRepository<Course, Long> {
		
	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);
}
