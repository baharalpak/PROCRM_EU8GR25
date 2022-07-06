package com.procrm.step_definitions;

import com.procrm.pages.BasePage;
import com.procrm.pages.TasksPage;
import com.procrm.pages.TopPageSearch;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Tasks_StepDefinitions {

    TasksPage tasksPage = new TasksPage();

    @Given("HR user is on Home Page.")
    public void hr_user_is_on_home_page() {

        BasePage.loginAsHR();
    }

    @When("User clicks on Tasks module.")
    public void hr_user_clicks_on_tasks_module() {

        tasksPage.tasksModuleButton.click();
    }

    @Then("User clicks All button on My Tasks Page.")
    public void hr_user_clicks_button_on_my_tasks_page() {

        tasksPage.allTabButton.click();
        BrowserUtilities.sleep(3);
       // tasksPage.allTasks.click();
    }

    @Then("User should be able to display All Tasks.")
    public void hr_user_should_be_able_to_display() {

   // Assert.assertTrue(tasksPage.allTasks.isSelected());

        Assert.assertTrue(tasksPage.inProgress.isDisplayed());

    }

    @Given("Helpdesk user is on Home Page.")
    public void helpdesk_user_is_on_home_page() {

        BasePage.loginAsHelpDesk();
    }


    @Given("Marketing user is on Home Page.")
    public void marketing_user_is_on_home_page() {

        BasePage.loginAsMarketing();
    }
}
