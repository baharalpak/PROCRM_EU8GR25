package com.procrm.step_definitions;

import com.procrm.pages.TasksPage_Scrum889;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import io.cucumber.datatable.DataTable;
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
    String expectedForNewTemplate="";
    @When("Fills {string} details")
    public void fills_details(String string, DataTable dataTable) {
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        Driver.getDriver().switchTo().frame(tasksPage_scrum889.iframeNewTask);
        BrowserUtilities.sleep(1);
        tasksPage_scrum889.highPriority.click();
        tasksPage_scrum889.taskTitle.sendKeys(map.get("title"));
        expectedTitle = map.get("title");
        tasksPage_scrum889.taskTitle.sendKeys(Keys.TAB+map.get("body")+Keys.ENTER);

        int hour = LocalTime.now().getHour();
        int minute = LocalTime.now().getMinute();
        tasksPage_scrum889.deadline.click();
        Calendar calendar=Calendar.getInstance();
        DateFormat dateFormat=new SimpleDateFormat("dd");
        String today= dateFormat.format(calendar.getTime()); //Today date
        calendar.add(Calendar.DATE,2); //two days later
        String tomorrow=dateFormat.format(calendar.getTime());
        tasksPage_scrum889.addTaskDayCalendar(tomorrow).click();

        hour = (hour >= 12) ? hour -= 12 : hour;

        BrowserUtilities.sleep(2);
        tasksPage_scrum889.timeHours.clear();
        tasksPage_scrum889.timeHours.sendKeys("" + hour);
        tasksPage_scrum889.timeMinutes.sendKeys("" + minute);
        tasksPage_scrum889.calendar.click();

        tasksPage_scrum889.addMention.click();
        BrowserUtilities.sleep(2);
        tasksPage_scrum889.addMentionEmployees.click();
        BrowserUtilities.sleep(3);
        tasksPage_scrum889.addMentionMarketing(map.get("mention")).click();
    }

    @Then("User should be able to display new task created on My Tasks Page")
    public void user_should_be_able_to_display_new_task_created_on_my_tasks_page() {
        Assert.assertEquals(tasksPage_scrum889.newTask.getText(), expectedTitle);
    }

    @When("Edit {string} details with  below information")
    public void edit_details_with_below_information(String string, DataTable dataTable) {
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        // BrowserUtilities.waitForClickablility(tasksPage_scrum889.moreButton,10);
        BrowserUtilities.sleep(2);
        tasksPage_scrum889.changeResponsible.click();

        BrowserUtilities.sleep(2);
        tasksPage_scrum889.addResponsiblePeople.sendKeys(map.get("responsible"));

        BrowserUtilities.sleep(2);
        tasksPage_scrum889.addResponsiblePeople.sendKeys("" + Keys.ENTER);

        BrowserUtilities.sleep(3);
        tasksPage_scrum889.moreButton.click();

        BrowserUtilities.sleep(2);
        BrowserUtilities.clickWithJS(tasksPage_scrum889.scrollDown);
        tasksPage_scrum889.timeTracking.click();
        BrowserUtilities.sleep(3);
        tasksPage_scrum889.timeTrackingHours.sendKeys(map.get("time hours"));
        tasksPage_scrum889.timeTrackingMinutes.sendKeys(map.get("time minutes"));


        BrowserUtilities.sleep(2);
        tasksPage_scrum889.reminder.click();
        BrowserUtilities.sleep(4);
        tasksPage_scrum889.reminderUsing.click();
        BrowserUtilities.sleep(2);
        tasksPage_scrum889.reminderDeadline.click();
        BrowserUtilities.sleep(2);
        tasksPage_scrum889.sendEMail.click();
        BrowserUtilities.sleep(1);
        tasksPage_scrum889.addReminderWithEmail.click();
        BrowserUtilities.sleep(2);

        BrowserUtilities.clickWithJS(tasksPage_scrum889.scrollDown);
        BrowserUtilities.sleep(2);
        tasksPage_scrum889.dependantTasks.click();
        BrowserUtilities.waitForClickablility(tasksPage_scrum889.dependentSearchBox, 10);
        tasksPage_scrum889.dependentSearchBox.sendKeys(map.get("dependant task"));
        BrowserUtilities.sleep(2);
        tasksPage_scrum889.dependentSearchBox.sendKeys("" + Keys.ENTER);
        BrowserUtilities.sleep(2);
        tasksPage_scrum889.selectDependent.click();
        BrowserUtilities.sleep(2);
        tasksPage_scrum889.selectDependentButton.click();
    }

    @When("User clicks {string} button")
    public void user_clicks_button(String button) {
        switch (button) {
            case "Sava Changes":
                tasksPage_scrum889.saveChangesButton.click();
                BrowserUtilities.sleep(2);
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
        Assert.assertEquals(tasksPage_scrum889.newTask.getText(), expectedTitle);
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
        BrowserUtilities.waitForVisibility(tasksPage_scrum889.addParticipants,10);

        tasksPage_scrum889.addParticipants.click();
        BrowserUtilities.sleep(2);
        tasksPage_scrum889.sendParticipants.sendKeys(map.get("participant"));
        tasksPage_scrum889.sendParticipants.sendKeys("" + Keys.ENTER);
        BrowserUtilities.sleep(3);
        tasksPage_scrum889.observers.click();
        BrowserUtilities.waitForClickablility(tasksPage_scrum889.addObservers,10);
        BrowserUtilities.clickWithJS(tasksPage_scrum889.addObservers);
        BrowserUtilities.sleep(2);
        tasksPage_scrum889.sendObservers.sendKeys(map.get("observer"));
        tasksPage_scrum889.sendObservers.sendKeys("" + Keys.ENTER);
        BrowserUtilities.sleep(4);

        action.moveToElement(tasksPage_scrum889.checklist).click();
        BrowserUtilities.sleep(3);

        action.click(tasksPage_scrum889.addChecklist);
        action.sendKeys(tasksPage_scrum889.addChecklist,map.get("checklist1")).perform();
        BrowserUtilities.sleep(3);
        tasksPage_scrum889.addChecklist.sendKeys(""+Keys.ENTER);
        BrowserUtilities.sleep(2);
        action.sendKeys(tasksPage_scrum889.addChecklist,map.get("checklist2")).perform();
        tasksPage_scrum889.addChecklist.sendKeys(""+Keys.ENTER);
        BrowserUtilities.sleep(3);
        action.sendKeys(tasksPage_scrum889.addChecklist,map.get("checklist3")).perform();
        BrowserUtilities.sleep(3);
        tasksPage_scrum889.addChecklist.sendKeys(""+Keys.ENTER);
        BrowserUtilities.sleep(3);


    }

    @When("User clicks responsible person button and add one more responsible person")
    public void user_clicks_responsible_person_button_and_add_one_more_responsible_person() {

    }

    @Then("User should be able to add more responsible people.")
    public void user_should_be_able_to_add_more_responsible_people() {

    }

    @Given("User clicks plus button on Tasks module.")
    public void user_clicks_plus_button_on_tasks_module() {
        action.moveToElement(tasksPage_scrum889.tasksModuleButton).build().perform();
        tasksPage_scrum889.plusTaskButton.click();
    }
    @Given("User add {string}")
    public void user_add(String string) {
        tasksPage_scrum889.moreButton.click();
        BrowserUtilities.sleep(1);
        BrowserUtilities.scrollToElement(tasksPage_scrum889.subTaskTitle);
        tasksPage_scrum889.addSubTask.click();
        tasksPage_scrum889.searchSubTask.sendKeys("Test Case 5"+Keys.ENTER);
        action.click(tasksPage_scrum889.selectSearchSubTask).build().perform();
        action.click(tasksPage_scrum889.selectButton).build().perform();
        BrowserUtilities.sleep(1);
    }
    @Then("User should be able to see new task created.")
    public void user_should_be_able_to_see_new_task_created() {

    }

    @Then("User should be able to redirected to {string} page")
    public void user_should_be_able_to_redirected_to_page(String string) {
        Assert.assertEquals(expectedForNewTemplate,tasksPage_scrum889.lastCreatedForNewTemplate.getText());
    }

    @When("User select last created task")
    public void user_select_last_created_task() {
        BrowserUtilities.clickWithJS(tasksPage_scrum889.checkboxForDelete);
        BrowserUtilities.sleep(4);
        js.executeScript("arguments[0].scrollIntoView(true)", tasksPage_scrum889.scrollDownForDelete);
        BrowserUtilities.sleep(3);
    }

    @When("User select {string} section under {string} dropdown menu")
    public void user_select_section_under_dropdown_menu(String string, String string2) {
        BrowserUtilities.waitForVisibility(tasksPage_scrum889.selectOption, 10);

        tasksPage_scrum889.selectOption.click();
        tasksPage_scrum889.selectOption.click();
        BrowserUtilities.sleep(2);
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
    public void fills_details_below(String string,DataTable dataTable) {
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        tasksPage_scrum889.highPriority.click();
        tasksPage_scrum889.titleAllTemplatesNewTask.sendKeys(map.get("title"));
        BrowserUtilities.sleep(1);
        tasksPage_scrum889.addMention.click();
        tasksPage_scrum889.addMentionEmployees.click();
        tasksPage_scrum889.addMentionMarketing(map.get("mention")).click();

        tasksPage_scrum889.deadlineMinutes.click();
        tasksPage_scrum889.deadlineBox.sendKeys("7335"+Keys.ENTER);
        expectedForNewTemplate=map.get("title");
    }
    @When("User clicks responsible person button and add declare himself\\/herself")
    public void user_clicks_responsible_person_button_and_add_declare_himself_herself(io.cucumber.datatable.DataTable dataTable) {

    }


}
