package com.procrm.step_definitions;

import com.github.javafaker.Faker;
import com.procrm.pages.BasePage;
import com.procrm.pages.MyProfilePage;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MyProfileStepDefinitions {

    MyProfilePage myProfilePage = new MyProfilePage();

    Actions action = new Actions(Driver.getDriver());

    Faker faker = new Faker();

    @Given("{string} user is on homepage")
    public void user_is_on_homepage(String userType) {
        switch (userType.toLowerCase()) {
            case "hr":
                BasePage.loginAsHR();
                break;
            case "helpdesk":
                BasePage.loginAsHelpDesk();
                break;
            case "marketing":
                BasePage.loginAsMarketing();
                break;
        }
    }

    @When("user clicks on profile name")
    public void user_clicks_on_profile_name() {
        myProfilePage.profileName.click();
        BrowserUtilities.sleep(3);
    }

    @When("clicks on My Profile link from dropdown menu")
    public void clicks_on_my_profile_link_from_dropdown_menu() {
        myProfilePage.myProfileLink.click();
        BrowserUtilities.sleep(5);
    }

    @Then("user should be able to see personal information under Contact Information")
    public void user_should_be_able_to_see_personal_information_under_contact_information() {
        Assert.assertTrue(myProfilePage.contactInformation.isDisplayed());
    }

    @When("clicks on Edit profile button")
    public void clicks_on_edit_profile_button() {
        myProfilePage.editProfile.click();
        BrowserUtilities.sleep(5);
    }

    @When("provide e-mail,Web site,ICQ,phone,fax,mobile,work phone,extension number,skype and clicks SAVE button")
    public void provide_e_mail_web_site_icq_phone_fax_mobile_work_phone_extension_number_skype_and_clicks_save_button() {
        myProfilePage.email.clear();
        myProfilePage.webSite.clear();
        myProfilePage.ICQ.clear();
        myProfilePage.phoneNumber.clear();
        myProfilePage.faxNumber.clear();
        myProfilePage.mobileNumber.clear();
        myProfilePage.workPhone.clear();
        myProfilePage.extensionNumber.clear();
        myProfilePage.skype.clear();
        BrowserUtilities.sleep(5);
        action.sendKeys(myProfilePage.email, faker.bothify("######??@gmail.com")).perform();
        action.sendKeys(myProfilePage.webSite, faker.letterify("www.#########.com")).perform();
        action.sendKeys(myProfilePage.ICQ, faker.numerify("?????")).perform();
        action.sendKeys(myProfilePage.phoneNumber, faker.phoneNumber().phoneNumber()).perform();
        action.sendKeys(myProfilePage.faxNumber, faker.phoneNumber().phoneNumber()).perform();
        action.sendKeys(myProfilePage.mobileNumber, faker.phoneNumber().cellPhone()).perform();
        action.sendKeys(myProfilePage.extensionNumber, faker.phoneNumber().extension()).perform();
        action.sendKeys(myProfilePage.skype, faker.name().username()).perform();
        action.click(myProfilePage.saveButton).perform();
        BrowserUtilities.sleep(5);

    }

    @Then("user should be able to see updated information on the profile page")
    public void user_should_be_able_to_see_updated_information_on_the_profile_page() {

    }

    @When("leave all the fields empty and clicks SAVE button")
    public void leave_all_the_fields_empty_and_clicks_save_button() {
        myProfilePage.email.clear();
        myProfilePage.webSite.clear();
        myProfilePage.ICQ.clear();
        myProfilePage.phoneNumber.clear();
        myProfilePage.faxNumber.clear();
        myProfilePage.mobileNumber.clear();
        myProfilePage.workPhone.clear();
        myProfilePage.extensionNumber.clear();
        myProfilePage.skype.clear();
        action.click(myProfilePage.saveButton).perform();
        BrowserUtilities.sleep(3);
    }

    @Then("Error message is thrown and HR user can not edit profile")
    public void error_message_is_thrown_and_hr_user_can_not_edit_profile() {
        Assert.assertTrue(myProfilePage.errorMessage_IncorrectEmail.isDisplayed());
        System.out.println(myProfilePage.errorMessage_IncorrectEmail.getText());
    }

    @Given("User is on home page")
    public void user_is_on_home_page() {
        BasePage.loginAsHR();
    }

    @When("user enters -££$$%%>- as phone number")
    public void user_enters_££$$_as_phone_number() {
        myProfilePage.phoneNumber.clear();
        action.sendKeys(myProfilePage.phoneNumber, "-££$$%%>-");
        action.click(myProfilePage.saveButton).perform();
        BrowserUtilities.sleep(5);
    }

    @Then("user should not be able to update profile")
    public void user_should_not_be_able_to_update_profile() {
        String updatedPhoneNumber = myProfilePage.phoneNumber.getText();
        if (!(updatedPhoneNumber.equals("-££$$%%>-"))) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed!!!");
        }
    }


}