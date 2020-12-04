package com.springboot.seleniumspring.Config;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebDriverConfig {

    @Value("${defaultTimeout:10}")
    private int timeout;

    @Bean
    public WebDriver chromeDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    @Bean
    public WebDriverWait webDriverWait(WebDriver driver){
        return new WebDriverWait(driver, timeout);
    }
}