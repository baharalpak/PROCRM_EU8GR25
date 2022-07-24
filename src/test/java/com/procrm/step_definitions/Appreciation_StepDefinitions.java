package com.procrm.step_definitions;

import com.github.javafaker.App;
import com.procrm.pages.AppreciationPage;
import com.procrm.utilities.BrowserUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Appreciation_StepDefinitions {

    AppreciationPage AppreciationPage = new AppreciationPage();

    @When("User clicks on appreciation tab")
    public void user_clicks_on_appreciation_tab() {

        AppreciationPage.moreButton.click();
        BrowserUtilities.sleep(2);
        AppreciationPage.appreciationButton.click();
        BrowserUtilities.sleep(3);
    }

    @When("User uploads a file and a picture")
    public void user_uploads_a_file_and_a_picture() {

        AppreciationPage.uploadFile("C:\\Users\\User\\test docs\\file.xlsx");
        AppreciationPage.uploadPicture("C:\\Users\\User\\test docs\\image.jpg");
        //  AppreciationPage.sendButton.click();
        //  AppreciationPage.setUploadTime();
    }

    @Then("the file and the picture should be uploaded successfully")
    public void the_file_and_the_picture_should_be_uploaded_successfully() {

        Assert.assertTrue(AppreciationPage.isFilesAndImagesUploaded(2));
        // Assert.assertTrue(AppreciationPage.isFileUploaded());
        // Assert.assertTrue(AppreciationPage.isPictureUploaded());

    }

    @When("User adds users from Employees and Departments contact lists")
    public void user_adds_users_from_employees_and_departments_contact_lists() {
        AppreciationPage.addUsersButton.click();
        //AppreciationPage.userEmail.click();


    }
    @Then("users should be added successfully")
    public void users_should_be_added_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
