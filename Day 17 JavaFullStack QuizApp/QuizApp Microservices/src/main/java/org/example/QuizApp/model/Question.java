package org.example.QuizApp.model;

import jakarta.persistence.Entity;

//import org.hibernate.annotations.DialectOverride.GeneratedColumns;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String rightAns;



}
