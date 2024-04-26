package com.punnyajoshi.webmastery.featuretests;

import com.punnyajoshi.webmastery.BaseTest;
import com.punnyajoshi.webmastery.models.User;
import com.punnyajoshi.webmastery.pages.HomePage;
import com.punnyajoshi.webmastery.pages.account.LoginPage;
import com.punnyajoshi.webmastery.pages.account.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test
    public void userIsAbleToLoginAndRedirectToHomePage() {
        //arrange
        User user= User.builder().build().userWithValidCredentials();
        HomePage homePage=new HomePage(getWebDriver());

        //act
        LoginPage loginPage = homePage.getHeader().navToLogin();
        ProfilePage profilePage = loginPage.login(user);
        String accountDetails = profilePage.getAccountDetails();

        //assert
        Assert.assertTrue(accountDetails.contains(user.getFirstName()));
        Assert.assertTrue(accountDetails.contains(user.getLastName()));
    }

    @Test
    public void verifyThatUserIsAbleToLoginWithIncorrectCrediantials(){
        //arrange
        User user= User.builder().build().userWithInvalidCredentials();
        HomePage homePage=new HomePage(getWebDriver());

        //act
        LoginPage loginPage = homePage.getHeader().navToLogin();
        loginPage.login(user);
        String errorMessage = loginPage.getErrorMessage();

        //assert
        Assert.assertTrue(errorMessage.contains("Incorrect email or password."));

    }
}