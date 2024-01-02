package org.example.IndepthHibernateJPA.Repository;

//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNull;

import org.example.IndepthHibernateJPA.IndepthHibernateJpaApplication;
import org.example.IndepthHibernateJPA.Entity.Course;
//import org.example.IndepthHibernateJPA.Entity.Course;
import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.DirtiesContext;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.*;


@SpringBootTest(classes=IndepthHibernateJpaApplication.class)
class JPQLTests {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;

	@Test
	public void jpql_basic() {
		List resultList = em.createQuery("select c from course c").getResultList();

		logger.info("Select c from course c -> {}",resultList);
	
	}

	@Test
	public void jpql_type() {
		TypedQuery<Course> query = em.createNamedQuery("select c from course c",Course.class);

		logger.info("Select c from course c -> {}",query);
	
	}

	@Test
	public void jpql_where() {
		TypedQuery<Course> query = em.createQuery("select c from course c where id=12110",Course.class);

		logger.info("Select c from course c where id =12110 -> {}",query);
	
	}



}
