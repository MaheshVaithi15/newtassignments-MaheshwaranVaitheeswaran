package org.example.IndepthHibernateJPA.Entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.NamedQuery;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
//@NamedQuery(name="get_all_course",query="select c from course c")
public class Course {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @UpdateTimestamp
    private LocalDateTime lastUpdatedDate;
    
    @CreationTimestamp
    private LocalDateTime createdDate;

    // constructor for name

    protected Course(){}

    public Course(String name){
        this.name = name;
    }

    // getter and setter for name field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Course [name=" + name + "]";
    }

    

    

    
}
