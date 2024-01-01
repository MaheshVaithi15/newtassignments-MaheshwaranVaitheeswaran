package com.example.SpringHibernate.controller;

import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringHibernate.Course;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retriveAllCourses(){
        return Arrays.asList(new Course(1,"Learn Maths","Mahesh Teaches")
        ,new Course(2,"Learn English","Saran Teaches")
        ,new Course(3,"Learn Chemistry","Jothi Chemist")
        ,new Course(4,"Learn Physics","Veeran Teaches"));
    }
}
