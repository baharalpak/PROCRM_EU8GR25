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
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;

public class MyProfileStepDefinitions {

    MyProfilePage myProfilePage = new MyProfilePage();

    Actions action = new Actions(Driver.getDriver());

    Faker faker = new Faker();

    @Given("HR user is on homepage")
    public void hr_user_is_on_homepage() {
        BasePage.loginAsHR();
    }

    @When("HR user clicks on profile name")
    public void hr_user_clicks_on_profile_name() {
        myProfilePage.profileName.click();
        BrowserUtilities.sleep(3);
    }

    @When("clicks on My Profile link from dropdown menu")
    public void clicks_on_my_profile_link_from_dropdown_menu() {
        myProfilePage.myProfileLink.click();
        BrowserUtilities.sleep(5);
    }

    @Then("HR user should be able to see personal information under Contact Information")
    public void hr_user_should_be_able_to_see_personal_information_under_contact_information() {
        Assert.assertTrue(myProfilePage.contactInformation.isDisplayed());
    }

    @Given("marketing user is on homepage")
    public void marketing_user_is_on_homepage() {
        BasePage.loginAsMarketing();
    }

    @When("marketing user clicks on profile name")
    public void marketing_user_clicks_on_profile_name() {
        myProfilePage.profileName.click();
        BrowserUtilities.sleep(3);
    }

    @Then("marketing user should be able to see personal information under Contact Information")
    public void marketing_user_should_be_able_to_see_personal_information_under_contact_information() {
        Assert.assertTrue(myProfilePage.contactInformation.isDisplayed());
    }

    @Given("helpdesk is on homepage")
    public void helpdesk_is_on_homepage() {
        BasePage.loginAsHelpDesk();
    }

    @When("helpdesk user clicks on profile name")
    public void helpdesk_user_clicks_on_profile_name() {
        myProfilePage.profileName.click();
        BrowserUtilities.sleep(3);
    }

    @Then("helpdesk user should be able to see personal information under Contact Information")
    public void helpdesk_user_should_be_able_to_see_personal_information_under_contact_information() {
        Assert.assertTrue(myProfilePage.contactInformation.isDisplayed());
    }

    @Given("HR user click on My profile option")
    public void hr_user_click_on_my_profile_option() {
        BasePage.loginAsHR();
        myProfilePage.profileName.click();
        BrowserUtilities.sleep(5);
        myProfilePage.myProfileLink.click();
        BrowserUtilities.sleep(5);
    }

    @When("HR user clicks on Edit profile button")
    public void hr_user_clicks_on_edit_profile_button() {
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

    @Then("HR user should be able to see updated information on the profile page")
    public void hr_user_should_be_able_to_see_updated_information_on_the_profile_page() {

    }

    @Given("marketing user click on My profile option")
    public void marketing_user_click_on_my_profile_option() {
        BasePage.loginAsMarketing();
        myProfilePage.profileName.click();
        BrowserUtilities.sleep(5);
        myProfilePage.myProfileLink.click();
        BrowserUtilities.sleep(5);
    }

    @When("marketing user clicks on Edit profile button")
    public void marketing_user_clicks_on_edit_profile_button() {
        myProfilePage.editProfile.click();
        BrowserUtilities.sleep(5);
    }

    @Then("marketing user should be able to see updated information on the profile page")
    public void marketing_user_should_be_able_to_see_updated_information_on_the_profile_page() {

    }

    @Given("helpdesk user click on My profile option")
    public void helpdesk_user_click_on_my_profile_option() {
        BasePage.loginAsHelpDesk();
        myProfilePage.profileName.click();
        BrowserUtilities.sleep(5);
        myProfilePage.myProfileLink.click();
        BrowserUtilities.sleep(5);
    }

    @When("helpdesk user clicks on Edit profile button")
    public void helpdesk_user_clicks_on_edit_profile_button() {
        myProfilePage.editProfile.click();
        BrowserUtilities.sleep(5);
    }

    @Then("helpdesk user should be able to see updated information on the profile page")
    public void helpdesk_user_should_be_able_to_see_updated_information_on_the_profile_page() {

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

    @Then("Error message is thrown and marketing user can not edit profile")
    public void error_message_is_thrown_and_marketing_user_can_not_edit_profile() {

    }


    @Then("Error message is thrown and helpdesk user can not edit profile")
    public void error_message_is_thrown_and_helpdesk_user_can_not_edit_profile() {

    }

}
