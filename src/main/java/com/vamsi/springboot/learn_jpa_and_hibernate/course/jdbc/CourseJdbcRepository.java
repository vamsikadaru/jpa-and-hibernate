package com.vamsi.springboot.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY =
		"""
			insert into COURSE (id, name, author)
			values (1, 'Spring Boot', 'Vamsi');
			
		""";
		
	public void insert() {
		springJdbcTemplate.update(INSERT_QUERY);;
	}
}
