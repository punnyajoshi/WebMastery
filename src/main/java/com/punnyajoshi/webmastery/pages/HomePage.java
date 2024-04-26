package com.punnyajoshi.webmastery.pages;

import com.punnyajoshi.webmastery.components.HeaderComponent;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public HeaderComponent getHeader() {
        return new HeaderComponent(webDriver);

    }

    public void search(String searchItem) {

        return;
    }
}
