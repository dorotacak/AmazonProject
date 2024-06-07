package com.nextBaseCRM.tests;

import com.nextBaseCRM.pages.AmazonHomePage;
import org.testng.annotations.Test;

public class AmazonHomePageTest extends TestBase {
    @Test
    public void verifyResults() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.VerifyNumberOfResults();

    }

    @Test
    public void VerifyHeaders() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();// tworzę Object ......po polsku...., żeby ze strony class AmazonHomePage użyć wszystkie lokatory i metody
        amazonHomePage.VerifyHeaders();

    }

    @Test
    public void VerifyLogin() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.VerifyLogin();
    }

    @Test
    public void VerifyLoginHomework() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.VerifyLoginHomework();

    }

    @Test
    public void VerifyEmailAlertHomework() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.VerifyEmailAlertHomework();
    }

    @Test
    public void VerifyHappyPath() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.VerifyHappyPathHomework();

    }

    @Test
    public void VerifyInvalidEmailHomework() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.VerifyInvalidEmailHomework();
    }


    @Test
    public void VerifyNameAlertHomework () {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.VerifyNameAlertHomework();


    }
}

