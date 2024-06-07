package com.nextBaseCRM.pages;

import com.nextBaseCRM.utilities.BrowserUtils;
import com.nextBaseCRM.utilities.ConfigurationReader;
import com.nextBaseCRM.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;



public class HomePageBosch extends BasePage {


    @FindBy(partialLinkText = "/sklep")
    public WebElement sklep;

    @FindBy(partialLinkText = "/serwis")
    public WebElement serwis;

    @FindBy(partialLinkText = "/mybosch")
    public WebElement myBosch;

    @FindBy(partialLinkText = "/akcjekonsumenckie")
    public WebElement akcjeKonsumenckie;

    @FindBy(xpath = "//button[@class='a-button a-button-primary js-accept']//span[text()='Akceptuję']\n")
    public WebElement cokkies;


    public void VerifyHomePageHeaders() {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.bosch-home.pl/sklep");
        driver.manage().window().maximize();

        BrowserUtils.waitFor(5);

        Assert.assertEquals(produkty.getText(), "Produkty");
        Assert.assertEquals(sklep.getText(), "Sklep");
        Assert.assertEquals(serwis.getText(), "Serwis");
        Assert.assertEquals(myBosch.getText(), "MyBosch");
        Assert.assertEquals(akcjeKonsumenckie.getText(), "Akcje konsumenckie");


    }
    @FindBy(xpath = "//span[text()='Produkty']")
    public WebElement produkty;


    @FindBy(xpath = "//span[contains(text()='Wyszukiwarka produktów')]")
    public WebElement wyszukiwarkaProduktow;

    @FindBy(xpath = "//span[@class='text' and text()='Gotowanie i pieczenie']")
    public WebElement gotowanieIpieczenie;

    @FindBy(xpath = "//span[@class='text' and text()='Pranie i suszenie']")
    public WebElement pranieIsuszenie;

    @FindBy(xpath = "//span[@class='text' and text()='Zmywanie']")
    public WebElement zmywanie;

    @FindBy(xpath = "//span[@class='text' and text()='Chłodzenie i zamrażanie']")
    public WebElement chlodzenieIzamrazanie;

    @FindBy(xpath = "//span[@class='text' and text()='Ekspresy do kawy']")
    public WebElement ekspresyDoKawy;

    @FindBy(xpath = "//span[@class='text' and text()='Urządzenia śniadaniowe']")
    public WebElement urządzeniaSniadaniowe;

    @FindBy(xpath = "//span[@class='text' and text()='RobotyKuchenne']")
    public WebElement robotyKuchenne;

    @FindBy(xpath = "//span[@class='text' and text()='Drobny Sprzęt Kuchenny']")
    public WebElement drobnySprzetKuchenny;

    @FindBy(xpath = "//span[@class='text' and text()='Odkurzanie']")
    public WebElement odkurzanie;


    public void VerifyProduktyPageHeaders() {
LoginPage loginPage=new LoginPage();
Driver.get("https://www.bosch-home.pl/sklep");
        //WebDriverManager.edgedriver().setup();
       // WebDriver driver = new EdgeDriver();
       // driver.get("https://www.bosch-home.pl/sklep");
        //driver.manage().window().maximize();

        BrowserUtils.waitFor(10);

        produkty.click();
        Assert.assertEquals(wyszukiwarkaProduktow.getText(), "Wyszukiwarka produktów");
        Assert.assertEquals(gotowanieIpieczenie.getText(), "Gotowanie i pieczenie");
        Assert.assertEquals(pranieIsuszenie.getText(), "Pranie i suszenie");
        Assert.assertEquals(zmywanie.getText(), "Zmywanie");
        Assert.assertEquals(chlodzenieIzamrazanie.getText(), "Chłodzenie i zamrażanie");
        Assert.assertEquals(ekspresyDoKawy.getText(), "Ekspresy do kawy");
        Assert.assertEquals(urządzeniaSniadaniowe.getText(), "Urządzenie śniadaniowe");
        Assert.assertEquals(robotyKuchenne.getText(), "Roboty kuchenne");
        Assert.assertEquals(drobnySprzetKuchenny.getText(), "Drobny sprzęt kuchenny");
        Assert.assertEquals(odkurzanie.getText(), "Odkurzanie");


    }
}
