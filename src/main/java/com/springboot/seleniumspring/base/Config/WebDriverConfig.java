package com.springboot.seleniumspring.base.Config;


import com.springboot.seleniumspring.base.annotations.BeanThreadScope;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

@Lazy
@Profile("!remote")
@Configuration

public class WebDriverConfig {

    @BeanThreadScope
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver firefoxDriver(){
        WebDriverManager.firefoxdriver().version("77.0.1").setup();
        return new FirefoxDriver();
    }


    @BeanThreadScope
    @ConditionalOnMissingBean
    public WebDriver chromeDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
    //beans have to be unique..in this case 2 webdrivers can be found. add @primary to select one

    //we can also use conditionalOnProperty to decide which browser to invoke
    //@Primary


    //We can use ConditionalOnMissingBean to default to a value..make sure this bean is in the end of the configuration

    //we can also use ConditionalOnExpression

}
