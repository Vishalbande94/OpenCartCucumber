package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    WebDriver driver;
    public RegisterPage(WebDriver driver){
       this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id = 'input-firstname']")
    WebElement txtFirstName;

    @FindBy(xpath = "//input[@id = 'input-lastname']")
    WebElement txtLastName;

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement txtEmail;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement txtPassword;

    @FindBy(xpath = "//input[@name='agree']")
    WebElement chkAgree;

    @FindBy(xpath = "//button[contains(@type,'submit')]")
    WebElement btnContinue;

    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement msgRegisterSuccess;

    //Actions
    public void SetFirstName(String userName){
        txtFirstName.sendKeys(userName);

    }
    public void SetLastName(String lastName){
        txtLastName.sendKeys(lastName);

    }
    public void SetPassword(String password){
        txtPassword.sendKeys(password);

    }
    public void checkAgree(){
        Actions ac=new Actions(driver);
        ac.moveToElement(chkAgree).click().build().perform();
        //chkAgree.click();

    }
    public void clickContinue(){
        btnContinue.click();

    }
    public String getSuccessMessage(){
       String SuccessMessage= msgRegisterSuccess.getText();

        return SuccessMessage;
    }
    public void setEmail(String email){
        txtEmail.sendKeys(email);
    }








}
