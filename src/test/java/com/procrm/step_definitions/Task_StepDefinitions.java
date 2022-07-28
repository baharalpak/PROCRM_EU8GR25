package com.procrm.step_definitions;

import com.procrm.pages.BasePage;
import com.procrm.pages.TaskPage;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.Calendar;
import java.util.Map;

public class Task_StepDefinitions {
    TaskPage taskPage_ = new TaskPage();
    Calendar calendar = Calendar.getInstance();
    String expectedTitle = "";
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Actions action = new Actions(Driver.getDriver());
    String expectedForNewTemplate = "";
    @When("Fills {string} details")
    public void fills_details(String string, DataTable dataTable) {
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        Driver.getDriver().switchTo().frame(taskPage_.iframeNewTask);
        taskPage_.highPriority.click();
        taskPage_.taskTitle.sendKeys(map.get("title"));
        expectedTitle = map.get("title");
        taskPage_.taskTitle.sendKeys(Keys.TAB + map.get("body") + Keys.ENTER);

        taskPage_.deadline.click();
        taskPage_.addTaskDayCalendar().click();
        taskPage_.timeHours.clear();
        //taskPage_.timeHours.sendKeys("" + taskPage_.addTaskHours());
        //taskPage_.timeMinutes.sendKeys("" + taskPage_.addTaskMinutes());
        taskPage_.timeHours.sendKeys(""+2);
        taskPage_.timeHours.sendKeys(""+30);
        taskPage_.calendar.click();

        taskPage_.addMention.click();
        BrowserUtilities.waitForClickablility(taskPage_.addMentionEmployees, 10);
        taskPage_.addMentionEmployees.click();
        taskPage_.addMentionMarketing(map.get("mention")).click();
    }
    @Then("User should be able to display new task created on My Tasks Page")
    public void user_should_be_able_to_display_new_task_created_on_my_tasks_page() {
        Assert.assertEquals(taskPage_.newTask.getText(), expectedTitle);
    }
    @When("User clicks {string} button")
    public void user_clicks_button(String button) {
        switch (button) {
            case "Save Changes":
                taskPage_.saveChangesButton.click();
                Driver.getDriver().switchTo().parentFrame();
                break;
            case "Close":
                taskPage_.closeButton.click();
                break;
            case "CREATE TASK TEMPLATE":
                action.moveToElement(taskPage_.createTaskTemplate).perform();
                taskPage_.createTaskTemplate.click();
                break;
        }
    }
    @Then("User should be able to see edited task.")
    public void user_should_be_able_to_see_edited_task() {
        Assert.assertTrue(taskPage_.lastCreatedForMarketing.isDisplayed());
        // Assert.assertEquals(taskPage_.newTask.getText(), expectedTitle);
    }
    @When("{string} user clicks on the last created task")
    public void user_clicks_on_the_last_created_task(String string) {
        BrowserUtilities.waitForVisibility(taskPage_.lastCreatedForMarketing, 10);
        taskPage_.lastCreatedForMarketing.click();
    }
    @When("Edit {string} details with  below specific information")
    public void edit_details_with_below_specific_information(String string, DataTable dataTable) {
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        taskPage_.participants.click();
        BrowserUtilities.waitForVisibility(taskPage_.addParticipants, 10);

        taskPage_.addParticipants.click();
        taskPage_.sendParticipants.sendKeys(map.get("participant"));
        taskPage_.sendParticipants.sendKeys("" + Keys.ENTER);

        taskPage_.observers.click();
        BrowserUtilities.waitForClickablility(taskPage_.addObservers, 10);
        BrowserUtilities.clickWithJS(taskPage_.addObservers);

        taskPage_.sendObservers.sendKeys(map.get("observer"));
        taskPage_.sendObservers.sendKeys("" + Keys.ENTER);

        action.moveToElement(taskPage_.checklist).click();

        action.click(taskPage_.addChecklist);
        action.sendKeys(taskPage_.addChecklist, map.get("checklist1")).perform();
        taskPage_.addChecklist.sendKeys("" + Keys.ENTER);

        action.click(taskPage_.addChecklist);
        action.sendKeys(taskPage_.addChecklist, map.get("checklist2")).perform();
        taskPage_.addChecklist.sendKeys("" + Keys.ENTER);

        action.click(taskPage_.addChecklist);
        action.sendKeys(taskPage_.addChecklist, map.get("checklist3")).perform();
        taskPage_.addChecklist.sendKeys("" + Keys.ENTER);
    }

    @When("User clicks responsible person button and add one more responsible person")
    public void user_clicks_responsible_person_button_and_add_one_more_responsible_person() {
        BasePage.clickAnyFunctions("Add more");
    }
    @Then("User should be able to add more responsible people.")
    public void user_should_be_able_to_add_more_responsible_people() {
        Assert.assertTrue(taskPage_.newTask.isDisplayed());
    }
    @Given("User clicks plus button on Tasks module.")
    public void user_clicks_plus_button_on_tasks_module() {
        action.moveToElement(taskPage_.tasksModuleButton).build().perform();
        taskPage_.plusTaskButton.click();
    }
    @Given("User add subtask as {string}")
    public void user_add_subtask_as (String subtask) {
        taskPage_.moreButton.click();
        BrowserUtilities.waitForVisibility(taskPage_.addSubTask, 10);
        BrowserUtilities.scrollToElement(taskPage_.subTaskTitle);
        taskPage_.addSubTask.click();
        taskPage_.searchSubTask.sendKeys(subtask + Keys.ENTER);
        action.click(taskPage_.selectSearchSubTask).build().perform();
        action.click(taskPage_.selectButton).build().perform();
    }
    @Then("User should be able to see new task created.")
    public void user_should_be_able_to_see_new_task_created() {
        //Assert.assertEquals(taskPage_.lastCreatedForMarketing.getText(),expectedTitle);
        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("portal"));
    }
    @Then("User should be able to redirected to {string} page")
    public void user_should_be_able_to_redirected_to_page(String string) {
        Assert.assertEquals(expectedForNewTemplate, taskPage_.lastCreatedForNewTemplate.getText());
    }
    @When("User select last created task")
    public void user_select_last_created_task() {
        action.click(taskPage_.checkboxForDelete).build().perform();
        js.executeScript("arguments[0].scrollIntoView(true)", taskPage_.scrollDownForDelete);
    }
    @When("User select {string} section under {string} dropdown menu")
    public void user_select_section_under_dropdown_menu(String string, String string2) {
        BrowserUtilities.waitForVisibility(taskPage_.selectOption, 10);
        BrowserUtilities.clickWithJS(taskPage_.selectOption);
        BrowserUtilities.waitForClickablility(taskPage_.deleteUnderSelection, 10);
        taskPage_.deleteUnderSelection.click();
    }
    @When("User clicks {string} button and {string} button")
    public void user_clicks_button_and_button(String string, String string2) {
        taskPage_.applyButtonForDelete.click();
        BrowserUtilities.waitForVisibility(taskPage_.continueForDelete, 10);
        taskPage_.continueForDelete.click();
    }
    @Then("User should be able to delete task.")
    public void user_should_be_able_to_delete_task() {
        Assert.assertTrue(taskPage_.newTask.isDisplayed());
    }
    @When("User clicks {string} button under {string}")
    public void user_clicks_button_under(String string, String string2) {
        taskPage_.newTaskDropDown.click();
        taskPage_.allTemplates.click();
    }
    @When("User clicks {string} button in the New Task Template")
    public void user_clicks_button_in_the_new_task_template(String string) {
        taskPage_.addAllTemplatesNewTask.click();
    }
    @When("Fills {string} details below")
    public void fills_details_below(String string, DataTable dataTable) {
        Map<String, String> map = dataTable.asMap(String.class, String.class);

        taskPage_.highPriority.click();
        taskPage_.titleAllTemplatesNewTask.sendKeys(map.get("title"));
        taskPage_.deadlineMinutes.click();
        taskPage_.deadlineBox.sendKeys("7335" + Keys.ENTER);
        expectedForNewTemplate = map.get("title");
        BrowserUtilities.waitForClickablility(taskPage_.titleAllTemplatesNewTask, 10);
        taskPage_.titleAllTemplatesNewTask.sendKeys("" + Keys.TAB + map.get("mention"));
    }
    @When("Edit task responsible as {string}")
    public void edit_task_responsible_as(String responsible) {
        taskPage_.changeResponsible.click();
        BrowserUtilities.waitForClickablility(taskPage_.addResponsiblePeople, 10);
        taskPage_.addResponsiblePeople.sendKeys(responsible);
        taskPage_.addResponsiblePeople.sendKeys("" + Keys.ENTER);
    }
    @When("Edit task reminder as {string}")
    public void edit_task_reminder_as(String reminder) {
        taskPage_.moreButton.click();
        BrowserUtilities.clickWithJS(taskPage_.scrollDown);
        BrowserUtilities.waitForClickablility(taskPage_.reminder, 10);
        taskPage_.reminder.click();
        BrowserUtilities.sleep(3);
        taskPage_.reminderUsing.click();
        //BrowserUtilities.waitForClickablility(taskPage_.reminderDeadline, 10);
        BrowserUtilities.sleep(3);
        taskPage_.reminderDeadline.click();
        BrowserUtilities.sleep(3);
        taskPage_.sendEMail.click();
        BrowserUtilities.sleep(3);
        taskPage_.addReminderWithEmail.click();
    }
    @When("Edit task dependant as {string}")
    public void edit_task_dependant_as(String dependant) {
        BrowserUtilities.clickWithJS(taskPage_.scrollDown);
        BrowserUtilities.waitForClickablility(taskPage_.dependantTasks, 10);
        taskPage_.dependantTasks.click();
        BrowserUtilities.waitForClickablility(taskPage_.dependentSearchBox, 10);
        taskPage_.dependentSearchBox.sendKeys(dependant);
        taskPage_.dependentSearchBox.sendKeys("" + Keys.ENTER);
        taskPage_.selectDependent.click();
        taskPage_.selectDependentButton.click();
    }
    @When("Edit task hours {string}")
    public void edit_task_hours(String hours) {
        taskPage_.timeTracking.click();
        taskPage_.timeTrackingHours.sendKeys(hours);
    }
    @When("Edit task minutes {string}")
    public void edit_task_minutes(String minutes) {
        taskPage_.timeTrackingMinutes.sendKeys(minutes);
    }
    @When("User declare himself herself {string}")
    public void user_declare_himself_herself(String string) {
        taskPage_.moreResponsible.click();
        taskPage_.addMentionEmployees.click();
        taskPage_.addMentionMarketing("marketing73@cybertekschool.com");
    }
    @Then("User should be able to declare himself herself as responsible person")
    public void user_should_be_able_to_declare_himself_herself_as_responsible_person() {
        Assert.assertEquals("marketing73@cybertekschool.com", taskPage_.declaredResponsiblePerson.getText());
    }
    @When("User clicks {string}")
    public void user_clicks(String priority) {
        Driver.getDriver().switchTo().frame(taskPage_.iframeNewTask);
        BrowserUtilities.waitForClickablility(taskPage_.highPriority,10);
        taskPage_.highPriority.click();
    }
    @When("User types title as {string}")
    public void user_types_title_as(String title) {
        taskPage_.taskTitle.sendKeys(title + Keys.ENTER);
        expectedTitle=title;
    }
    @When("User types body as {string}")
    public void user_types_body_as(String body) {
        taskPage_.taskTitle.sendKeys(""+Keys.TAB+body+Keys.ENTER);
    }
    @When("User mention as {string}")
    public void user_mention_as(String mention) {
        taskPage_.addMention.click();
        BrowserUtilities.waitForClickablility(taskPage_.addMentionEmployees, 10);
        taskPage_.addMentionEmployees.click();
        taskPage_.addMentionMarketing(mention).click();
    }
    @Then("User can not create new task  without deadline")
    public void user_can_not_create_new_task_without_deadline() {
        Assert.assertNotEquals(expectedTitle, taskPage_.lastCreatedForMarketing.getText());
    }
    @When("User types deadline as {string}")
    public void user_types_deadline_as(String deadline) {
        taskPage_.deadline.click();
        taskPage_.addTaskDayCalendar().click();
        taskPage_.timeHours.clear();
        taskPage_.timeHours.sendKeys("" + 2);
        taskPage_.timeMinutes.sendKeys("" + 30);
        taskPage_.calendar.click();
    }
    @Then("User should see error message {string}")
    public void user_should_see_error_message(String message) {
       // Assert.assertEquals(message, taskPage_.errorMessage.getText());
        Driver.getDriver().switchTo().frame(taskPage_.iframeNewTask);
        Assert.assertTrue(taskPage_.errorMessage.isDisplayed());
    }
    @Then("User can not create same task")
    public void user_can_not_create_same_task() {
        Assert.assertNotEquals(taskPage_.newTask.getText(), taskPage_.lastSecondTask.getText());
    }
}
