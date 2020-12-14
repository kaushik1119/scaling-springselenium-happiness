package com.springboot.seleniumspring.Pages;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class SearchResult extends Base {
    By result = By.xpath("//div[@class=\"rc\"]");

    public int resultSize(){
        return getElementList(result).size();
    }

    @Override
    public boolean pageLoadWait() {
        return webDriverWait.until(driver -> !getElementList(result).isEmpty());
    }
}
