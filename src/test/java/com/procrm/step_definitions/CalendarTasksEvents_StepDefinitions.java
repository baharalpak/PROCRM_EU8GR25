package com.procrm.step_definitions;

import com.procrm.pages.CalendarTasksEvents;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.ConfigurationReader;
import com.procrm.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.events.UIEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CalendarTasksEvents_StepDefinitions {
    CalendarTasksEvents calendarTasksEvents = new CalendarTasksEvents();
    Actions action = new Actions(Driver.getDriver());

    @When("enters below event details and SAVE")
    public void enters_below_event_details(DataTable dataTable) throws InterruptedException {
        Map<String, String> map = dataTable.asMap(String.class, String.class);

        calendarTasksEvents.eventDescription.clear();
        calendarTasksEvents.eventDescription.sendKeys(map.get("Description"));

        calendarTasksEvents.importanceCheckBox.click();

        calendarTasksEvents.startDate.clear();
        calendarTasksEvents.startDate.sendKeys(map.get("Start Date"));
        calendarTasksEvents.startTime.clear();
        calendarTasksEvents.startTime.sendKeys(map.get("Start Time"));
        calendarTasksEvents.endDate.clear();
        calendarTasksEvents.endDate.sendKeys(map.get("End Date"));
        calendarTasksEvents.endTime.clear();
        calendarTasksEvents.endTime.sendKeys(map.get("End Time"));

        calendarTasksEvents.specifyTimeZone.click();
        Select selectStart = new Select(calendarTasksEvents.eventStartTimeZoneDropdown);
        selectStart.selectByVisibleText(map.get("TimeZone"));
        Select selectEnd = new Select(calendarTasksEvents.eventEndTimeZoneDropdown);
        selectStart.selectByVisibleText(map.get("TimeZone"));

        calendarTasksEvents.specifyRepeat.click();
        Select selectRepeat = new Select(calendarTasksEvents.specifyRepeat);
        selectRepeat.selectByVisibleText(map.get("Repeat"));

        calendarTasksEvents.locationDropdown.click();
        calendarTasksEvents.locationDropdown.sendKeys(map.get("Location"));

        calendarTasksEvents.attendeesDelButton.click();
        calendarTasksEvents.addPersonNmeGroupLink.click();
        //action.moveToElement(calendarTasksEvents.addPersonNmeGroupLink).click().build().perform();
        BrowserUtilities.sleep(3);
        calendarTasksEvents.attendeesInput.sendKeys(map.get("Attendees-1"));
        BrowserUtilities.sleep(3);
        calendarTasksEvents.attendeesInput.sendKeys("" + Keys.ENTER);
        //action.contextClick(calendarTasksEvents.addMoreAttendee);
        calendarTasksEvents.addMoreAttendee.click();
        BrowserUtilities.sleep(3);
        calendarTasksEvents.attendeesInput.sendKeys(map.get("Attendees-2") + Keys.ENTER);
        BrowserUtilities.sleep(3);

        calendarTasksEvents.more.click();
        BrowserUtilities.clickWithJS(calendarTasksEvents.pinkColour);

        calendarTasksEvents.selectAvailability.click();
        BrowserUtilities.sleep(3);
        Select availability = new Select(calendarTasksEvents.selectAvailability);
        availability.selectByVisibleText(map.get("Availability"));

        BrowserUtilities.clickWithJS(calendarTasksEvents.saveButton);

    }


    @Then("user verifies the new calendar event is displayed")
    public void user_verifies_the_new_calendar_event_is_displayed() {

    }


    @When("User click EDIT button")
    public void user_click_edit_button() {

    }

    @When("Edit event name as {string}")
    public void edit_event_name_as(String string) {

    }

    @When("event color as {string}")
    public void event_color_as(String string) {

    }

    @When("his or her availability as {string}")
    public void his_her_availability_as(String string) {

    }

    @When("repeat section as {string} and save the event")
    public void repeat_section_as_and_save_the_event(String string) {

    }

    @Then("User should be able to see event with updated information")
    public void user_should_be_able_to_see_event_with_updated_information() {

    }

    @When("Edit event privacy as {string}")
    public void edit_event_privacy_as(String string) {

    }

    @Then("HR User should be able to see the event with updated information")
    public void hr_user_should_be_able_to_see_the_event_with_updated_information() {

    }

    @Then("{string} user can not see the event on his or her calendar")
    public void user_can_not_see_the_event_on_his_her_calendar(String string) {

    }
}
