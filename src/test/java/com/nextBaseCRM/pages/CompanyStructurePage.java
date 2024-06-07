package com.nextBaseCRM.pages;

import com.nextBaseCRM.utilities.BrowserUtils;
import com.nextBaseCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;


public class CompanyStructurePage extends BasePage{//BasePage - pod parents page to co tutaj będzie wymienione
    @FindBy(xpath = "//*[text()='Add department']")
    public WebElement addDepartment;

    @FindBy(xpath = "//input[@id='NAME']")
    public WebElement departmentName;

    @FindBy(xpath = "//*[text()='Add']")
    public WebElement addButton;

        @FindBy(xpath = "(//*[@class='menu-item-link-text'])[10]")
        public WebElement employees;

        @FindBy(xpath = "//*[text()='Message']")
        public WebElement message;

        @FindBy(xpath = "//*[text()='Task']")
        public WebElement task;

    @FindBy(xpath = "//*[text()='Event']")
    public WebElement event;

    @FindBy(xpath = "//*[text()='Poll']")
    public WebElement poll;

    @FindBy(xpath = "//*[text()='More']")
    public WebElement more;

    @FindBy(className ="menu-popup-item-text")
    public List<WebElement> moreOptions;


    public void addDepartment(){
        LoginPage loginPage=new LoginPage();
        loginPage.loginAsHR();//hr11@cybertekschool.com
        employees.click();


        addDepartment.click();
        departmentName.sendKeys("IT");


        addButton.click();
        String actualDepartment= Driver.get("https://www.bosch-home.pl/sklep").findElement(By.xpath("//*[text()='IT']")).getText();
        String expectedDepartment="IT";
        Assert.assertEquals(actualDepartment,expectedDepartment);


    }
    public void notAddDepartment(){
        LoginPage loginPage=new LoginPage();
        loginPage.loginAsHelpdesk();//hr11@cybertekschool.com
        employees.click();
        BrowserUtils.waitForPageToLoad(5);
        Assert.assertFalse(addButton.isDisplayed());

    }
    public void verifyAllOptionsInActivityStream(){;
        LoginPage loginPage=new LoginPage();
        loginPage.loginAsHR();//hr11@cybertekschool.com;

        Assert.assertTrue(message.isDisplayed());
        Assert.assertTrue(task.isDisplayed());
        Assert.assertTrue(event.isDisplayed());
        Assert.assertTrue(poll.isDisplayed());
        Assert.assertTrue(more.isDisplayed());


    }
    public void verifyAllOptionsInMoreStream() {

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR();
        more.click();
        for ( WebElement options: moreOptions){
            Assert.assertTrue(options.isDisplayed());
        }



    }

}
