package com.springboot.seleniumspring.base.Config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Lazy
@Configuration
public class WebDriverWaitConfig {

    @Value("${defaultTimeout:10}")
    private int timeout;

    @Bean
    @Scope("prototype")
    public WebDriverWait webDriverWait(WebDriver webDriver){
        return new WebDriverWait(webDriver,timeout);
    }
}
