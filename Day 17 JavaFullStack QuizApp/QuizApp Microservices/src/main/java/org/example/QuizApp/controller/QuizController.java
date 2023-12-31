package org.example.QuizApp.controller;

import java.util.List;

import org.example.QuizApp.model.Question;
import org.example.QuizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("questions")

public class QuizController {
    @Autowired
    QuestionService questionService;

    @GetMapping("allquestions")
    public ResponseEntity<List<Question>> getAllQuestions(){


        return questionService.getAllQuestions();
    }

    //Add Questions to Database

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        
        return questionService.addQuestion(question);
        

    }


    
}
