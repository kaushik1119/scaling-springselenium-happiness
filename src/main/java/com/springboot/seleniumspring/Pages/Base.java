package com.springboot.seleniumspring.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.openqa.selenium.JavascriptExecutor;

public abstract class Base {

    @Autowired
    protected WebDriver webDriver;

    @Autowired
    protected WebDriverWait webDriverWait;



    //wait to be implemented per page basis
    public abstract boolean pageLoadWait();





}
