package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement IconMyAccount;


    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement btnRegister;

    @FindBy(xpath = "//a[contains(text(),'Login') and (@class='dropdown-item')]")
    WebElement btnLogin;

    @FindBy(xpath = "//img[@title='Your Store']")
    WebElement LogoSite;

    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement TxtBoxSearch;

    @FindBy(xpath = "//button[@class='btn btn-light btn-lg']")
    WebElement BtnSearch;

    @FindBy(xpath = "//p[contains(text(),'There is no product that matches the search criter')]")
    WebElement SearchResult;

    @FindBy(xpath = "//span[normalize-space()='Shopping Cart']")
    WebElement btnCart;

    @FindBy(xpath = "//a[contains(text(),'Shopping Cart')]")
    WebElement btnShoppingCart;

    @FindBy(xpath = "//p[normalize-space()='Your shopping cart is empty!']")
    WebElement msgCartItems;

    //Actions

    public void GetPageLogo(){
       String AcIcon =LogoSite.getText();

    }
    public void ClickPageLogo(){
        LogoSite.click();;

    }
    public void ClickMyAccount(){
        IconMyAccount.click();

    }
    public void clickRegisterBtn(){
        btnRegister.click();
    }
    public void clickLoginBtn(){
        btnLogin.click();
    }

    public void setSearchBox(String mobile){
        TxtBoxSearch.sendKeys(mobile);
    }

    public void clickSearch(){
        BtnSearch.click();
    }

    public String VerifySearchResult(){

        String VerifyResult=SearchResult.getText();
        return VerifyResult;

    }
    public void ClickOnAddToCart(){
        btnCart.click();
    }
    public void ClickOnShoppingCart(){
        btnShoppingCart.click();
    }
    public String VerifyCartItems(){
        String CartMsg=msgCartItems.getText();
        return CartMsg;
    }




}
