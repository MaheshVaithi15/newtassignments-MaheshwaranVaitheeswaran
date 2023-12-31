package org.example.questionservice.dao;

import java.util.List;

import org.example.questionservice.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {

   // List<Question> findByCategory();


    @Query(value="SELECT * FROM question LIMIT :numQ",nativeQuery=true)
    List<Integer> findRandomQuestionsByCategory(int numQ);


    
}
