package com.nextBaseCRM.tests;

import com.nextBaseCRM.pages.HomePageBosch;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class HomePageTestBosch extends TestBase {
    @Test
    public void VerifyHeaders (){
        HomePageBosch homePageBosch=new HomePageBosch();
        homePageBosch.VerifyHomePageHeaders();

    }
    @Test
    public void VerifyProduktyHeaders(){
        HomePageBosch homePageBosch=new HomePageBosch();
        homePageBosch.VerifyProduktyPageHeaders();
    }



}
