package org.example.IndepthHibernateJPA.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private String name;


    @OneToOne
    private Passport passport;

    // getters and Setters and constructor

    protected Student(){}

    public Student(String name){this.name=name;}

    public Long getId() {
        return id;
    }

    /*  public void setId(Long id) {
        this.id = id;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //to string method for name

    @Override
    public String toString() {
        return String.format("Student[%s]",name);
    }


    

    
    

}
