package com.procrm.step_definitions;

import com.procrm.pages.BasePage;
import com.procrm.pages.TasksPage;
import com.procrm.pages.TopPageSearch;
import com.procrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Tasks_StepDefinitions {

    TasksPage tasksPage = new TasksPage();

    @Given("HR user is on Home Page.")
    public void hr_user_is_on_home_page() {

        BasePage.loginAsHR();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));
    }

    @When("HR user clicks on Tasks module.")
    public void hr_user_clicks_on_tasks_module() {

        tasksPage.tasksModuleButton.click();
    }

    @Then("HR user clicks All button on My Tasks Page.")
    public void hr_user_clicks_button_on_my_tasks_page() {

        tasksPage.allTabButton.click();
    }

    @Then("HR user should be able to display All Tasks.")
    public void hr_user_should_be_able_to_display() {


    }

}
