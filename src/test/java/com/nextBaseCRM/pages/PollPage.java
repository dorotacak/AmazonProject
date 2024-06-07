package com.nextBaseCRM.pages;

import com.google.inject.spi.BindingTargetVisitor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class PollPage extends BasePage {
    @FindBy(xpath = "//*[text()='Poll']")//selenium znajdz dzięki locatorowi
    public WebElement poll;//selenium nadaj nazwę tego co znalazłeś

    @FindBy(xpath = "//*[text()='All employees']")
    public WebElement deliveryToAllEmployers;

    @FindBy(xpath = "//*[@contenteditable='true']")
    public WebElement messageBox;

    @FindBy(id = "question_0")
    public WebElement question;

    @FindBy(id = "answer_0__0_")
    public WebElement answer1;

    @FindBy(id = "answer_0__1_")
    public WebElement answer2;

    @FindBy(id = "blog-submit-button-save")
    public WebElement send;

    @FindBy(className = "bx-vote-question-title")
    public WebElement questionTitle;

    @FindBy(id = "multi_0")
    public WebElement allowChoice;

    @FindBy(className = "feed-add-info-text")
    public WebElement messageError;

    @FindBy(className = "feed-add-info-text")
    public WebElement messageAppreciationError;

    @FindBy(className = "feed-add-post-del-but")
    public WebElement removePerson;

    @FindBy(className = "feed-add-info-text")
    public WebElement questionError;

    @FindBy(className = "feed-add-info-text")
    public WebElement answerError;

    @FindBy(xpath = "//*[text()='More']")
    public WebElement more;

    @FindBy(xpath = "//*[text()='Appreciation']")
    public WebElement appreciation;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancel;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesIcon;

    @FindBy(className = "wd-fa-add-file-light-text")//????????
    public WebElement uploadFilesAndImages;

    @FindBy(className = "insert-btn-text")
    public WebElement insertInTextButton;

    @FindBy(className = "diskuf-label")
    public WebElement attachedFilesAndImages;

    @FindBy(xpath = "//*[text()='My Drive / Uploaded files']")
    public WebElement uploadedFiles;

    @FindBy(xpath = "//span[@class='menu-item-link-text' and contains(text(),'Drive')]")
    public WebElement driveButton;

    @FindBy(className = "main-buttons-item-text-title")
    public List<WebElement> moreOptionsMyDrive;

    @FindBy(xpath = "//span[@class='menu-item-link-text' and contains(text(),'Company')]")
    public WebElement companyButton;

    @FindBy(className = "main-buttons-item-link")
    public List<WebElement> moreCompanyOptions;

    @FindBy(xpath = "//*[@title='Click to insert file']")
    public WebElement UploadedFileName;



    public void VerifyDefaultDelivery() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR();
        poll.click();
        Assert.assertTrue(deliveryToAllEmployers.isDisplayed());//aseest pokazuje/weryfikuje że widzimy co trzeba, że to prawda

    }

    public void VerifyCreatingPoll() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR();
        poll.click();
        messageBox.sendKeys("abc");
        question.sendKeys("Are You young");
        answer1.sendKeys("Yes");
        answer2.sendKeys("No");
        send.click();
        Assert.assertEquals(questionTitle.getText(), "Are You young");

    }

    public void VerifyAllowChoice() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR();
        poll.click();
        allowChoice.click();
        Assert.assertTrue(allowChoice.isSelected());
    }

    public void VerifyMessageError() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR();
        poll.click();
        question.sendKeys("Are You young");
        answer1.sendKeys("Yes");
        answer2.sendKeys("No");
        send.click();
        Assert.assertEquals(messageError.getText(), "The message title is not specified");
    }

    public void VerifyPersonError() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR();
        poll.click();
        removePerson.click();
        question.sendKeys("Are You young");
        answer1.sendKeys("Yes");
        answer2.sendKeys("No");
        send.click();
        Assert.assertEquals(messageError.getText(), "Please specify at least one person.");

    }

    public void VerifyQuestionError() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR();
        poll.click();
        answer1.sendKeys("Yes");
        answer2.sendKeys("No");
        send.click();
        Assert.assertEquals(questionError.getText(), "The question text is not specified.");

    }

    public void VerifyAnswerError() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR();
        poll.click();
        question.sendKeys("Are You young");
        send.click();
        Assert.assertEquals(answerError.getText(), "The question \"HOW ARE U\" has no answers.");

    }

    public void VerifyAppreciationErrorMessage() {//zadanie 11.1
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR();
        more.click();
        appreciation.click();
        send.click();
        Assert.assertEquals(messageAppreciationError.getText(), "The message title is not specified");


    }

    public void VerifyAppreciationErrorPerson() {//zadanie 11.1
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR();
        more.click();
        appreciation.click();
        removePerson.click();
        send.click();
        Assert.assertEquals(messageError.getText(), "Please specify at least one person.");
    }

    public void VerifyAppreciationAllEmployersDefaultDelivery() {//11.2
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR();
        more.click();
        appreciation.click();
        Assert.assertTrue(deliveryToAllEmployers.isDisplayed());


    }

    public void VerifyCancellingAppreciationMessage() {//zadanie 11.3
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR();
        more.click();
        appreciation.click();
        cancel.click();

    }

    public void VerifyUploadingFiles() {//zadanie 12
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR();
        more.click();
        appreciation.click();
        uploadFilesIcon.click();
        uploadFilesAndImages.click();
        uploadFilesAndImages.sendKeys("C:\\Users\\Ali\\Desktop\\Nowy dokument tekstowy.txt");
        String actualFileName=UploadedFileName.getText();
        String expectedFileName="Nowy dokument tekstowy.txt";
        Assert.assertEquals(actualFileName, expectedFileName);

    }

    public void VerifyDriveOptions() {//zad 13 ok

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR();
        driveButton.click();
        for (WebElement driveOptions : moreOptionsMyDrive)
            Assert.assertTrue(driveOptions.isDisplayed());

    }

    public void VerifyCompanyOptions() {// zad 14

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsHR();
        companyButton.click();
        for (WebElement company : moreCompanyOptions)
            Assert.assertTrue(company.isDisplayed());
    }

}









