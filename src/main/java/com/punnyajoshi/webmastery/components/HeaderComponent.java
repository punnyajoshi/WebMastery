package com.punnyajoshi.webmastery.components;

import com.punnyajoshi.webmastery.pages.BasePage;
import com.punnyajoshi.webmastery.pages.HomePage;
import com.punnyajoshi.webmastery.pages.account.LoginPage;
import com.punnyajoshi.webmastery.pages.account.ProfilePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderComponent extends BasePage {

    @FindBy(xpath = "//*[@id=\"shopify-section-header\"]/sticky-header/header/div/a[1]")
    private WebElement AccountLoginEle;

    @FindBy(xpath = "//*[@id=\"shopify-section-header\"]/sticky-header/header/div/a[1]")
    private WebElement profileLoginEle;

    @FindBy(xpath = "//*[@id=\"shopify-section-header\"]/sticky-header/header/nav/ul/li[1]/a/span")
    private WebElement homeLinkEle;

    @FindBy(xpath = "//*[@id=\"shopify-section-header\"]/sticky-header/header/div/details-modal/details/summary/span")
    private WebElement searchBtnEle;

    public HeaderComponent(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPage navToLogin() {
        buttonAction.click(AccountLoginEle);
        return new LoginPage(webDriver);
    }

    public ProfilePage navToUserProfile() {
        buttonAction.click(profileLoginEle);
        return new ProfilePage(webDriver);
    }

    public HomePage navToHomePage(){
        buttonAction.click(homeLinkEle);
        return new HomePage(webDriver);
    }

    public SearchModal openSearchModel(){
        buttonAction.click(searchBtnEle);
        return new SearchModal(webDriver);
    }

}