package com.springboot.seleniumspring.base.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.time.LocalDateTime;

@Lazy
@Configuration
public class DateTimeConfig {

    @Bean
    public LocalDateTime getTime(){
        return LocalDateTime.now();
    }

}
