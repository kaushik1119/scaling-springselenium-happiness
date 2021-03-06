package com.springboot.seleniumspring.Pages;

import com.springboot.seleniumspring.base.annotations.LazyAutowired;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class Base {

    @LazyAutowired
    protected WebDriver webDriver;

    @LazyAutowired
    protected WebDriverWait webDriverWait;



    //wait to be implemented per page basis
    public abstract boolean pageLoadWait();

    public void clickElement(By by){
        webDriver.findElement(by).click();
    }

    public void sendKeys(By by, String text){
        webDriver.findElement(by).sendKeys(text);
    }

    public void sendKeys(By by, Keys keys){
        webDriver.findElement(by).sendKeys(keys);
    }

    public WebElement getElement(By by){
        return webDriver.findElement(by);
    }

    public List<WebElement> getElementList(By by){
        return webDriver.findElements(by);
    }

    public void close(){
        webDriver.quit();
    }





}
