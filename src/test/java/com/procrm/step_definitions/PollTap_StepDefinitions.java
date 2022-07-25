package com.procrm.step_definitions;

import com.procrm.pages.BasePage;
import com.procrm.pages.PollTapPage;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import io.cucumber.java.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

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
        BrowserUtilities.sleep(4);

        
    }

    @Then("User should be able to see the mention in the text box.")
    public void userShouldBeAbleToSeeTheMentionInTheTextBox() {




    }

    @When("user click on Question text Box")
    public void userClickOnQuestionTextBox() {
pollTapPage.questionTextBox.click();

    }

    @And("User add a question")
    public void userAddAQuestion() {
        pollTapPage.questionTextBox.sendKeys("Question1");
        BrowserUtilities.sleep(2);

    }

    @And("user edit the question")
    public void userEditTheQuestion() {
        pollTapPage.questionTextBox.clear();
        BrowserUtilities.sleep(2);
        pollTapPage.questionTextBox.sendKeys("QuestionEdit");
        BrowserUtilities.sleep(2);

    }

    @When("user click on answer1 text box")
    public void userClickOnAnswer1TextBox() {
        pollTapPage.answer1.click();
        BrowserUtilities.sleep(2);

    }
    @When("user click on answer2 text box")
    public void userClickOnAnswer2TextBox() {
        pollTapPage.answer2.click();
        BrowserUtilities.sleep(2);

    }


    @And("user add an answer to the text box")
    public void userAddAnAnswerToTheTextBox() {
       pollTapPage.answer1.sendKeys("Answer1");
        BrowserUtilities.sleep(2);


    }

    @And("user edit the answer")
    public void userEditTheAnswer() {
        pollTapPage.answer1.clear();
        BrowserUtilities.sleep(2);
        pollTapPage.answer1.sendKeys("Answer1Edit");
        BrowserUtilities.sleep(2);


    }

    @And("user add an second answer to the text box")
    public void userAddAnSecondAnswerToTheTextBox() {
        pollTapPage.answer2.sendKeys("Answer2");
        BrowserUtilities.sleep(2);


    }

    @And("user edit the second answer")
    public void userEditTheSecondAnswer() {
        pollTapPage.answer2.clear();
        BrowserUtilities.sleep(2);
        pollTapPage.answer2.sendKeys("Answer2Edit");
        BrowserUtilities.sleep(2);

    }

    @And("user click on delete question icon")
    public void userClickOnDeleteQuestionIcon() {
        pollTapPage.questionTextBox.click();
        BrowserUtilities.sleep(2);
        pollTapPage.deleteQuestion.click();
        BrowserUtilities.sleep(2);
        Driver.getDriver().switchTo().alert().accept();
        BrowserUtilities.sleep(2);
    }

    @Then("the question will be deleted")
    public void theQuestionWillBeDeleted() {


    }

    @And("user click on delete answerOne icon")
    public void userClickOnDeleteAnswerOne() {
        pollTapPage.answer1.click();
        BrowserUtilities.sleep(2);
        pollTapPage.deleteAnswer1.click();
        BrowserUtilities.sleep(2);
        Driver.getDriver().switchTo().alert().accept();

    }
    @And("user click on delete answerTwo icon")
    public void userClickOnDeleteAnswerTwo() {
        pollTapPage.answer2.click();
        BrowserUtilities.sleep(2);
        pollTapPage.deleteAnswer2.click();
        BrowserUtilities.sleep(2);
        Driver.getDriver().switchTo().alert().accept();

    }

    //user click on delete answerTwo icon

    @Then("the answers should be deleted")
    public void theAnswersShouldBeDeleted() {

    }

    @And("user click on multiple choice checkbox.")
    public void userClickOnMultipleChoiceCheckbox() {
        pollTapPage.MultiCheckBox.click();
        BrowserUtilities.sleep(2);


    }

    @When("user click on send button")
    public void userClickOnSendButton() {
        pollTapPage.SendButton.click();



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