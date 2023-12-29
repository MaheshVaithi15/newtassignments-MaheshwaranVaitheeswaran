package org.example.SpringDataBase.repositories;

import org.example.SpringDataBase.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    
    
} 
