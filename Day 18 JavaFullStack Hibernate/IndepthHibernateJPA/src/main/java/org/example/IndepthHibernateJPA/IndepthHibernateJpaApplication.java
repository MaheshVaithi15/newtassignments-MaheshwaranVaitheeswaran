package org.example.IndepthHibernateJPA;

import org.example.IndepthHibernateJPA.Entity.Course;
import org.example.IndepthHibernateJPA.Repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@Transactional
public class IndepthHibernateJpaApplication implements CommandLineRunner {

	// logger creation
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CourseRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(IndepthHibernateJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//throw new UnsupportedOperationException("Unimplemented method 'run'");

		Course course=repository.findById(12101L);

		logger.info("Course 12101 ->{}",course);
		repository.deleteById(12101L);
		repository.save(new Course("Java SpringBoot"));
		repository.playWithEntity();




	}

}
