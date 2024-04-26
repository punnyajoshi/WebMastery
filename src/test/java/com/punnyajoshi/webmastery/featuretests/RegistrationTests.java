package com.punnyajoshi.webmastery.featuretests;

import com.punnyajoshi.webmastery.BaseTest;
import com.punnyajoshi.webmastery.models.User;
import com.punnyajoshi.webmastery.pages.HomePage;
import com.punnyajoshi.webmastery.pages.account.LoginPage;
import com.punnyajoshi.webmastery.pages.account.ProfilePage;
import com.punnyajoshi.webmastery.pages.account.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseTest {
    @Test
    public void verifyThatFirstTimeUseIsAbleToRegister() {
        //arrange
        User user = User.builder().build().init();
        HomePage homePage = new HomePage(getWebDriver());
        LoginPage loginPage = homePage.getHeader().navToLogin();

        //act
        RegistrationPage registrationPage = loginPage.navToCreateAccount();
        homePage = registrationPage.createAccount(user);
        ProfilePage profilePage = homePage.getHeader().navToUserProfile();

        //assert
        String accountDetails = profilePage.getAccountDetails();
        Assert.assertTrue(accountDetails.contains(user.getFirstName()));
        Assert.assertTrue(accountDetails.contains(user.getLastName()));
    }

    @Test
    public void userShouldBeAbleToRegisterWithEmptyFirstName() {
        User user = User.builder().build().userWithEmptyFirstName();
        HomePage homePage = new HomePage(getWebDriver());
        LoginPage loginPage = homePage.getHeader().navToLogin();

        //act
        RegistrationPage registrationPage = loginPage.navToCreateAccount();
        homePage = registrationPage.createAccount(user);
        ProfilePage profilePage = homePage.getHeader().navToUserProfile();

        //assert
        String accountDetails = profilePage.getAccountDetails();
//        Assert.assertTrue(accountDetails.contains(user.getFirstName()));
        Assert.assertTrue(accountDetails.contains(user.getLastName()));
    }
}