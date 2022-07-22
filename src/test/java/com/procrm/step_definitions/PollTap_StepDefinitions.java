package com.procrm.step_definitions;

import com.procrm.pages.PollTapPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

public class PollTap_StepDefinitions {


    @When("user clicks on Activity Stream")
    public void user_clicks_on_activity_stream() {
PollTapPage.Activity_StreamButton.click();

    }

    @When("clicks on Poll tap  from top menu")
    public void clicks_on_poll_tap_from_top_menu() {

    }

    @Then("user should be able to see  text box to create a poll")
    public void user_should_be_able_to_see_text_box_to_create_a_poll() {

    }


    @Given("{string} user is on poll tap")
    public void user_is_on_poll_tap(String string) {

    }

    @When("User clicks on add more")
    public void user_clicks_on_add_more() {

    }

    @When("user click on Employees and Departments")
    public void user_click_on_employees_and_departments() {

    }

    @When("user add employees from contact list")
    public void user_add_employees_from_contact_list() {

    }



    @When("user click on link button")
    public void user_click_on_link_button() {

    }

    @When("add a link to link box")
    public void add_a_link_to_link_box() {

    }

    @When("clicks on save button")
    public void clicks_on_save_button() {

    }

    @Then("User should be able to see the link in the text box.")
    public void user_should_be_able_to_see_the_link_in_the_text_box() {

    }



    @When("user click on mention icon.")
    public void user_click_on_mention_icon() {

    }

    @When("user click on Employees and Departments button")
    public void user_click_on_employees_and_departments_button() {

    }

    @When("user mention employees from contact list")
    public void user_mention_employees_from_contact_list() {

    }

    @Then("User should be able to see the mention in the text box.")
    public void user_should_be_able_to_see_the_mention_in_the_text_box() {

    }
}
