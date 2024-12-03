package testDefinition;

import hooks.Hooks;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class AddToCart {
    WebDriver driver= Hooks.getDriver();
    HomePage hp;
    LoginPage lp;
    @Given("user logged in and lands on home page")
    public void user_logged_in_and_lands_on_home_page() {
        hp=new HomePage(driver);
        hp.ClickPageLogo();

    }

    @When("user search product as {string}")
    public void user_search_product_as(String mobile) {
       hp.setSearchBox(mobile);
       hp.clickSearch();
    }

    @Then("search result should displayed")
    public void search_result_should_displayed() {
        boolean status=hp.VerifySearchResult().equalsIgnoreCase("There is no product that matches the search criter");
        Assert.assertTrue(status);
    }

}
