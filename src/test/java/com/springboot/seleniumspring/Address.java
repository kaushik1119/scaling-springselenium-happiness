package com.springboot.seleniumspring;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    private String street;

    //value injection
    @Value("${city}")
    private String city;

    // street value set when object is created
    public Address(){
        this.street = "hammond drive";
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }
}
