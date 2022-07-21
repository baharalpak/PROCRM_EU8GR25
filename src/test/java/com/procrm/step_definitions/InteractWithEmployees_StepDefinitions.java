package com.procrm.step_definitions;

import com.procrm.pages.BasePage;
import com.procrm.pages.InteractWithEmployeesPage;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class InteractWithEmployees_StepDefinitions {
    InteractWithEmployeesPage interactWithEmployeesPage= new InteractWithEmployeesPage();

    @Given("{string} user is on homepage.")
    public void user_is_on_homepage(String userType) {

        switch (userType.toLowerCase()) {
            case "hr":
                BasePage.loginAsHR();
                break;
            case "helpdesk":
                BasePage.loginAsHelpDesk();
                break;
            case "marketing":
                BasePage.loginAsMarketing();
                break;
        }

        BrowserUtilities.sleep(5);
    }


    @When("User click comment button other employees' posts")
    public void user_click_comment_button_other_employees_posts() {

        interactWithEmployeesPage.commentButton.click();
        BrowserUtilities.sleep(5);
    }

    @When("User write comment in the INPUT BOX {string}")
    public void user_write_comment_in_the_input_box(String message) {

        Actions action = new Actions(Driver.getDriver());
        action.doubleClick(interactWithEmployeesPage.commentInputBox).perform();
        BrowserUtilities.sleep(5);



    }

    @When("User click the send button at the INPUT BOX.")
    public void user_click_the_send_button_at_the_input_box() {


        interactWithEmployeesPage.sendButton.click();
    }

    @Then("User should see own comment on other employees' posts is applicable.")
    public void user_should_see_own_comment_on_other_employees_posts_is_applicable() {

        Assert.assertTrue(interactWithEmployeesPage.isVisibleName.isDisplayed());

    }




}