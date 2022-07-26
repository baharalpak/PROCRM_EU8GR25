package com.procrm.step_definitions;

import com.procrm.pages.CalendarTasksEventsPage;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class CalendarTasksEventsStepDefs {
    CalendarTasksEventsPage calendarTasksEventsPage = new CalendarTasksEventsPage();
    Actions action = new Actions(Driver.getDriver());

    @When("enters below event details and SAVE")
    public void enters_below_event_details(DataTable dataTable) throws InterruptedException {
        Map<String, String> map = dataTable.asMap(String.class, String.class);

        calendarTasksEventsPage.eventName.clear();
        calendarTasksEventsPage.eventName.sendKeys(map.get("Event Name"));

        calendarTasksEventsPage.importanceCheckBox.click();

        calendarTasksEventsPage.startDate.clear();
        calendarTasksEventsPage.startDate.sendKeys(map.get("Start Date"));
        calendarTasksEventsPage.startTime.clear();
        calendarTasksEventsPage.startTime.sendKeys(map.get("Start Time"));
        calendarTasksEventsPage.endDate.clear();
        calendarTasksEventsPage.endDate.sendKeys(map.get("End Date"));
        calendarTasksEventsPage.endTime.clear();
        calendarTasksEventsPage.endTime.sendKeys(map.get("End Time"));

        calendarTasksEventsPage.specifyTimeZone.click();
        Select selectStart = new Select(calendarTasksEventsPage.eventStartTimeZoneDropdown);
        selectStart.selectByVisibleText(map.get("TimeZone"));
        Select selectEnd = new Select(calendarTasksEventsPage.eventEndTimeZoneDropdown);
        selectStart.selectByVisibleText(map.get("TimeZone"));

        calendarTasksEventsPage.specifyRepeat.click();
        Select selectRepeat = new Select(calendarTasksEventsPage.specifyRepeat);
        selectRepeat.selectByVisibleText(map.get("Repeat"));

        calendarTasksEventsPage.locationDropdown.click();
        calendarTasksEventsPage.locationDropdown.sendKeys(map.get("Location"));

        calendarTasksEventsPage.attendeesDelButton.click();
        calendarTasksEventsPage.addPersonNmeGroupLink.click();
        //action.moveToElement(calendarTasksEvents.addPersonNmeGroupLink).click().build().perform();
        BrowserUtilities.sleep(3);
        calendarTasksEventsPage.attendeesInput.sendKeys(map.get("Attendees-1"));
        BrowserUtilities.sleep(3);
        calendarTasksEventsPage.attendeesInput.sendKeys("" + Keys.ENTER);
        //action.contextClick(calendarTasksEvents.addMoreAttendee);
        calendarTasksEventsPage.addMoreAttendee.click();
        BrowserUtilities.sleep(3);
        calendarTasksEventsPage.attendeesInput.sendKeys(map.get("Attendees-2") + Keys.ENTER);
        BrowserUtilities.sleep(3);

        calendarTasksEventsPage.more.click();

        Driver.getDriver().switchTo().frame(calendarTasksEventsPage.iframe);
        BrowserUtilities.waitForVisibility(calendarTasksEventsPage.description, 5);
        BrowserUtilities.clickWithJS(calendarTasksEventsPage.description);

        calendarTasksEventsPage.description.sendKeys(map.get("Description"));
        Driver.getDriver().switchTo().parentFrame();

        BrowserUtilities.clickWithJS(calendarTasksEventsPage.pinkColour);


        calendarTasksEventsPage.selectAvailability.click();
        BrowserUtilities.sleep(3);
        Select availability = new Select(calendarTasksEventsPage.selectAvailability);
        availability.selectByVisibleText(map.get("Availability"));

        calendarTasksEventsPage.saveButton.click();
        BrowserUtilities.sleep(5);
    }

    @Then("user verifies the new calendar event is displayed")
    public void user_verifies_the_new_calendar_event_is_displayed() {

    }

    @When("User click EDIT button")
    public void user_click_edit_button() {
        BrowserUtilities.sleep(3);
        calendarTasksEventsPage.filterAndSearch.sendKeys("Important Test Event" + Keys.ENTER);
        BrowserUtilities.sleep(3);
        calendarTasksEventsPage.searchedEvent.click();
        BrowserUtilities.sleep(3);
        BrowserUtilities.scrollToElement(calendarTasksEventsPage.editButton);
        calendarTasksEventsPage.editButton.click();
    }

    @When("Edit event name as {string}")
    public void edit_event_name_as(String string) {
        calendarTasksEventsPage.eventName.sendKeys("MY_TEST_EVENT");

    }

    @When("repeat section as {string} and save the event")
    public void repeat_section_as_and_save_the_event(String string) {
        //calendarTasksEventsPage.specifyRepeat.click();
        //  Select selectRepeat = new Select(calendarTasksEventsPage.specifyRepeat);
        // selectRepeat.selectByVisibleText("Daily");
        // calendarTasksEventsPage.saveButton.click();
    }

    @When("event color as {string}")
    public void event_color_as(String string) {
        BrowserUtilities.clickWithJS(calendarTasksEventsPage.moreButton);
        //BrowserUtilities.sleep(3);
        //calendarTasksEventsPage.otherColorSelect.click();
        //BrowserUtilities.scrollToElement(calendarTasksEventsPage.otherEventColor);


        //calendarTasksEventsPage.otherEventColor.click();
        //BrowserUtilities.sleep(2);
        //calendarTasksEventsPage.customColor.click();
        //BrowserUtilities.sleep(2);
        //calendarTasksEventsPage.colorValueBox.sendKeys("0052a7");

    }

    @When("his or her availability as {string}")
    public void his_her_availability_as(String string) {
        calendarTasksEventsPage.selectAvailability.click();
        BrowserUtilities.sleep(3);
        Select availability = new Select(calendarTasksEventsPage.selectAvailability);
        availability.selectByVisibleText("Unsure");
    }


    @Then("User should be able to see event with updated information")
    public void user_should_be_able_to_see_event_with_updated_information() {

    }

    @When("Edit event privacy as {string} and SAVE")
    public void edit_event_privacy_as(String string) {
        calendarTasksEventsPage.privacyCheckBox.click();
        calendarTasksEventsPage.saveButton.click();
    }

    @Then("HR User should be able to see the event as {string}")
    public void hr_user_should_be_able_to_see_the_event_as(String privacy) {
        String actualPrivacy = calendarTasksEventsPage.privacyCheckBox.getText();
        Assert.assertEquals("Private Event", actualPrivacy);
    }

    @Then("{string} user can not see the event on his or her calendar")
    public void user_can_not_see_the_event_on_his_her_calendar(String string) {


    }

    @When("Edit event location as {string}")
    public void edit_event_location_as(String string) {
        calendarTasksEventsPage.locationDropdown.click();
        calendarTasksEventsPage.locationDropdown.sendKeys("Central Meeting Room");
        calendarTasksEventsPage.saveButton.click();
    }

    @Then("verify user should be able create repeating event with certain location")
    public void verify_user_should_be_able_create_repeating_event_with_certain_location() {

    }

}
