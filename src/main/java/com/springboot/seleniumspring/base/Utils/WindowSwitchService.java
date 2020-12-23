package com.springboot.seleniumspring.base.Utils;


import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class WindowSwitchService {

    @Autowired
    private ApplicationContext ctx;

    public void switcByTitle(String title) {
        WebDriver driver = ctx.getBean(WebDriver.class);
        driver.getWindowHandles()
                .stream()
                .map(handle -> driver.switchTo().window(handle).getTitle())
                .filter(t->t.startsWith(title))
                .findFirst()
                .orElse("Wrong window");
    }

    public void switchByIndex(int index){
        WebDriver driver = ctx.getBean(WebDriver.class);
        String [] handles = driver.getWindowHandles().toArray(new String[0]);
        driver.switchTo().window(handles[index]);
    }
}
