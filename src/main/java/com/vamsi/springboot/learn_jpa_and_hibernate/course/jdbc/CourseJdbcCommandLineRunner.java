package com.vamsi.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vamsi.springboot.learn_jpa_and_hibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1, "Learn Spring Boot", "Vamsi"));
		repository.insert(new Course(2, "Learn Hibernate", "Vamsi"));
		repository.insert(new Course(3, "Learn AWS", "Vamsi"));
		
		repository.deleteById(1);
	}

}
