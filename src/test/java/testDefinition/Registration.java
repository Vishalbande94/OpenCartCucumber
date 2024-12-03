package testDefinition;

import factory.BaseClass;

import hooks.Hooks;
import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

import java.util.Map;


public class Registration {
    WebDriver driver= Hooks.getDriver();
    HomePage hp;
    RegisterPage rp;



    //Verify Registration Functionality
    @Given("User lands on open cart application for registration")
    public void user_lands_on_open_cart_application_for_registration() {
        hp = new HomePage(driver);
        hp.ClickPageLogo();

    }

    @When("user clicks on profile icon for registration")
    public void user_clicks_on_profile_icon_for_registration() {

        hp.ClickMyAccount();
    }

    @When("User clicks on register button")
    public void user_clicks_on_register_button() {

        hp.clickRegisterBtn();
    }

    @When("Enters all valid details as below")
    public void enters_all_valid_details_as_below(DataTable dataTable) {
        Map<String, String> dataMap = dataTable.asMap(String.class, String.class);
        rp = new RegisterPage(driver);
        rp.SetFirstName(dataMap.get("First Name").trim());
        rp.SetLastName(dataMap.get("Last Name").trim());
        // rp.setEmail(dataMap.get("Email").trim());
        rp.setEmail(BaseClass.randomAlphaNumeric() + "@gmail.com");
        rp.SetPassword(dataMap.get("Password").trim());

    }

    @When("Clicks on privacy toggle")
    public void clicks_on_privacy_toggle() {
        rp.checkAgree();
    }

    @When("Clicks on continue button")
    public void clicks_on_continue_button() {
        rp.clickContinue();
    }

    @Then("Account should register successfully")
    public void account_should_register_successfully() {

        boolean status = rp.getSuccessMessage().equalsIgnoreCase("Your Account Has Been Created!");
        Assert.assertTrue(status);
        System.out.println(rp.getSuccessMessage());
        System.out.println(BaseClass.randomAlphaNumeric() + "@gmail.com");


    }


}
