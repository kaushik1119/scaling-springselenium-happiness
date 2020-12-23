package com.springboot.seleniumspring.Pages;

import com.springboot.seleniumspring.base.annotations.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

@Page
public class MainPage extends Base {

    public void goTo(){
        webDriver.get("https://vins-udemy.s3.amazonaws.com/ds/window/main.html");
    }

    private List<WebElement> getLinks(){
        return webDriver.findElements(By.tagName("a"));
    }

    public void clickAllLinks(){
        getLinks().forEach(WebElement::click);
    }





    @Override
    public boolean pageLoadWait() {
        return webDriverWait.until(webDriver -> !getLinks().isEmpty());
    }
}
