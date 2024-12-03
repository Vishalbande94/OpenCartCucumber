package testDefinition;

import hooks.Hooks;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.HomePage;

public class CartItems {
    WebDriver driver= Hooks.getDriver();
    HomePage hp;
    @Given("user navigates to cart")
    public void user_navigates_to_cart() {
        hp=new HomePage(driver);
        hp.ClickOnAddToCart();
    }
    @When("user clicks on view cart")
    public void user_clicks_on_view_cart() {
       hp.ClickOnShoppingCart();

    }
    @Then("cart should displayed all items")
    public void cart_should_displayed_all_items() {
        hp.VerifyCartItems();
        boolean cartStatus=hp.VerifyCartItems().equalsIgnoreCase("Your shopping cart is empty!");
        Assert.assertTrue(cartStatus);
    }
}
