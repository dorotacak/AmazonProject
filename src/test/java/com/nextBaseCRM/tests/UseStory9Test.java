package com.nextBaseCRM.tests;

import com.nextBaseCRM.pages.CompanyStructurePage;
import org.testng.annotations.Test;

public class UseStory9Test extends TestBase{
    @Test
    public void AllOptionTest(){
        CompanyStructurePage companyStructurePage= new CompanyStructurePage();//creating object
        companyStructurePage.verifyAllOptionsInActivityStream();//tylko te metody o nazwie verifyAll,,, chce ze strony Page
    }

        @Test
        public void MoreOptionsTest(){//nazwa testu
            CompanyStructurePage companyStructurePage= new CompanyStructurePage();//żeby użyć wszystkie metody, muszę stworzyć object nazwa
            //to companyStructurePage żeby póżniej móc przwołać/osiagnąć wszystkie metody które są w środku page
            companyStructurePage.verifyAllOptionsInMoreStream();

        }
    }


