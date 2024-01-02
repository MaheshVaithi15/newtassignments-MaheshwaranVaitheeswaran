package org.example.IndepthHibernateJPA.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Passport {

    @Id
    @GeneratedValue
    private Long id;

    private String number;

    protected Passport() {
    }

    public Passport(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Passport[%s]",number);
    }

    

    


    
}
