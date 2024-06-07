package com.nextBaseCRM.pages;

import com.nextBaseCRM.utilities.BrowserUtils;
import com.nextBaseCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AmazonHomePage extends BasePage {

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchButton;

    @FindBy(id = "nav-search-submit-button")
    public WebElement searchItem;

    @FindBy(xpath = "//span[contains(text(),'143 results for')]")
    public WebElement result;

    @FindBy(id = "nav-hamburger-menu")
    public WebElement allMenu;

    @FindBy(xpath = "(//*[@*='nav-progressive-content']//a)[1]")
    public WebElement todaysDeals;

    @FindBy(xpath = "(//*[@*='nav-progressive-content']//a)[2]")
    public WebElement customerService;

    @FindBy(xpath = "(//*[@*='nav-progressive-content']//a)[3]")
    public WebElement registry;

    @FindBy(xpath = "(//*[@*='nav-progressive-content']//a)[4]")
    public WebElement giftCards;

    @FindBy(xpath = "(//*[@*='nav-progressive-content']//a)[5]")
    public WebElement sell;


    public void VerifyNumberOfResults() {
        LoginPage loginPage = new LoginPage();
        Driver.get("https://www.amazon.com/");
        searchButton.click();
        searchButton.sendKeys("chlorophyll");
        searchItem.click();
        Assert.assertTrue(result.getText().contains("143"));


    }

    public void VerifyHeaders() {
        LoginPage loginPage = new LoginPage();
        Driver.get("https://www.amazon.com/");
        Assert.assertEquals(allMenu.getText(), "All");
        Assert.assertEquals(todaysDeals.getText(), "Today's Deals");
        Assert.assertEquals(customerService.getText(), "Customer Service");
        Assert.assertEquals(registry.getText(), "Registry");
        Assert.assertEquals(giftCards.getText(), "Gift Cards");
        Assert.assertEquals(sell.getText(), "Sell");


    }

    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement helloSignin;

    @FindBy(className = "nav-action-inner")
    public WebElement signIn;

    @FindBy(id = "ap_email")
    public WebElement email;

    @FindBy(id = "continue")
    public WebElement continueButton;

    @FindBy(id = "ap_password")
    public WebElement passwordButton;

    @FindBy(id = "signInSubmit")
    public WebElement signButton;

    @FindBy(className = "a-alert-heading")
    public WebElement errorMessage;

    @FindBy(className = "a-list-item")
    public WebElement errorMessageSecond;

    @FindBy(id = "auth-email-missing-alert")
    public WebElement enterEmailMessage;

    @FindBy(id = "auth-create-account-link")
    public WebElement createAccount;

    @FindBy(id = "ap_customer_name")
    public WebElement yourName;

    @FindBy(id = "ap_email")
    public WebElement yourEmailOrMobile;

    @FindBy(id = "ap_password")
    public WebElement password;

    @FindBy(id = "auth-email-invalid-claim-alert")
    public WebElement wrongEmail;

    @FindBy(id="auth-customerName-missing-alert")
    public WebElement nameAlert;



    public void VerifyLogin() {
        LoginPage loginPage = new LoginPage();
        Driver.get("https://www.amazon.com/");
        BrowserUtils.hover(helloSignin);
        signIn.click();
        email.click();
        email.sendKeys("senem.a@wp.pl");
        continueButton.click();
        //passwordButton.sendKeys("24689");
        //signButton.click();
        Assert.assertEquals(errorMessage.getText(), "There was a problem");

    }

    public void VerifyLoginHomework() {
        LoginPage loginPage = new LoginPage();
        Driver.get("https://www.amazon.com/");
        BrowserUtils.hover(helloSignin);
        signIn.click();
        email.click();
        email.sendKeys("senemdorota@wp.pl");
        continueButton.click();
        Assert.assertEquals(errorMessageSecond.getText(), "We cannot find an account with that email address");
    }

    public void VerifyEmailAlertHomework() {
        LoginPage loginPage = new LoginPage();
        Driver.get("https://www.amazon.com/");
        BrowserUtils.hover(helloSignin);
        signIn.click();
        continueButton.click();
        Assert.assertEquals(enterEmailMessage.getText(), "Enter your email or mobile phone number");
        wrongEmail.isDisplayed();

    }

    public void VerifyHappyPathHomework() {
        LoginPage loginPage = new LoginPage();
        Driver.get("https://www.amazon.com/");
        BrowserUtils.hover(helloSignin);
        signIn.click();
        createAccount.click();
        yourName.click();
        yourName.sendKeys("Dorota Cakar");
        yourEmailOrMobile.click();
        yourEmailOrMobile.sendKeys("dorota@wp.pl");
        password.click();
        password.sendKeys("23456789");

    }

    public void VerifyInvalidEmailHomework() {
        LoginPage loginPage = new LoginPage();
        Driver.get("https://www.amazon.com/");
        BrowserUtils.hover(helloSignin);
        signIn.click();
        createAccount.click();
        yourName.click();
        yourName.sendKeys("Dorota Cakar");
        yourEmailOrMobile.click();
        yourEmailOrMobile.sendKeys("dorota");
        continueButton.click();
        Assert.assertTrue(wrongEmail.isDisplayed());


    }

    public void VerifyNameAlertHomework() {
        LoginPage loginPage = new LoginPage();
        Driver.get("https://www.amazon.com/");
        BrowserUtils.hover(helloSignin);
        signIn.click();
        createAccount.click();
        continueButton.click();
        Assert.assertTrue(nameAlert.isDisplayed());


    }
}
