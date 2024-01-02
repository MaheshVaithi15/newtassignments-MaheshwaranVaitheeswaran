package org.example.IndepthHibernateJPA.Repository;

import org.example.IndepthHibernateJPA.Entity.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;

@Repository
public class CourseRepository {

   //private Logger logger = new LoggerFactory.getLogger(this.getClass());
    @Autowired
    EntityManager em;

    public Course findById(Long id){
        return em.find(Course.class, id);

    }

      // to save the data

    public Course save(Course course){
        if(course.getId()==0L){
            //insert data
            em.persist(course);
        }
        else{
            //update data
            em.merge(course);
        }
        return course;
    }

    // to delete the course

    public void deleteById(Long id){

       Course course = findById(id);
       em.remove(course);
    }

    // to play with entity manager

    public void playWithEntity(){




        //logger.info("Play with Entity Started");
        // Course course = new Course("AngularJs");
        // em.persist(course);
        //em.flush();

        // to update the name

       // course.setName("AngularJs and TypeScript");

        //clear and detach

        Course course1 = new Course("MySql");
        // em.persist(course1);
        //em.detach(course1);
        //em.refresh(course1);

        // to update the name

        course1.setName("MySQL Databases");


    }

  



}
