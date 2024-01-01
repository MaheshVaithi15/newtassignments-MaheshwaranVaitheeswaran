package com.example.HibernateJPADemo.entity;

import java.util.Date;

public class Person {

    private int id;
    private String name;
    private String location;
    private String birthdate;

    // constructor
    public Person(int id, String name, String location, String birthdate) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.birthdate = birthdate;
    }

    public Person(){
        
    }

    // getters and setters
    
    public Person(int id2, String name2, String location2, Date date) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "\nPerson [id=" + id + ", name=" + name + ", location=" + location + ", birthdate=" + birthdate + "]";
    }


    // to string method

    



    
    

}
