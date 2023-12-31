package org.example.QuizApp.service;

import java.util.ArrayList;
import java.util.List;

import org.example.QuizApp.dao.QuestionDao;
import org.example.QuizApp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
public ResponseEntity<List<Question>> getAllQuestions(){
    try{

        return new ResponseEntity<>(questionDao.findAll(),HttpStatus.OK);

    }catch(Exception e){
        e.printStackTrace();
    }
    return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    
}

public ResponseEntity<String> addQuestion(Question question){
    questionDao.save(question);
    return new ResponseEntity<>("Success",HttpStatus.CREATED);
    
}
    
}
