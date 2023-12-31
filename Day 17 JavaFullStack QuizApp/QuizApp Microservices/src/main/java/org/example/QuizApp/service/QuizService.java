package org.example.QuizApp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.example.QuizApp.dao.QuestionDao;
import org.example.QuizApp.dao.QuizDao;
import org.example.QuizApp.model.Question;
import org.example.QuizApp.model.QuestionWrapper;
import org.example.QuizApp.model.Quiz;
import org.example.QuizApp.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class QuizService {
    @Autowired
    QuizDao quizDao;

    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<String> createQuiz(int numQ,String title){
        
        List<Question> questions = questionDao.findRandomQuestionsByCategory(numQ);  
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);

        return new ResponseEntity<>("Success",HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
        
        Optional<Quiz> quiz=quizDao.findById(id);
        List<Question> questionsFromDB = quiz.get().getQuestions();
        List<QuestionWrapper> questionsForUser = new ArrayList<>();
        
        for(Question q : questionsFromDB){
            QuestionWrapper qw = new QuestionWrapper(q.getId(),q.getQuestionTitle(),q.getOption1(),q.getOption2());
            questionsForUser.add(qw);
        }
        
        return new ResponseEntity<>(questionsForUser,HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateResult(Integer id,List<Response> responses){
        Quiz quiz = quizDao.findById(id).get();
        List<Question> questions = quiz.getQuestions();
        int i=0;
        int right=0;
        for(Response response:responses){

            if(response.getResponse().equals(questions.get(i).getRightAns())){
                right++;
            }
            i++;

        }

        return new ResponseEntity<>(right,HttpStatus.OK);
    }
    


}
