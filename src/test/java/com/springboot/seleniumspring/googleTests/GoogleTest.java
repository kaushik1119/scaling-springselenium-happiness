package com.springboot.seleniumspring.googleTests;

import com.springboot.seleniumspring.Pages.GoogleHomePage;
import com.springboot.seleniumspring.SpringBaseTestNG;
import com.springboot.seleniumspring.Utils.ScreenshotUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class GoogleTest extends SpringBaseTestNG {

    @Autowired
    private GoogleHomePage googleHomePage;

    @Lazy
    @Autowired
    private ScreenshotUtil screenshotUtil;

    @Test
    public void firstTest(){
        System.out.println("Test is starting");
        googleHomePage.goToPage();
        Assert.assertTrue(googleHomePage.pageLoadWait());

        googleHomePage.getSearchComponent().searchText("spring boot")

                                            .clickSearch();

        Assert.assertTrue(googleHomePage.getSearchResult().resultSize() > 2);
        //screenshotUtil.takeScreenShot();

    }
}
