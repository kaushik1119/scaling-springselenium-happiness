package com.springboot.seleniumspring.resourceTest;

import com.springboot.seleniumspring.SpringBaseTestNG;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.FileCopyUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ResourcesTest extends SpringBaseTestNG {

    @Value("classpath:data/testdata.csv")
    //@Value("file:C:\\Kaushik\\selenium-spring\\selenium-spring\\src\\test\\resources\\data\\testdata.csv")
    private Resource resource;

    @Value("classpath:data/url.csv")
    private Resource urlResource;

    @Value("${screenshot.path}")
    private Path path;

    @Autowired
    private ResourceLoader resourceLoader;


    @Test
    public void testResources() throws IOException {
        Files.readAllLines(resource.getFile().toPath())
                .forEach(System.out::println);
    }

    @Test(dataProvider = "getData")
    public void urlTest(String url,String out) throws IOException {
        FileCopyUtils.copy(resourceLoader.getResource(url).getInputStream(),
                            Files.newOutputStream(path.resolve(out)));


    }







    @DataProvider
    public Object[][] getData() throws IOException {
        return Files.readAllLines(urlResource.getFile().toPath())
                .stream()
                .map(s -> s.split(","))
                .toArray(Object[][]::new);
    }




}
