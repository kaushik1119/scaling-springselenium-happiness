package com.springboot.seleniumspring.Pages;

import com.springboot.seleniumspring.base.annotations.Page;
import org.openqa.selenium.By;


@Page
public class PageA extends Base {

    By messageField = By.id("area");

    public void addMessage(String message){
        sendKeys(messageField,message);
    }

    @Override
    public boolean pageLoadWait() {
        return webDriverWait.until(webDriver -> webDriver.findElement(messageField).isDisplayed());
    }
}
