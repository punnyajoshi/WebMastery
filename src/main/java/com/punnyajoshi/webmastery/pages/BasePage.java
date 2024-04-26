package com.punnyajoshi.webmastery.pages;

import com.punnyajoshi.webmastery.actions.ButtonAction;
import com.punnyajoshi.webmastery.actions.TextBox;
import com.punnyajoshi.webmastery.actions.WebActions;
import com.punnyajoshi.webmastery.components.HeaderComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver webDriver;
    protected ButtonAction buttonAction;

    protected TextBox textBoxActions;

    protected WebActions webActions;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        this.buttonAction = new ButtonAction(webDriver);
        this.textBoxActions = new TextBox(webDriver);
        this.webActions = new WebActions(webDriver);
    }

    public HeaderComponent getHeader(){
        return new HeaderComponent(webDriver);
    }
}
