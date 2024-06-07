package com.nextBaseCRM.tests;

import com.nextBaseCRM.pages.CompanyStructurePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompanyStructureTest extends TestBase{
    @Test
    public void verifyThatUserCanAddDepartment(){
        CompanyStructurePage companyStructurePage = new CompanyStructurePage();
        //companyStructurePage to object
        companyStructurePage.addDepartment();
    }
    @Test
    public void verifyThatUserCanNotAddDepartment(){
        CompanyStructurePage companyStructurePage = new CompanyStructurePage();
        companyStructurePage.notAddDepartment();

    }
}
