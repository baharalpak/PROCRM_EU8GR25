package com.procrm.step_definitions;

import com.procrm.pages.BasePage;
import com.procrm.pages.PollTapPage;
import com.procrm.utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import io.cucumber.java.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PollTap_StepDefinitions {
    PollTapPage pollTapPage=new PollTapPage();

    @When("user clicks on Activity Stream")
    public void user_clicks_on_activity_stream() {
        pollTapPage.Activity_StreamButton.click();

        BrowserUtilities.sleep(3);


    }
    @And("clicks on Poll tap  from top menu")
    public void clicksOnPollTapFromTopMenu() {
        pollTapPage.PollTap.click();
        BrowserUtilities.sleep(3);

    }


    @When("User clicks on add more")
    public void userClicksOnAddMore() {
        pollTapPage.AddMore.click();
        BrowserUtilities.sleep(3);
        
    }

    @And("user add employees emails")
    public void userAddEmployeesEmails() {
        pollTapPage.addEmployee.sendKeys("marketing13@cybertekschool.com");

        BrowserUtilities.sleep(2);
        pollTapPage.addEmployee.sendKeys(Keys.ENTER);

        BrowserUtilities.sleep(1);
        pollTapPage.addEmployee.sendKeys("hr13@cybertekschool.com");
        BrowserUtilities.sleep(2);
        pollTapPage.addEmployee.sendKeys(Keys.ENTER);
        BrowserUtilities.sleep(1);
        
    }

    @When("user click on link button")
    public void userClickOnLinkButton() {
        pollTapPage.Link.click();
        BrowserUtilities.sleep(2);
    }

    @And("add a link to link box")
    public void addALinkToLinkBox() {
        pollTapPage.AddLink.sendKeys("www.google.com");
        BrowserUtilities.sleep(2);
    }

    @And("add text to text box")
    public void addTextToTextBox() {
        pollTapPage.AddText.sendKeys("send text");
        BrowserUtilities.sleep(2);
    }

    @And("clicks on save button")
    public void clicksOnSaveButton() {
        pollTapPage.SaveButton.click();
        BrowserUtilities.sleep(6);
        
    }

    @Then("User should be able to see the link in the text box.")
    public void userShouldBeAbleToSeeTheLinkInTheTextBox() {
    }

    @And("add a Text to link box")
    public void addATextToLinkBox() {
        
    }

    @Then("User should NOT be able to see the text as link in the text box.")
    public void userShouldNOTBeAbleToSeeTheTextAsLinkInTheTextBox() {
        
        
    }

    @When("user click on mention icon.")
    public void userClickOnMentionIcon() {
        pollTapPage.MentionButton.click();
        BrowserUtilities.sleep(2);
    }

    @And("user click on Employees and Departments button")
    public void userClickOnEmployeesAndDepartmentsButton() {
        pollTapPage.EmployeesDepartments.click();
        BrowserUtilities.sleep(2);
    }

    @And("user mention employees from contact list")
    public void userMentionEmployeesFromContactList() {
        pollTapPage.MentionEDButton.click();
        BrowserUtilities.sleep(2);

        
    }

    @Then("User should be able to see the mention in the text box.")
    public void userShouldBeAbleToSeeTheMentionInTheTextBox() {



    }

    @When("user click on Question text Box")
    public void userClickOnQuestionTextBox() {

    }

    @And("User add a question")
    public void userAddAQuestion() {

    }

    @And("user edit the question")
    public void userEditTheQuestion() {

    }

    @When("user click on {int} answer text box")
    public void userClickOnAnswerTextBox(int arg0) {

    }

    @And("user add an answer to the text box")
    public void userAddAnAnswerToTheTextBox() {

    }

    @And("user edit the answer")
    public void userEditTheAnswer() {

    }

    @And("user add an second answer to the text box")
    public void userAddAnSecondAnswerToTheTextBox() {

    }

    @And("user edit the second answer")
    public void userEditTheSecondAnswer() {

    }

    @And("user click on delete question icon")
    public void userClickOnDeleteQuestionIcon() {

    }

    @Then("the question will be deleted")
    public void theQuestionWillBeDeleted() {

    }

    @And("user click on delete answer{int} icon")
    public void userClickOnDeleteAnswerIcon(int arg0) {

    }

    @Then("the answers should be deleted")
    public void theAnswersShouldBeDeleted() {

    }

    @And("user click on multiple choice checkbox.")
    public void userClickOnMultipleChoiceCheckbox() {

    }

    @When("user click on send button")
    public void userClickOnSendButton() {

    }

    @Then("user should be able to send the message.")
    public void userShouldBeAbleToSendTheMessage() {

    }

    @When("user add a wrong email")
    public void userAddAWrongEmail() {

    }

    @Then("user should NOT be able to send the message.")
    public void userShouldNOTBeAbleToSendTheMessage() {

    }



    @Then("user should be able to see  text box to create a poll")
    public void userShouldBeAbleToSeeTextBoxToCreateAPoll() {
    }
}