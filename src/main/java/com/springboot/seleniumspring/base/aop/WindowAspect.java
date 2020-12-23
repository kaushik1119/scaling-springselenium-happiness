package com.springboot.seleniumspring.base.aop;


import com.springboot.seleniumspring.base.Utils.WindowSwitchService;
import com.springboot.seleniumspring.base.annotations.Window;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WindowAspect {
    @Autowired
    private WindowSwitchService windowSwitchService;

    //looks for @Window tags within the directory mentioned
    @Before("@target(window) && within(com.springboot.seleniumspring..*)")
    public void before(Window window){
        windowSwitchService.switcByTitle(window.value());
    }

    @After("@target(window) && within(com.springboot.seleniumspring..*)")
    public void after(Window window){
        windowSwitchService.switchByIndex(0);
    }

}
