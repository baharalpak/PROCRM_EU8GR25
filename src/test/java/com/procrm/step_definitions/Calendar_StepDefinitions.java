package com.procrm.step_definitions;

import com.procrm.pages.CalendarPage;
import com.procrm.pages.LoginPage;
import com.procrm.utilities.ConfigurationReader;
import com.procrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static org.openqa.selenium.Keys.ENTER;

public class Calendar_StepDefinitions {

    CalendarPage calendarPage = new CalendarPage();
    LoginPage loginPage = new LoginPage();


    @Given("User is on Agileprocrm url successfully")
    public void user_is_on_agileprocrm_url_successfully() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @When("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        calendarPage.login(username,password);

    }


    @When("User click on Log In button")
    public void user_click_on_button() {
        loginPage.loginButton.click();

    }



    @When("User should land on home page")
    public void user_should_land_on_home_page() {


    }



    @When("User click {string} button")
    public void user_click_button(String calendar) {


    }
    @Then("User verify displaying {string} function successfully")
    public void user_verify_displaying_function_successfully(String string) {

    }

    @When("User enters username {string} and  password {string}")
    public void user_enters_username_and_password(String string, String string2) {

    }

    @When("User display {string} function")
    public void user_display_function(String string) {

    }
    @When("User should be able to see {string} page")
    public void user_should_be_able_to_see_page(String string) {

    }
    @Then("Verify that User {string} the {string} on My Calendar page successfully")
    public void verify_that_user_the_on_my_calendar_page_successfully(String string, String string2) {

    }









}
