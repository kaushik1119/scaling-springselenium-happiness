package com.springboot.seleniumspring.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
public class DateTimeConfig {

    @Bean
    public LocalDateTime getTime(){
        return LocalDateTime.now();
    }

}
