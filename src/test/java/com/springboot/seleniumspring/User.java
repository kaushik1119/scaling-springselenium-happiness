package com.springboot.seleniumspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    private Address address;
    @Autowired
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
