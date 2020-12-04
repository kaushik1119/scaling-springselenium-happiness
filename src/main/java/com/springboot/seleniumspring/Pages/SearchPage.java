package com.springboot.seleniumspring.Pages;

import org.openqa.selenium.By;

public class SearchPage extends Base {
    private By searchBox = By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input");
    private By search = By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]");

    public void searchText(String text){
        webDriver.findElement(searchBox).sendKeys(text);
    }







    @Override
    public boolean pageLoadWait() {
        return webDriverWait.until(driver -> driver.findElement(searchBox).isDisplayed());
    }
}
