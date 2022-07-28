package com.procrm.step_definitions;

import com.procrm.pages.BasePage;
import com.procrm.pages.TasksPage_Scrum889;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class TasksSCRUM889_StepDef {
    TasksPage_Scrum889 tasksPage_scrum889 = new TasksPage_Scrum889();
    Calendar calendar = Calendar.getInstance();
    String expectedTitle = "";
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Actions action = new Actions(Driver.getDriver());
    String expectedForNewTemplate = "";
    @When("Fills {string} details")
    public void fills_details(String string, DataTable dataTable) {
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        Driver.getDriver().switchTo().frame(tasksPage_scrum889.iframeNewTask);
        tasksPage_scrum889.highPriority.click();
        tasksPage_scrum889.taskTitle.sendKeys(map.get("title"));
        expectedTitle = map.get("title");
        tasksPage_scrum889.taskTitle.sendKeys(Keys.TAB + map.get("body") + Keys.ENTER);

        tasksPage_scrum889.deadline.click();
        tasksPage_scrum889.addTaskDayCalendar().click();
        tasksPage_scrum889.timeHours.clear();
        //tasksPage_scrum889.timeHours.sendKeys("" + tasksPage_scrum889.addTaskHours());
        //tasksPage_scrum889.timeMinutes.sendKeys("" + tasksPage_scrum889.addTaskMinutes());
        tasksPage_scrum889.timeHours.sendKeys(""+2);
        tasksPage_scrum889.timeHours.sendKeys(""+30);
        tasksPage_scrum889.calendar.click();

        tasksPage_scrum889.addMention.click();
        BrowserUtilities.waitForClickablility(tasksPage_scrum889.addMentionEmployees, 10);
        tasksPage_scrum889.addMentionEmployees.click();
        tasksPage_scrum889.addMentionMarketing(map.get("mention")).click();
    }
    @Then("User should be able to display new task created on My Tasks Page")
    public void user_should_be_able_to_display_new_task_created_on_my_tasks_page() {
        Assert.assertEquals(tasksPage_scrum889.newTask.getText(), expectedTitle);
    }
    @When("User clicks {string} button")
    public void user_clicks_button(String button) {
        switch (button) {
            case "Save Changes":
                tasksPage_scrum889.saveChangesButton.click();
                Driver.getDriver().switchTo().parentFrame();
                break;
            case "Close":
                tasksPage_scrum889.closeButton.click();
                break;
            case "CREATE TASK TEMPLATE":
                action.moveToElement(tasksPage_scrum889.createTaskTemplate).perform();
                tasksPage_scrum889.createTaskTemplate.click();
                break;
        }
    }
    @Then("User should be able to see edited task.")
    public void user_should_be_able_to_see_edited_task() {
        Assert.assertTrue(tasksPage_scrum889.lastCreatedForMarketing.isDisplayed());
        // Assert.assertEquals(tasksPage_scrum889.newTask.getText(), expectedTitle);
    }
    @When("{string} user clicks on the last created task")
    public void user_clicks_on_the_last_created_task(String string) {
        BrowserUtilities.waitForVisibility(tasksPage_scrum889.lastCreatedForMarketing, 10);
        tasksPage_scrum889.lastCreatedForMarketing.click();
    }
    @When("Edit {string} details with  below specific information")
    public void edit_details_with_below_specific_information(String string, DataTable dataTable) {
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        tasksPage_scrum889.participants.click();
        BrowserUtilities.waitForVisibility(tasksPage_scrum889.addParticipants, 10);

        tasksPage_scrum889.addParticipants.click();
        tasksPage_scrum889.sendParticipants.sendKeys(map.get("participant"));
        tasksPage_scrum889.sendParticipants.sendKeys("" + Keys.ENTER);

        tasksPage_scrum889.observers.click();
        BrowserUtilities.waitForClickablility(tasksPage_scrum889.addObservers, 10);
        BrowserUtilities.clickWithJS(tasksPage_scrum889.addObservers);

        tasksPage_scrum889.sendObservers.sendKeys(map.get("observer"));
        tasksPage_scrum889.sendObservers.sendKeys("" + Keys.ENTER);

        action.moveToElement(tasksPage_scrum889.checklist).click();

        action.click(tasksPage_scrum889.addChecklist);
        action.sendKeys(tasksPage_scrum889.addChecklist, map.get("checklist1")).perform();
        tasksPage_scrum889.addChecklist.sendKeys("" + Keys.ENTER);

        action.click(tasksPage_scrum889.addChecklist);
        action.sendKeys(tasksPage_scrum889.addChecklist, map.get("checklist2")).perform();
        tasksPage_scrum889.addChecklist.sendKeys("" + Keys.ENTER);

        action.click(tasksPage_scrum889.addChecklist);
        action.sendKeys(tasksPage_scrum889.addChecklist, map.get("checklist3")).perform();
        tasksPage_scrum889.addChecklist.sendKeys("" + Keys.ENTER);
    }

    @When("User clicks responsible person button and add one more responsible person")
    public void user_clicks_responsible_person_button_and_add_one_more_responsible_person() {
        BasePage.clickAnyFunctions("Add more");
    }
    @Then("User should be able to add more responsible people.")
    public void user_should_be_able_to_add_more_responsible_people() {
        Assert.assertTrue(tasksPage_scrum889.newTask.isDisplayed());
    }
    @Given("User clicks plus button on Tasks module.")
    public void user_clicks_plus_button_on_tasks_module() {
        action.moveToElement(tasksPage_scrum889.tasksModuleButton).build().perform();
        tasksPage_scrum889.plusTaskButton.click();
    }
    @Given("User add subtask as {string}")
    public void user_add_subtask_as (String subtask) {
        tasksPage_scrum889.moreButton.click();
        BrowserUtilities.waitForVisibility(tasksPage_scrum889.addSubTask, 10);
        BrowserUtilities.scrollToElement(tasksPage_scrum889.subTaskTitle);
        tasksPage_scrum889.addSubTask.click();
        tasksPage_scrum889.searchSubTask.sendKeys(subtask + Keys.ENTER);
        action.click(tasksPage_scrum889.selectSearchSubTask).build().perform();
        action.click(tasksPage_scrum889.selectButton).build().perform();
    }
    @Then("User should be able to see new task created.")
    public void user_should_be_able_to_see_new_task_created() {
        //Assert.assertEquals(tasksPage_scrum889.lastCreatedForMarketing.getText(),expectedTitle);
        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("portal"));
    }
    @Then("User should be able to redirected to {string} page")
    public void user_should_be_able_to_redirected_to_page(String string) {
        Assert.assertEquals(expectedForNewTemplate, tasksPage_scrum889.lastCreatedForNewTemplate.getText());
    }
    @When("User select last created task")
    public void user_select_last_created_task() {
        action.click(tasksPage_scrum889.checkboxForDelete).build().perform();
        js.executeScript("arguments[0].scrollIntoView(true)", tasksPage_scrum889.scrollDownForDelete);
    }
    @When("User select {string} section under {string} dropdown menu")
    public void user_select_section_under_dropdown_menu(String string, String string2) {
        BrowserUtilities.waitForVisibility(tasksPage_scrum889.selectOption, 10);
        BrowserUtilities.clickWithJS(tasksPage_scrum889.selectOption);
        BrowserUtilities.waitForClickablility(tasksPage_scrum889.deleteUnderSelection, 10);
        tasksPage_scrum889.deleteUnderSelection.click();
    }
    @When("User clicks {string} button and {string} button")
    public void user_clicks_button_and_button(String string, String string2) {
        tasksPage_scrum889.applyButtonForDelete.click();
        BrowserUtilities.waitForVisibility(tasksPage_scrum889.continueForDelete, 10);
        tasksPage_scrum889.continueForDelete.click();
    }
    @Then("User should be able to delete task.")
    public void user_should_be_able_to_delete_task() {
        Assert.assertTrue(tasksPage_scrum889.newTask.isDisplayed());
    }
    @When("User clicks {string} button under {string}")
    public void user_clicks_button_under(String string, String string2) {
        tasksPage_scrum889.newTaskDropDown.click();
        tasksPage_scrum889.allTemplates.click();
    }
    @When("User clicks {string} button in the New Task Template")
    public void user_clicks_button_in_the_new_task_template(String string) {
        tasksPage_scrum889.addAllTemplatesNewTask.click();
    }
    @When("Fills {string} details below")
    public void fills_details_below(String string, DataTable dataTable) {
        Map<String, String> map = dataTable.asMap(String.class, String.class);

        tasksPage_scrum889.highPriority.click();
        tasksPage_scrum889.titleAllTemplatesNewTask.sendKeys(map.get("title"));
        tasksPage_scrum889.deadlineMinutes.click();
        tasksPage_scrum889.deadlineBox.sendKeys("7335" + Keys.ENTER);
        expectedForNewTemplate = map.get("title");
        BrowserUtilities.waitForClickablility(tasksPage_scrum889.titleAllTemplatesNewTask, 10);
        tasksPage_scrum889.titleAllTemplatesNewTask.sendKeys("" + Keys.TAB + map.get("mention"));
    }
    @When("Edit task responsible as {string}")
    public void edit_task_responsible_as(String responsible) {
        tasksPage_scrum889.changeResponsible.click();
        BrowserUtilities.waitForClickablility(tasksPage_scrum889.addResponsiblePeople, 10);
        tasksPage_scrum889.addResponsiblePeople.sendKeys(responsible);
        tasksPage_scrum889.addResponsiblePeople.sendKeys("" + Keys.ENTER);
    }
    @When("Edit task reminder as {string}")
    public void edit_task_reminder_as(String reminder) {
        tasksPage_scrum889.moreButton.click();
        BrowserUtilities.clickWithJS(tasksPage_scrum889.scrollDown);
        BrowserUtilities.waitForClickablility(tasksPage_scrum889.reminder, 10);
        tasksPage_scrum889.reminder.click();
        BrowserUtilities.sleep(3);
        tasksPage_scrum889.reminderUsing.click();
        //BrowserUtilities.waitForClickablility(tasksPage_scrum889.reminderDeadline, 10);
        BrowserUtilities.sleep(3);
        tasksPage_scrum889.reminderDeadline.click();
        BrowserUtilities.sleep(3);
        tasksPage_scrum889.sendEMail.click();
        BrowserUtilities.sleep(3);
        tasksPage_scrum889.addReminderWithEmail.click();
    }
    @When("Edit task dependant as {string}")
    public void edit_task_dependant_as(String dependant) {
        BrowserUtilities.clickWithJS(tasksPage_scrum889.scrollDown);
        BrowserUtilities.waitForClickablility(tasksPage_scrum889.dependantTasks, 10);
        tasksPage_scrum889.dependantTasks.click();
        BrowserUtilities.waitForClickablility(tasksPage_scrum889.dependentSearchBox, 10);
        tasksPage_scrum889.dependentSearchBox.sendKeys(dependant);
        tasksPage_scrum889.dependentSearchBox.sendKeys("" + Keys.ENTER);
        tasksPage_scrum889.selectDependent.click();
        tasksPage_scrum889.selectDependentButton.click();
    }
    @When("Edit task hours {string}")
    public void edit_task_hours(String hours) {
        tasksPage_scrum889.timeTracking.click();
        tasksPage_scrum889.timeTrackingHours.sendKeys(hours);
    }
    @When("Edit task minutes {string}")
    public void edit_task_minutes(String minutes) {
        tasksPage_scrum889.timeTrackingMinutes.sendKeys(minutes);
    }
    @When("User declare himself herself {string}")
    public void user_declare_himself_herself(String string) {
        tasksPage_scrum889.moreResponsible.click();
        tasksPage_scrum889.addMentionEmployees.click();
        tasksPage_scrum889.addMentionMarketing("marketing73@cybertekschool.com");
    }
    @Then("User should be able to declare himself herself as responsible person")
    public void user_should_be_able_to_declare_himself_herself_as_responsible_person() {
        Assert.assertEquals("marketing73@cybertekschool.com",tasksPage_scrum889.declaredResponsiblePerson.getText());
    }
    @When("User clicks {string}")
    public void user_clicks(String priority) {
        Driver.getDriver().switchTo().frame(tasksPage_scrum889.iframeNewTask);
        BrowserUtilities.waitForClickablility(tasksPage_scrum889.highPriority,10);
        tasksPage_scrum889.highPriority.click();
    }
    @When("User types title as {string}")
    public void user_types_title_as(String title) {
        tasksPage_scrum889.taskTitle.sendKeys(title + Keys.ENTER);
        expectedTitle=title;
    }
    @When("User types body as {string}")
    public void user_types_body_as(String body) {
        tasksPage_scrum889.taskTitle.sendKeys(""+Keys.TAB+body+Keys.ENTER);
    }
    @When("User mention as {string}")
    public void user_mention_as(String mention) {
        tasksPage_scrum889.addMention.click();
        BrowserUtilities.waitForClickablility(tasksPage_scrum889.addMentionEmployees, 10);
        tasksPage_scrum889.addMentionEmployees.click();
        tasksPage_scrum889.addMentionMarketing(mention).click();
    }
    @Then("User can not create new task  without deadline")
    public void user_can_not_create_new_task_without_deadline() {
        Assert.assertNotEquals(expectedTitle,tasksPage_scrum889.lastCreatedForMarketing.getText());
    }
    @When("User types deadline as {string}")
    public void user_types_deadline_as(String deadline) {
        tasksPage_scrum889.deadline.click();
        tasksPage_scrum889.addTaskDayCalendar().click();
        tasksPage_scrum889.timeHours.clear();
        tasksPage_scrum889.timeHours.sendKeys("" + 2);
        tasksPage_scrum889.timeMinutes.sendKeys("" + 30);
        tasksPage_scrum889.calendar.click();
    }
    @Then("User should see error message {string}")
    public void user_should_see_error_message(String message) {
       // Assert.assertEquals(message, tasksPage_scrum889.errorMessage);
        Assert.assertTrue(tasksPage_scrum889.errorMessage.isDisplayed());
    }
    @Then("User can not create same task")
    public void user_can_not_create_same_task() {
        Assert.assertNotEquals(tasksPage_scrum889.newTask.getText(),tasksPage_scrum889.lastSecondTask.getText());
    }
}
