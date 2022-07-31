package com.procrm.step_definitions;

import com.github.javafaker.Faker;
import com.procrm.pages.AppreciationPage;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Appreciation_StepDefinitions {

    AppreciationPage AppreciationPage = new AppreciationPage();
    Faker faker = new Faker();
    String harryPotterQuoter;
    List<String> contacts;
    List<String> contacts2;
    String chuckNorrisFacts;


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

    @When("User adds below emails from Employees and Departments contact lists")
    public void user_adds_below_emails_from_employees_and_departments_contact_lists(DataTable dataTable) throws InterruptedException {

        Driver.getDriver().switchTo().frame(AppreciationPage.messageBoxIframe);
        AppreciationPage.emptyMessageBox.clear();
        BrowserUtilities.sleep(2);
        AppreciationPage.emptyMessageBox.sendKeys(faker.educator().university());
        BrowserUtilities.sleep(2);
        Driver.getDriver().switchTo().parentFrame();

        AppreciationPage.addMoreButton.click();
        AppreciationPage.employeesAndDepartmentsButton.click();
        BrowserUtilities.sleep(2);

        contacts = dataTable.asList();



        for (String contact : contacts) {
            AppreciationPage.choosingContacts.sendKeys(contact + Keys.ENTER);
        }


        AppreciationPage.excludingAllEmployees.click();
        AppreciationPage.sendButton.click();

    }

    @Then("users should be added successfully")
    public void users_should_be_added_successfully() {

        String contacts1 = contacts.get(0);
        String contacts2 = contacts.get(1);
        String contacts3 = contacts.get(2);

        Assert.assertEquals("expected: " + contacts+ " but actual: " + AppreciationPage.getTopUsersData(),contacts1+", "+contacts2+", "+contacts3 , AppreciationPage.topUserData.getText());
    }

    @When("User adds a text and the URL address of the link")
    public void user_adds_a_text_and_the_url_address_of_the_link() {
        AppreciationPage.addLinkAndText();
    }

    @Then("link should be attached successfully")
    public void link_should_be_attached_successfully() {

        Assert.assertEquals("https://www.youtube.com/", AppreciationPage.urlLink.getAttribute("href"));


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
        BrowserUtilities.sleep(1);
        Driver.getDriver().switchTo().frame(AppreciationPage.quotationBoxIframe);
        AppreciationPage.quotationBox.clear();
        BrowserUtilities.sleep(1);
        harryPotterQuoter = faker.harryPotter().quote();
        AppreciationPage.quotationBox.sendKeys(harryPotterQuoter);
        BrowserUtilities.sleep(1);
        Driver.getDriver().switchTo().parentFrame();
        AppreciationPage.sendButton.click();

    }

    @Then("quotes should be created successfully")
    public void quotes_should_be_created_successfully() {
        Assert.assertEquals("expected: " + harryPotterQuoter + " but actual: " + AppreciationPage.getTopQuotationText(), harryPotterQuoter, AppreciationPage.topQuotation.getText());

    }

    @When("User adds mention")
    public void user_adds_mention() {
        AppreciationPage.addingMention();


    }

    @Then("mentions should be created successfully")
    public void mentions_should_be_created_successfully() {
        Driver.getDriver().navigate().refresh();
        BrowserUtilities.sleep(1);

        String a1 = contacts2.get(0);
        String a2 = contacts2.get(1);
        String a3 = contacts2.get(2);

        BrowserUtilities.sleep(1);
        Assert.assertEquals(a1, Driver.getDriver().findElement(By.xpath("(//div[@class='feed-post-text-block-inner-inner']//a[text()='"+a1+"'])[1]")).getText());
        BrowserUtilities.sleep(1);
        Assert.assertEquals(a2, Driver.getDriver().findElement(By.xpath("(//div[@class='feed-post-text-block-inner-inner']//a[text()='"+a2+"'])[1]")).getText());
        BrowserUtilities.sleep(1);
        Assert.assertEquals(a3, Driver.getDriver().findElement(By.xpath("(//div[@class='feed-post-text-block-inner-inner']//a[text()='"+a3+"'])[1]")).getText());
        BrowserUtilities.sleep(1);

    }

    @When("User writes message as it is mandatory to send appreciation")
    public void user_writes_message_as_it_is_mandatory_to_send_appreciation() {
        BrowserUtilities.sleep(1);
        Driver.getDriver().switchTo().frame(AppreciationPage.messageBoxIframe);
        AppreciationPage.emptyMessageBox.clear();
        BrowserUtilities.sleep(1);
        chuckNorrisFacts = faker.chuckNorris().fact();
        AppreciationPage.emptyMessageBox.sendKeys(chuckNorrisFacts);
        BrowserUtilities.sleep(1);
        Driver.getDriver().switchTo().parentFrame();
        AppreciationPage.sendButton.click();


    }

    @Then("appreciation should be sent successfully")
    public void appreciation_should_be_sent_successfully() {
        WebElement chuckNorrisMessages = Driver.getDriver().findElement(By.xpath("(//div[text()='" + chuckNorrisFacts + "'])"));

        Assert.assertEquals("expected: " + chuckNorrisFacts + " but actual: " + chuckNorrisMessages.getText(), chuckNorrisFacts, chuckNorrisMessages.getText());

    }

    @When("User adds below emails from Employees and Departments contact lists to mention")
    public void user_adds_below_emails_from_employees_and_departments_contact_lists_to_mention(DataTable dataTable2) {



        AppreciationPage.addingMention();

        contacts2 = dataTable2.asList();

        for (String contact : contacts2) {

            AppreciationPage.chooseContacts(contact);



        }
        AppreciationPage.excludingAllEmployees.click();
        AppreciationPage.sendButton.click();

    }


}
