package pageObjects;

import net.bytebuddy.implementation.bind.annotation.This;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage (WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement txtEmail;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement txtPassword;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement btnLogin;

    //Actions
    public void setUserEmail(String email){
        txtEmail.sendKeys(email);
    }

    public void setUserPass(String pass){
        txtPassword.sendKeys(pass);
    }

    public void clickLogin(){
        btnLogin.click();
    }




}
