package com.procrm.step_definitions;

import com.procrm.pages.CalendarTasksEventsPage;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
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
        BrowserUtilities.waitFor(3);
        calendarTasksEventsPage.attendeesInput.sendKeys(map.get("Attendees-1"));
        BrowserUtilities.waitFor(3);
        calendarTasksEventsPage.attendeesInput.sendKeys("" + Keys.ENTER);
        //action.contextClick(calendarTasksEvents.addMoreAttendee);
        calendarTasksEventsPage.addMoreAttendee.click();
        BrowserUtilities.waitFor(3);
        calendarTasksEventsPage.attendeesInput.sendKeys(map.get("Attendees-2") + Keys.ENTER);
        BrowserUtilities.waitFor(3);

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
        BrowserUtilities.waitFor(3);
        calendarTasksEventsPage.filterAndSearch.click();
        calendarTasksEventsPage.IamOrganizer.click();
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(calendarTasksEventsPage.searchedEvent.isDisplayed());
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
        BrowserUtilities.waitFor(3);
        BrowserUtilities.scrollToElement(calendarTasksEventsPage.more);
        BrowserUtilities.clickWithJS(calendarTasksEventsPage.more);
        BrowserUtilities.waitFor(3);
    }

    @When("Edit event location as {string}")
    public void edit_event_location_as(String string) {
        calendarTasksEventsPage.locationDropdown.clear();
        calendarTasksEventsPage.locationDropdown.sendKeys("Central Meeting Room");
        try {
            calendarTasksEventsPage.saveButton.click();
        } catch (UnhandledAlertException f) {
            try {
                Alert alert = Driver.getDriver().switchTo().alert();
                String alertMessage = Driver.getDriver().switchTo().alert().getText();
                System.out.println(alertMessage);
                BrowserUtilities.waitFor(5);
                alert.accept();
            } catch (NoAlertPresentException e) {
                e.printStackTrace();
            }
        }
    }

    @When("User clicks Save")
    public void user_clicks_save() {
        calendarTasksEventsPage.saveButton.click();
    }

    @Then("verify user should be able create repeating event with certain location")
    public void verify_user_should_be_able_create_repeating_event_with_certain_location() {
        calendarTasksEventsPage.filterAndSearch.click();
        action.doubleClick(calendarTasksEventsPage.searchedEvent).perform();
        String locationActual = calendarTasksEventsPage.locationDropdown.getText();
        String locationExpected = "Central Meeting Room";
        Assert.assertEquals("alertMessage", locationExpected, locationActual);
    }

    @When("Edit event color as {string}")
    public void edit_event_color_as(String string) {

    }

    @Then("Verify {string} is displayed with updated information")
    public void verify_is_displayed_with_updated_information(String string) {

    }

    @When("Edit {string}")
    public void edit(String string) {

    }

    @Then("HR User should be able to see the event as {string}")
    public void hr_user_should_be_able_to_see_the_event_as(String string) {

    }

    @Then("{string} user can not see the event on his or her calendar")
    public void user_can_not_see_the_event_on_his_or_her_calendar(String string) {

    }

    @When("Edit {string} as {string}")
    public void edit_as(String string, String string2) {

    }

    @Then("HR User can edit his or her availability.")
    public void hr_user_can_edit_his_or_her_availability() {

    }

    @When("User add attendee")
    public void user_add_attendee() {
        BrowserUtilities.waitForVisibility(calendarTasksEventsPage.addMoreAttendee, 10);
        calendarTasksEventsPage.addMoreAttendee.click();
        BrowserUtilities.waitFor(3);
        calendarTasksEventsPage.attendeesInput.sendKeys("marketing10@cybertekschool.com" + Keys.ENTER);
        BrowserUtilities.waitFor(3);


    }

    @Then("Verify that user should be able to add an attendee")
    public void verify_that_user_should_be_able_to_add_an_attendee() {

    }

    @When("User delete an attendee")
    public void user_delete_an_attendee() {

    }

    @Then("Verify that user should be able to delete an attendee")
    public void verify_that_user_should_be_able_to_delete_an_attendee() {

    }

    @When("User click Filter and search")
    public void user_click_filter_and_search() {
        calendarTasksEventsPage.filterAndSearch.click();
        BrowserUtilities.waitFor(3);
    }

    @When("User click INVITATIONS")
    public void user_click_invitation() {
        calendarTasksEventsPage.filterAndSearch.sendKeys("INVITATIONS");
        BrowserUtilities.waitFor(3);
    }

    @Then("Verify user should be able to display invitations by using {string} box")
    public void verify_user_should_be_able_to_display_invitations_by_using_box(String string) {
        BrowserUtilities.verifyElementDisplayed(calendarTasksEventsPage.invitationsCounter);
    }

    @When("Click I'M AN ORGANISER")
    public void click_i_m_an_organiser() {
        calendarTasksEventsPage.IamOrganizer.click();
    }

    @Then("verify that user should be able to display the related events")
    public void verify_that_user_should_be_able_to_display_the_related_events() {

    }

    @When("User select Yes under event with participants menu and Invited under participant status")
    public void user_select_yes_under_event_with_participants_menu_and_invited_under_participant_status() {
        calendarTasksEventsPage.eventWithParticipants.click();

    }

    @When("User click Search")
    public void user_click_search() {
        calendarTasksEventsPage.eventWithParticipantsSearch.click();
    }

    @When("User click Reset")
    public void user_click_reset() {
        calendarTasksEventsPage.reset.click();

    }

    @Then("verify that user should be able to reset Filter and Search options")
    public void verify_that_user_should_be_able_to_reset_filter_and_search_options() {

    }
}





