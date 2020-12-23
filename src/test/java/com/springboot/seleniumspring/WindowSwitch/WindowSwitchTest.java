package com.springboot.seleniumspring.WindowSwitch;

import com.springboot.seleniumspring.Pages.MainPage;
import com.springboot.seleniumspring.Pages.PageA;
import com.springboot.seleniumspring.Pages.PageB;
import com.springboot.seleniumspring.SpringBaseTestNG;

import com.springboot.seleniumspring.base.annotations.LazyAutowired;
import org.springframework.test.context.TestPropertySource;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


@TestPropertySource(properties = "browser=firefox")
public class WindowSwitchTest extends SpringBaseTestNG {

    @LazyAutowired
    private MainPage mainPage;

    @LazyAutowired
    private PageA pageA;

    @LazyAutowired
    private PageB pageB;


    @BeforeClass
    public void setUp(){
        mainPage.goTo();
        mainPage.pageLoadWait();
        mainPage.clickAllLinks();
    }

    @Test
    public void switchTest(){
        pageA.addMessage("This is page A");
        pageB.addMessage("Hello i am page B");
    }







}
