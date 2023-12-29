package com.example.SecureAppSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetails implements UserDetailsService {
    @Autowired
    private UserRepository repo;
    @Override
    public UserDetails loadUserByUsername(String username) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'loadUserByUsername'");

        User user = repo.findByUsername(username);

        if(user==null){
            throw new UsernameNotFoundException("User Not Found...");
        }

        return new UserPrinciple(user);
    }
    
}
