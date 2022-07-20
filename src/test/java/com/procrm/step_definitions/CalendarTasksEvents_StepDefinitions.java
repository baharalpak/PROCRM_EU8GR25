package com.procrm.step_definitions;

import com.procrm.pages.CalendarTasksEvents;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.events.UIEvent;

import java.util.Map;

public class CalendarTasksEvents_StepDefinitions {
    CalendarTasksEvents calendarTasksEvents = new CalendarTasksEvents();
    Actions action = new Actions(Driver.getDriver());

    @When("enters below event details")
    public void enters_below_event_details(DataTable dataTable) {
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
    }

    @Then("user verifies the new calendar event is displayed")
    public void user_verifies_the_new_calendar_event_is_displayed() {

    }

}
