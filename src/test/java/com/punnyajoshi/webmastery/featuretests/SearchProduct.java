package com.punnyajoshi.webmastery.featuretests;

import com.punnyajoshi.webmastery.BaseTest;
import com.punnyajoshi.webmastery.components.SearchModal;
import com.punnyajoshi.webmastery.models.SearchContext;
import com.punnyajoshi.webmastery.models.User;
import com.punnyajoshi.webmastery.pages.HomePage;
import com.punnyajoshi.webmastery.pages.ProductsPage;
import com.punnyajoshi.webmastery.pages.account.LoginPage;
import com.punnyajoshi.webmastery.pages.account.ProfilePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProduct extends BaseTest {



    @Test
    public void userIsAbleToSearchProductAfterLogin() {

        //arrange
        User user = User.builder().build().userWithValidCredentials();
        SearchContext searchContext = SearchContext.builder().build().init();

        //act
        HomePage homePage = new HomePage(getWebDriver());
        LoginPage loginPage = homePage.getHeader().navToLogin();
        ProfilePage profilePage = loginPage.login(user);
        profilePage.getHeader().openSearchModel();

        SearchModal searchModal = new SearchModal(getWebDriver());
        ProductsPage productsPage = searchModal.input(searchContext.getKey());

        int resultsCount = productsPage.getResultsCount();

        //assert
        Assert.assertTrue(resultsCount > 0);
    }

}


