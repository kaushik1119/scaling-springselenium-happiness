package com.springboot.seleniumspring.googleTests;

import com.springboot.seleniumspring.SpringBaseTestNG;
import org.testng.annotations.Test;

public class TestLazyBrowser extends SpringBaseTestNG {

    @Test
    public void lazyTest(){
        int a = 10;
        int b = 20;
        System.out.println("The sum is ------------------" + (a+b));


    }

}
