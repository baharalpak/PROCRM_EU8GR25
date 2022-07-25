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
       // Assert.assertTrue(AppreciationPage.isFileNameMatching());
       // Assert.assertTrue(AppreciationPage.isPictureNameMatching());
    }

    @When("User adds users from Employees and Departments contact lists")
    public void user_adds_users_from_employees_and_departments_contact_lists() {
        AppreciationPage.addUsersButton.click();
        AppreciationPage.employeesAndDepartmentsButton.click();
        BrowserUtilities.sleep(2);
        AppreciationPage.email2.click();
        AppreciationPage.email1.click();
        BrowserUtilities.sleep(2);


    }
    @Then("users should be added successfully")
    public void users_should_be_added_successfully() {
        Assert.assertTrue(AppreciationPage.email2.isDisplayed());
        Assert.assertTrue(AppreciationPage.email1.isDisplayed());
    }

    @When("User adds a text and the URL address of the link")
    public void user_adds_a_text_and_the_url_address_of_the_link() {
        AppreciationPage.addLinkAndText();
    }
    @Then("link should be attached successfully")
    public void link_should_be_attached_successfully() {

        Assert.assertEquals("The title of the linked website",AppreciationPage.messageBox.getText());
        Assert.assertEquals("www.youtube.com",AppreciationPage.messageBox.getAttribute("href"));

    }

    @When("User adds video URLs")
    public void user_adds_video_ur_ls() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("videos should be inserted successfully")
    public void videos_should_be_inserted_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User creates a quote")
    public void user_creates_a_quote() {
        AppreciationPage.quoteIcon.click();
        BrowserUtilities.sleep(2);
        AppreciationPage.quotationBox.sendKeys("When life gives you lemons, make lemonade.");
        BrowserUtilities.sleep(2);
        AppreciationPage.messageBox.click();

    }
    @Then("quotes should be created successfully")
    public void quotes_should_be_created_successfully() {
        Assert.assertEquals("When life gives you lemons, make lemonade.",AppreciationPage.quotationBox.getText());
    }



}
