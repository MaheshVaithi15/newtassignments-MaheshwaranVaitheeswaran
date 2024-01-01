package com.example.HibernateJPADemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.HibernateJPADemo.entity.Person;
import com.example.HibernateJPADemo.jdbc.PersonJDBCDao;
import java.util.*;
import java.util.Date;
import java.sql.*;
@SpringBootApplication
public class HibernateJpaDemoApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJDBCDao personJDBCDao;
	public static void main(String[] args) {
		SpringApplication.run(HibernateJpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//throw new UnsupportedOperationException("Unimplemented method 'run'");
		logger.info("All Users -> {}",personJDBCDao.findAll());
		logger.info("User id 1001 ->{}",personJDBCDao.findById(1001));
		logger.info("Deleting 1002 -> No of Rows Deleted {}",personJDBCDao.deleteById(1002));
		logger.info("Inserted Values -> rows inserted {}",personJDBCDao.insert(
			new Person(1003,"Sai","Hyderabad",new Date())));
	}

}
