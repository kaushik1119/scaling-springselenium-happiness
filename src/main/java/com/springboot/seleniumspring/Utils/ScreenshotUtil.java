package com.springboot.seleniumspring.Utils;


import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private WebDriver driver;

    @Autowired
    LocalDateTime dateTime;

    @Value("${screenshot.path}")
    private Path path;

    @PostConstruct
    public void init(){
        System.out.println("Screenshot util lazy test");
    }

    public void takeScreenShot(){
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileCopyUtils.copy(file,path.resolve(dateTime.getNano() + ".png").toFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
