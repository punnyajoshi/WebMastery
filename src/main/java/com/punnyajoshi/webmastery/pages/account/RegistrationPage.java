package com.punnyajoshi.webmastery.pages.account;

import com.punnyajoshi.webmastery.actions.TextBox;
import com.punnyajoshi.webmastery.models.User;
import com.punnyajoshi.webmastery.pages.BasePage;
import com.punnyajoshi.webmastery.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


    public class RegistrationPage extends BasePage {

        @FindBy(id = "RegisterForm-FirstName")
        private WebElement firstNameEle;

        @FindBy(id = "RegisterForm-LastName")
        private WebElement lastNameEle;

        @FindBy(id = "RegisterForm-email")
        private WebElement emailIdEle;

        @FindBy(id = "RegisterForm-password")
        private WebElement passwordEle;

        @FindBy(xpath = "//*[@id=\"create_customer\"]/button")
        private WebElement createButtonEle;

        public RegistrationPage(WebDriver webDriver) {
            super(webDriver);
        }

        public HomePage createAccount(User user) {
            TextBox.typing(firstNameEle, user.getFirstName());
//        firstNameEle.sendKeys(user.getFirstName());
            TextBox.typing(lastNameEle, user.getLastName());
//        lastNameEle.sendKeys(user.getLastName());
            TextBox.typing(emailIdEle, user.getEmail());
//        emailIdEle.sendKeys(user.getEmail());
            TextBox.typing(passwordEle, user.getPassword());
//        passwordEle.sendKeys(user.getPassword());
            buttonAction.click(createButtonEle);
//        createButtonEle.click();
            return new HomePage(webDriver);
        }
    }