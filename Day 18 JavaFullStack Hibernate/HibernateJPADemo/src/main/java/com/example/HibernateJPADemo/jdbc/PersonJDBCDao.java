package com.example.HibernateJPADemo.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.HibernateJPADemo.entity.Person;

import java.sql.*;
import java.util.*;
//import java.util.Date.getTime;

@Repository
public class PersonJDBCDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> findAll(){

        return jdbcTemplate.query("select * from person",
            new BeanPropertyRowMapper<Person>(Person.class));

    }

    public Person findById(int id){

        return jdbcTemplate.queryForObject("select * from person where id=?", new Object[]{id},
            new BeanPropertyRowMapper<Person>(Person.class));

    }


    public int deleteById(int id){

        return jdbcTemplate.update("delete from person where id=?", new Object[]{id});

    }

    // insert operation:

        public int insert(Person person){

        return jdbcTemplate.update("insert into person (id,name,location,birthdate) values(?,?,?,?)",
         new Object[]{person.getId(),person.getName(),person.getLocation(),
            new Timestamp(person.getBirthdate()).getTime()});

    }


    // update table

    
        public int update(Person person){

        return jdbcTemplate.update("update person set name=?,location=? where id=?",
         new Object[]{person.getName(),person.getLocation(),person.getId()});

    }
    
}
