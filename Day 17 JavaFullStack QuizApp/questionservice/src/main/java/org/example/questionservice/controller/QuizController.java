package org.example.questionservice.controller;

import java.util.List;

import org.example.questionservice.model.Question;
import org.example.questionservice.model.QuestionWrapper;
import org.example.questionservice.model.Response;
import org.example.questionservice.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    //generate a question from own service

    @GetMapping("generate")
    public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam Integer numQns){
        return questionService.getQuestionsForQuiz(numQns);

    }

    @PostMapping("getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionFromId(@RequestBody List<Integer> questionIds) {

        return questionService.getQuestionsFromId(questionIds);
    }

    @PostMapping("getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses)
    {
        return questionService.getScore(responses);
        
    }


    







    
}
