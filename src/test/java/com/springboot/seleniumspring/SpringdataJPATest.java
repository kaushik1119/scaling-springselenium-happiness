package com.springboot.seleniumspring;

import com.springboot.seleniumspring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

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
}
