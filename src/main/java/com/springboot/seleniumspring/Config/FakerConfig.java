package com.springboot.seleniumspring.Config;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//When trying to get objects from external libraries, create Configuration and bean

@Configuration

public class FakerConfig implements BeanNameAware{

    @Bean
    public Faker getFaker(){
        return new Faker();
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("bean name is: " + s);
    }
}
