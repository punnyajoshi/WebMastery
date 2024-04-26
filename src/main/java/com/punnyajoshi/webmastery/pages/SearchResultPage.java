package com.punnyajoshi.webmastery.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage {
    @FindBy(id = "ProductCountDesktop")
    private WebElement resultCountEle;

    public SearchResultPage(WebDriver webDriver){
        super();
    }

    public String getResulsCount(){
        return resultCountEle.getText();
    }
}
