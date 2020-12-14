package com.springboot.seleniumspring.googleTests;

import com.springboot.seleniumspring.Pages.GoogleHomePage;
import com.springboot.seleniumspring.SpringBaseTestNG;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends SpringBaseTestNG {

    @Autowired
    private GoogleHomePage googleHomePage;

    @Test
    public void firstTest(){
        googleHomePage.goToPage();
        Assert.assertTrue(googleHomePage.pageLoadWait());

        googleHomePage.getSearchComponent().searchText("spring boot")

                                            .clickSearch();

        Assert.assertTrue(googleHomePage.getSearchResult().resultSize() > 2);
    }
}
