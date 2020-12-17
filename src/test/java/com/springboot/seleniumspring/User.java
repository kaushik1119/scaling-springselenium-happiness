package com.springboot.seleniumspring;

import com.springboot.seleniumspring.base.annotations.LazyAutowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class User {

    @LazyAutowired
    private Address address;
    @LazyAutowired
    private Salary salary;

    /*public User(Address address, Salary salary){
        this.address = address;
        this.salary = salary;
    }*/

    public void printDetails(){
        System.out.println("Address: " + address.getStreet());
        System.out.println("City: " + address.getCity());
        System.out.println("Salary: " + salary.getAmount());
    }


}
