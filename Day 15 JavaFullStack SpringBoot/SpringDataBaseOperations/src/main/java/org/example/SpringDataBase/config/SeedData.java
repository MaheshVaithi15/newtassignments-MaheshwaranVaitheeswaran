package org.example.SpringDataBase.config;

import java.util.*;

import org.example.SpringDataBase.models.Account;
import org.example.SpringDataBase.models.Post;
import org.example.SpringDataBase.services.AccountService;
import org.example.SpringDataBase.services.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedData implements CommandLineRunner{

     @Autowired
     private PostService postService;

     @Autowired
     private AccountService accountService;

    @Override
    public void run(String... args) throws Exception{

        Account account01 = new Account();
        Account account02 = new Account();

        account01.setEmail("mahesh@gmail.com");
        account01.setPassword("password");
        account01.setName("Mahesh");
        account02.setEmail("pradeep@gmail.com");
        account02.setPassword("password");
        account02.setName("Pradeep");

        accountService.save(account01);
        accountService.save(account02);
       
        List<Post> posts = postService.getAll();

        if(posts.size()==0){
            Post post01 = new Post();
            post01.setTitle("Post 01");
            post01.setBody("Post 01 Body");
            post01.setAccount(account01);
            postService.save(post01);


            Post post02 = new Post();
            post02.setTitle("Post 02");
            post02.setBody("Post 02 Body");
            post02.setAccount(account02);
            postService.save(post02);


        }

    }
}
