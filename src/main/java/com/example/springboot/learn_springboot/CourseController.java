package com.example.springboot.learn_springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.learn_springboot.course.Course;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
			new Course(1, "learn AWS", "Mike"),
			new Course(2, "learn spring", "Mary"),
			new Course(3, "learn spring boot", "Mary")
		);
	}
}
