package com.punnyajoshi.webmastery.pages.account;

import com.punnyajoshi.webmastery.models.User;
import com.punnyajoshi.webmastery.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    User user=new User();

    @FindBy(id = "CustomerEmail")
    private WebElement emailInputEle;

    @FindBy(id = "CustomerPassword")
    private WebElement passwordInputEle;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/button")
    private WebElement signInBtnEle;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/a[2]")
    private WebElement createAccountLinkEle;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[@class='errors']//li")
    private WebElement errorBoxEle;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ProfilePage login(User user){
        emailInputEle.sendKeys(user.getEmail());
        passwordInputEle.sendKeys(user.getPassword());
        signInBtnEle.click();
        return new ProfilePage(webDriver);
    }

    public RegistrationPage navToCreateAccount() {
        buttonAction.click(createAccountLinkEle);
        return new RegistrationPage(webDriver);
    }

    public String getErrorMessage(){
        return webActions.getText(errorBoxEle);
    }

}