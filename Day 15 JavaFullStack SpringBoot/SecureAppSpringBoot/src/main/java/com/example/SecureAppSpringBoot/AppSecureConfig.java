package com.example.SecureAppSpringBoot;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;


@Configuration
@EnableWebSecurity
public class AppSecureConfig extends WebSecurityConfiguration{

   /*  @Bean
    //@Override
    protected UserDetailsService userDetailsService(){
        List<UserDetails> users = new ArrayList<>();

        users.add(User.withDefaultPasswordEncoder().username("mahesh").password("root").roles("Admin").build());

        return new InMemoryUserDetailsManager(users);


    }*/


    // username password from database
    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public AuthenticationProvider authProvider(){

        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());

        return provider;
    }
    


    
}
