package com.springboot.seleniumspring.googleTests;

import com.springboot.seleniumspring.Pages.GoogleHomePage;
import com.springboot.seleniumspring.SpringBaseTestNG;
import com.springboot.seleniumspring.base.Utils.ScreenshotUtil;
import com.springboot.seleniumspring.base.annotations.LazyAutowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest1 extends SpringBaseTestNG {

    @LazyAutowired
    private GoogleHomePage googleHomePage;

    @LazyAutowired
    private ScreenshotUtil screenshotUtil;

    @Test
    public void secondTest(){
        System.out.println("Test is starting");
        googleHomePage.goToPage();
        Assert.assertTrue(googleHomePage.pageLoadWait());

        googleHomePage.getSearchComponent().searchText("selenium")

                                            .clickSearch();

        Assert.assertTrue(googleHomePage.getSearchResult().resultSize() > 2);
        screenshotUtil.takeScreenShot();
        //googleHomePage.close();

    }

    /*@AfterTest
    public void close(){
        googleHomePage.close();
    }*/
}
