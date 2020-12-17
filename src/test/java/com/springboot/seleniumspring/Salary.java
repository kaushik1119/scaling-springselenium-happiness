package com.springboot.seleniumspring;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Salary {

    private int amount;

    public Salary(){
        this.amount = 1000;
    }

    public int getAmount() {
        return amount;
    }
}
