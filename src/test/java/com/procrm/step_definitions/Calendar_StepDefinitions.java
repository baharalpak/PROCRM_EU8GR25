package com.procrm.step_definitions;

import com.procrm.pages.BasePage;
import com.procrm.pages.CalendarPage;
import com.procrm.pages.LoginPage;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.ConfigurationReader;
import com.procrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static org.openqa.selenium.Keys.ENTER;

public class Calendar_StepDefinitions {


    CalendarPage calendarPage = new CalendarPage();

    @Given("User is on Agileprocrm url successfully")
    public void user_is_on_agileprocrm_url_successfully() {
       Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Given("HR User is on homepage")
    public void hr_user_is_on_homepage() {

        BasePage.loginAsHR();

    }

    @When("User click Calendar button")
    public void user_click_calendar_button() {

        calendarPage.calendarButton.click();

    }
    @Then("User should be able to display My Calendar page")
    public void user_should_be_able_to_display_my_calendar_page() {

       Assert.assertTrue(Driver.getDriver().getTitle().contains("Calendar"));

    }

    @Given("Marketing User is on homepage")
    public void marketingUserIsOnHomepage() {
        BasePage.loginAsMarketing();
    }

    @Given("Helpdesk User is on homepage")
    public void helpdeskUserIsOnHomepage() {
        BasePage.loginAsHelpDesk();
    }

    @When("User click ADD button")
    public void userClickADDButton() {
        calendarPage.addButton.click();
        BrowserUtilities.sleep(5);
    }

    @And("Fill event name as {string} and date as {string} and click All day checkbox and save the event")
    public void fillEventNameAsAndDateAsAndClickAllDayCheckboxAndSaveTheEvent(String eventName, String eventDate) {

        //calendarPage.eventNameBox.click();
        //calendarPage.eventNameBox.clear();
        BrowserUtilities.sleep(5);
        calendarPage.eventNameBox.sendKeys(eventName);
        calendarPage.dateBox.sendKeys(eventDate);
        calendarPage.allDayBox.click();
        BrowserUtilities.sleep(5);
        calendarPage.saveButton.click();
    }

    @Then("User should be able to see event is created on the calendar")
    public void userShouldBeAbleToSeeEventIsCreatedOnTheCalendar() {


    }




}

