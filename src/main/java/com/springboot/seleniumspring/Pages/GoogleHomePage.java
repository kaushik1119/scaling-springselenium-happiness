package com.springboot.seleniumspring.Pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class GoogleHomePage extends Base {

    @Autowired
    private SearchComponent searchComponent;

    @Autowired
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
