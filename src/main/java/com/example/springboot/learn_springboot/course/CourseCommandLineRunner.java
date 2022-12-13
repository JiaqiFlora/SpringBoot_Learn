package com.example.springboot.learn_springboot.course;

import javax.sound.midi.Soundbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springboot.learn_springboot.course.jdbc.CourseJdbcRepository;
import com.example.springboot.learn_springboot.course.jpa.CourseJPARepository;
import com.example.springboot.learn_springboot.course.springdatajpa.CourseSpringDataJPARepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJPARepository repository;
	
	@Autowired
	private CourseSpringDataJPARepository repository;

	@Override
	public void run(String... args) throws Exception {
//		repository.insert(new Course(1, "Learn Jpa", "Jiaqi"));
//		repository.insert(new Course(2, "Learn C++", "Jiaqi2222"));
//		repository.insert(new Course(3, "Learn python", "Jiaqi3333"));
//		
//		repository.deleteById(2);
//		
//		System.out.println(repository.findById(1));
		
		repository.save(new Course(1, "Learn Spring data Jpa", "Jiaqi"));
		repository.save(new Course(2, "Learn C++", "Jiaqi2222"));
		repository.save(new Course(3, "Learn python", "Jiaqi3333"));
		
		repository.deleteById(2l);
		
		System.out.println(repository.findById(1l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("Jiaqi"));
		System.out.println(repository.findByName("Learn python"));
		
	}
	
	
}
