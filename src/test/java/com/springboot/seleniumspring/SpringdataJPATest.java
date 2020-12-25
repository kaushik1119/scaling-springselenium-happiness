package com.springboot.seleniumspring;

import com.springboot.seleniumspring.entity.User;
import com.springboot.seleniumspring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.Date;

public class SpringdataJPATest extends SpringBaseTestNG {

    @Autowired
    private UserRepository userRepository;


    @Test
    public void getDataFromRepository(){
        System.out.println(userRepository.findAll().size() + "\n");
        userRepository.findById(2)
                .ifPresent(user -> System.out.println(user.getFirstName()));

        System.out.println(
                userRepository.findByFromCountry("India")
                .get(0)
                .getFirstName()
        );
    }

    @Test(dataProvider = "getData")
    public void testFromDataProvider(User user){
        System.out.println(
                user.getFirstName() + " " +
                user.getLastName() + " was born on " +
                        user.getDob()
        );

    }

    @DataProvider
    public Object[] getData(){
        return userRepository.findByDobBetween(Date.valueOf("1995-01-01"), Date.valueOf("1999-01-01"))
                .stream()
                .limit(3)
                .toArray();
    }

    @DataProvider
    public Object[] getDataFromTestNgXml(ITestContext ctx){
        //create parameters dobFrom and dobTo in the test xml to access them here
        return userRepository.findByDobBetween(
                Date.valueOf(ctx.getCurrentXmlTest().getParameter("dobFrom")),
                Date.valueOf(ctx.getCurrentXmlTest().getParameter("dobTo")))
                .stream()
                .limit(3)
                .toArray();
    }
}
