package testDefinition;

import hooks.Hooks;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Login {

    WebDriver driver= Hooks.getDriver();
    HomePage hp;
    LoginPage lp;

    @Given("User navigates on login page")
    public void user_navigates_on_login_page() {
        hp=new HomePage(driver);
        hp.ClickMyAccount();
        hp.clickLoginBtn();

    }
    @When("User enters email as {string} and password {string}")
    public void user_enters_email_as_and_password(String email, String pass) {
        lp=new LoginPage(driver);
        lp.setUserEmail(email);
        lp.setUserPass(pass);

    }
    @When("Clicks on login button")
    public void clicks_on_login_button() throws InterruptedException {
        lp.clickLogin();
        Thread.sleep(3000);

    }
    @Then("System should login and navigates on my account page")
    public void system_should_login_and_navigates_on_my_account_page() {
       String title= driver.getTitle();
        Assert.assertEquals("My Account",title);

    }

}
