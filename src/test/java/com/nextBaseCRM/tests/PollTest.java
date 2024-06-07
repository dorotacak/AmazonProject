package com.nextBaseCRM.tests;

import com.nextBaseCRM.pages.PollPage;
import org.testng.annotations.Test;

public class PollTest extends TestBase {
    @Test
    public void allEmployersIsDefault() {//default-otworzyłam stronę i widzę to, nie wybieram, ja to od razu widzę
        PollPage pollPage = new PollPage();
        pollPage.VerifyDefaultDelivery();

    }

    @Test
    public void verifyCreatingPoll() {
        PollPage pollPage = new PollPage();
        pollPage.VerifyCreatingPoll();//jak łopatologicznie??
    }

    @Test
    public void verifyAllowChoice() {
        PollPage pollPage = new PollPage();
        pollPage.VerifyAllowChoice();
    }

    @Test
    public void verifyMessageError() {
        PollPage pollPage = new PollPage();
        pollPage.VerifyMessageError();
    }

    @Test
    public void verifyPersonError() {
        PollPage pollPage = new PollPage();
        pollPage.VerifyPersonError();

    }

    @Test
    public void verifyQuestionError() {
        PollPage pollPage = new PollPage();
        pollPage.VerifyQuestionError();

    }

    @Test
    public void verifyAnswerError() {
        PollPage pollPage = new PollPage();
        pollPage.VerifyAnswerError();
    }

    @Test
    public void verifyAppreciationErrorMessage() {//test ok
        PollPage pollPage = new PollPage();
        pollPage.VerifyAppreciationErrorMessage();

    }

    @Test
    public void verifyAppreciationErrorPerson() {//test ok ale bez tektu w messageBox
        PollPage pollPage = new PollPage();
        pollPage.VerifyAppreciationErrorPerson();

    }

    @Test
    public void verifyAppreciationAllEmployersDefaultDelivery() {//test ok
        PollPage pollPage = new PollPage();
        pollPage.VerifyAppreciationAllEmployersDefaultDelivery();

    }

    @Test
    public void verifyCancellingMessage() {//test ok
        PollPage pollPage = new PollPage();
        pollPage.VerifyCancellingAppreciationMessage();

    }

    @Test
    public void verifyUploadingFiles() {//załączniki
        PollPage pollPage = new PollPage();
        pollPage.VerifyUploadingFiles();

    }

    @Test
    public void verifyDriveOptions() {//test ok, zad 13
        PollPage pollPage = new PollPage();
        pollPage.VerifyDriveOptions();

    }

    @Test
    public void verifyCompanyOptions() {//test ok zad 14
        PollPage pollPage = new PollPage();
        pollPage.VerifyCompanyOptions();
    }
}