package com.punnyajoshi.webmastery.components;

import com.punnyajoshi.webmastery.actions.TextBox;
import com.punnyajoshi.webmastery.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchModal extends HeaderComponent{

    @FindBy(id = "Search-In-Modal")
    private WebElement inputBoxEle;

    public SearchModal(WebDriver webDriver) {
        super(webDriver);
    }

    public ProductsPage input(String key){
        TextBox.typing(inputBoxEle, key);
        inputBoxEle.submit();
        return new ProductsPage(webDriver);
    }

}
