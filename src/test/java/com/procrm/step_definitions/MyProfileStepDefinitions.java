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



}
