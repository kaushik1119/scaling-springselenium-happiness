package com.springboot.seleniumspring.Pages;

import com.springboot.seleniumspring.base.annotations.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

@Page
public class SearchComponent extends Base {
    private By searchBox = By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input");
    private By search = By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]");

    public SearchComponent searchText(String text){
        sendKeys(searchBox,text);
        sendKeys(searchBox, Keys.TAB);
        return this;
    }

    public void clickSearch(){
        clickElement(search);
    }







    @Override
    public boolean pageLoadWait() {
        return webDriverWait.until(driver -> driver.findElement(searchBox).isDisplayed());
    }
}
