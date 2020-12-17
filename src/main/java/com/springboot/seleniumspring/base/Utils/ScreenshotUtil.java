package com.springboot.seleniumspring.base.Utils;


import com.github.javafaker.Faker;
import com.springboot.seleniumspring.base.annotations.LazyAutowired;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDateTime;

//Lazy in both component and where it is autowired. Only created when required

@Lazy
@Component
public class ScreenshotUtil {

    @LazyAutowired
    private WebDriver webDriver;

    @LazyAutowired
    LocalDateTime dateTime;

    @Value("${screenshot.path}")
    private Path path;

    @LazyAutowired
    private Faker faker;

    @PostConstruct
    public void init(){
        System.out.println("Screenshot util lazy test");
    }

    public void takeScreenShot(){
        File file = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
        try {
            FileCopyUtils.copy(file,path.resolve(faker.name().firstName() + dateTime.getNano() + ".png").toFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
