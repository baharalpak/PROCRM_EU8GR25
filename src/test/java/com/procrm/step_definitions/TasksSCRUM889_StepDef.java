package com.procrm.step_definitions;

import com.procrm.pages.TasksPage_Scrum889;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Map;

public class TasksSCRUM889_StepDef {
    TasksPage_Scrum889 tasksPage_scrum889=new TasksPage_Scrum889();
    Calendar calendar=Calendar.getInstance();
    String expectedTitle="";

    @When("Fills {string} details")
    public void fills_details(String string, DataTable dataTable) {
        Map<String,String> map=dataTable.asMap(String.class,String.class);
        BrowserUtilities.sleep(1);
        Driver.getDriver().switchTo().frame(tasksPage_scrum889.iframeNewTask);
        BrowserUtilities.sleep(1);
        tasksPage_scrum889.highPriority.click();
        tasksPage_scrum889.taskTitle.sendKeys(map.get("title"));
        expectedTitle=map.get("title");
        //Driver.getDriver().switchTo().parentFrame();

        int hour= LocalTime.now().getHour();
        int minute=LocalTime.now().getMinute();
        tasksPage_scrum889.deadline.click();

        hour=(hour>=12)? hour-=12:hour;

        BrowserUtilities.sleep(2);
        tasksPage_scrum889.timeHours.clear();
        tasksPage_scrum889.timeHours.sendKeys(""+hour);
        tasksPage_scrum889.timeMinutes.sendKeys(""+minute);

        tasksPage_scrum889.PM.click();
        tasksPage_scrum889.calendar.click();

        tasksPage_scrum889.addMention.click();
        BrowserUtilities.sleep(2);
        tasksPage_scrum889.addMentionPerson.click();
    }
    @Then("User should be able to display new task created on My Tasks Page")
    public void user_should_be_able_to_display_new_task_created_on_my_tasks_page() {
        Assert.assertEquals(tasksPage_scrum889.newTask.getText(),expectedTitle);
    }
    @When("Edit {string} details with  below information")
    public void edit_details_with_below_information(String string,DataTable dataTable) {
        Map<String ,String> map=dataTable.asMap(String.class,String.class);
       // BrowserUtilities.waitForClickablility(tasksPage_scrum889.moreButton,10);
        BrowserUtilities.sleep(2);
        tasksPage_scrum889.changeResponsible.click();

        BrowserUtilities.sleep(5);
        tasksPage_scrum889.addResponsiblePeople.sendKeys(map.get("responsible"));

        BrowserUtilities.sleep(2);
        tasksPage_scrum889.addResponsiblePeople.sendKeys(""+Keys.ENTER);

        BrowserUtilities.sleep(3);
        tasksPage_scrum889.moreButton.click();

        JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();
        BrowserUtilities.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true)",tasksPage_scrum889.scrollDown);
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

        js.executeScript("arguments[0].scrollIntoView(true)",tasksPage_scrum889.scrollDown);
        BrowserUtilities.sleep(2);
        tasksPage_scrum889.dependantTasks.click();
        BrowserUtilities.waitForClickablility(tasksPage_scrum889.dependentSearchBox,10);
        tasksPage_scrum889.dependentSearchBox.sendKeys(map.get("dependant task"));
        BrowserUtilities.sleep(2);
        tasksPage_scrum889.dependentSearchBox.sendKeys(""+Keys.ENTER);
        BrowserUtilities.sleep(2);
        tasksPage_scrum889.selectDependent.click();
        BrowserUtilities.sleep(2);
        tasksPage_scrum889.selectDependentButton.click();
    }
    @When("User clicks {string} button")
    public void user_clicks_button(String button) {
        switch (button){
            case "Sava Changes":
                tasksPage_scrum889.saveChangesButton.click();
                BrowserUtilities.sleep(2);
                Driver.getDriver().switchTo().parentFrame();
                break;
            case "Close":
                tasksPage_scrum889.closeButton.click();
                break;
        }
    }
    @Then("User should be able to see edited task.")
    public void user_should_be_able_to_see_edited_task() {
        Assert.assertEquals(tasksPage_scrum889.newTask.getText(),expectedTitle);
    }
    @When("{string} user clicks on the last created task")
    public void user_clicks_on_the_last_created_task(String string) {

    }

    @When("User clicks responsible person button and add one more responsible person")
    public void user_clicks_responsible_person_button_and_add_one_more_responsible_person() {

    }
    @Then("User should be able to add more responsible people.")
    public void user_should_be_able_to_add_more_responsible_people() {

    }
    @Given("User clicks plus button on Tasks module.")
    public void user_clicks_plus_button_on_tasks_module() {

    }

    @Then("User should be able to see new task created.")
    public void user_should_be_able_to_see_new_task_created() {

    }

    @Then("User should be able to redirected to {string} page")
    public void user_should_be_able_to_redirected_to_page(String string) {

    }
    @When("User select last created task")
    public void user_select_last_created_task() {

    }
    @When("User select {string} section under {string} dropdown menu")
    public void user_select_section_under_dropdown_menu(String string, String string2) {

    }
    @When("User clicks {string} button and {string} button")
    public void user_clicks_button_and_button(String string, String string2) {

    }
    @Then("User should be able to delete task.")
    public void user_should_be_able_to_delete_task() {

    }




}
