package org.example.IndepthHibernateJPA.Repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.example.IndepthHibernateJPA.IndepthHibernateJpaApplication;
import org.example.IndepthHibernateJPA.Entity.Course;
import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;


@SpringBootTest(classes=IndepthHibernateJpaApplication.class)
class CourseRepositoryTests {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CourseRepository repository;

	@Test
	public void findById_basic() {
		Course course=repository.findById(12101L);
		assertEquals("Computer Networks", course.getName());
		//logger.info("Test is Running");
	}

	@Test
	@DirtiesContext
	public void deleteById_basic() {
		repository.deleteById(12101L);
		assertNull(repository.findById(12101L));
	}

	@Test
	@DirtiesContext
	public void save_basic() {
		// get a course
		Course course = repository.findById(12102L);
		assertEquals("Computer Fundamentals", course.getName());

		// to set  the name

		course.setName("DotNet FullStack");
		repository.save(course);
		assertNull(repository.findById(12102L));

		// to check the testcase

		Course course1 = repository.findById(12102L);
		assertEquals("DotNet Fullstack", course1.getName());
		//assertNull(repository.findById(12102L));
	}

	@Test
	@DirtiesContext
	public void playWithEntity() {
		//
		repository.playWithEntity();
	}

}
