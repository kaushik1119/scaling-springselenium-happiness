package com.springboot.seleniumspring.Pages;

import com.springboot.seleniumspring.base.annotations.LazyAutowired;
import com.springboot.seleniumspring.base.annotations.Page;
import org.springframework.beans.factory.annotation.Value;

@Page
public class GoogleHomePage extends Base {

    @LazyAutowired
    private SearchComponent searchComponent;

    @LazyAutowired
    private SearchResult searchResult;

    @Value("${url}")
    private String url;
    public void goToPage(){
        webDriver.get(url);
    }

    public SearchComponent getSearchComponent() {
        return searchComponent;
    }

    public SearchResult getSearchResult() {
        return searchResult;
    }

    @Override
    public boolean pageLoadWait() {
        return webDriverWait.until(driver -> searchComponent.pageLoadWait());
    }
}
