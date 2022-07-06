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


    @Given("{string} is on homepage")
    public void hr_user_is_on_homepage(String userType) {

        switch (userType.toLowerCase()){
            case "hr":
                BasePage.loginAsHelpDesk();
                break;

            case "helpdesk":
                BasePage.loginAsHelpDesk();
                break;

            case "marketing":
                BasePage.loginAsMarketing();
                break;
        }

    }

    @When("User click Calendar button")
    public void user_click_calendar_button() {

        calendarPage.calendarButton.click();

    }


    @Then("User should be able to display My Calendar page")
    public void user_should_be_able_to_display_my_calendar_page() {

       Assert.assertTrue(Driver.getDriver().getTitle().contains("Calendar"));

    }

    @Given("HR User is on homepage")
    public void hrUserIsOnHomepage() {
        BasePage.loginAsHR();
    }


    @When("User click ADD button")
    public void userClickADDButton() {
        calendarPage.addButton.click();
        BrowserUtilities.sleep(5);
    }

    @And("Fill event name as {string} and {string} and {string} click All day checkbox and save the event")
    public void fillEventNameAsAndDateAsAndClickAllDayCheckboxAndSaveTheEvent(String eventName, String eventStartDate, String eventEndDate) {

        BrowserUtilities.clickWithJS(calendarPage.eventNameBox);
        calendarPage.eventNameBox.sendKeys(eventName);
        calendarPage.dateFrom.click();
        BrowserUtilities.sleep(5);
        calendarPage.date_from_07_01.click();
        calendarPage.date_from_07_15.click();
        calendarPage.date_from_07_05.click();
        calendarPage.date_from_07_16.click();
        BrowserUtilities.sleep(5);
        calendarPage.dateTo.click();
        BrowserUtilities.sleep(5);
        calendarPage.date_to_07_02.click();
        calendarPage.date_to_07_03.click();
        calendarPage.date_to_07_14.click();
        calendarPage.date_to_07_17.click();
        BrowserUtilities.sleep(5);
        calendarPage.allDayBox.click();
        BrowserUtilities.sleep(5);
        calendarPage.saveButton.click();
    }

    @Then("User should be able to see event is created on the calendar")
    public void userShouldBeAbleToSeeEventIsCreatedOnTheCalendar() {


    }


    @And("User click Company Calendar button")
    public void userClickCompanyCalendarButton() {

        calendarPage.companyCalendarButton.click();
    }

    @Then("User should be able to display Company Calendar page")
    public void userShouldBeAbleToDisplayCompanyCalendarPage() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Calendar"));

    }







}

