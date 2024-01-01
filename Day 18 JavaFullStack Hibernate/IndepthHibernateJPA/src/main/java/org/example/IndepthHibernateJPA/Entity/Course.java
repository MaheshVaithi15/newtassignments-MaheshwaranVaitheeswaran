package org.example.IndepthHibernateJPA.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue
    private long id;
    private String name;

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
