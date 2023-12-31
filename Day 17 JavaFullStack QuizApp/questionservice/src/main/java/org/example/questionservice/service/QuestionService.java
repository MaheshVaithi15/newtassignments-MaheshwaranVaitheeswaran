package org.example.questionservice.service;

import java.util.ArrayList;
import java.util.List;

import org.example.questionservice.dao.QuestionDao;
import org.example.questionservice.model.Question;
import org.example.questionservice.model.QuestionWrapper;
import org.example.questionservice.model.Response;
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

public ResponseEntity<List<Integer>> getQuestionsForQuiz(Integer numQns) {
    List<Integer> questions = questionDao.findRandomQuestionsByCategory(numQns);
    return new ResponseEntity<>(questions,HttpStatus.OK);
}

public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(List<Integer> questionIds) {
    
    List<QuestionWrapper> wrappers = new ArrayList<>();
    List<Question> questions = new ArrayList<>();
   
    for(Integer id : questionIds){
        questions.add(questionDao.findById(id).get());
    }

    for(Question question:questions){
        QuestionWrapper wrapper = new QuestionWrapper();
        wrapper.setId(question.getId());
        wrapper.setQuestionTitle(question.getQuestionTitle());
        wrapper.setOption1(question.getOption1());
        wrapper.setOption2(question.getOption2());
        wrappers.add(wrapper);



    }

    
    return new ResponseEntity<>(wrappers,HttpStatus.OK);
}

public ResponseEntity<Integer> getScore(List<Response> responses){

    //Quiz quiz = quizDao.findById(id).get();
        //List<Question> questions = quiz.getQuestions();
       // int i=0;
        int right=0;
        for(Response response:responses){

            Question question = questionDao.findById(response.getId()).get();

            if(response.getResponse().equals(question.getRightAns())){
                right++;
            }
           // i++;

        }

        return new ResponseEntity<>(right,HttpStatus.OK);

}
    
}
