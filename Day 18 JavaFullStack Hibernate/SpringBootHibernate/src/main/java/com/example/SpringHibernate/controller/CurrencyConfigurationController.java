package com.example.SpringHibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringHibernate.CurrencyServiceConfiguration;

@RestController
public class CurrencyConfigurationController {
    
    @Autowired
    private CurrencyServiceConfiguration configuration;
    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration retriveAllCourses(){
        return configuration;
    } 
}
