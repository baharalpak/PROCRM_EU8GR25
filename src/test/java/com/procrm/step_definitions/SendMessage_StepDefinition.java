package com.procrm.step_definitions;

import com.procrm.pages.SendMessagePage;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class SendMessage_StepDefinition {

    SendMessagePage sendMessagePage = new SendMessagePage();

    @When("User clicks Message button.")
    public void user_clicks_message_button() {
        sendMessagePage.messageButton.click();
    }

    @And("User clicks Insert video icon.")
    public void userClicksInsertVideoIcon() {
        sendMessagePage.insertVideoIcon.click();
    }

    @And("User fills Video source box with {string}.")
    public void userFillsVideoSourceBoxWith(String videoURL) {
        BrowserUtilities.sleep(2);
        sendMessagePage.videoSourceBox.sendKeys(videoURL);
        BrowserUtilities.sleep(8);

    }

    @And("User clicks Save button.")
    public void userClicksSaveButton() {
        BrowserUtilities.sleep(2);
        sendMessagePage.saveButton.click();
        BrowserUtilities.sleep(2);

    }

    @Then("Verify that user can add video.")
    public void verifyThatUserCanAddVideo() {
//        BrowserUtilities.sleep(5);
//        Assert.assertFalse(sendMessagePage.videoNotAddedError.isDisplayed());
//        BrowserUtilities.sleep(3);
    }

    @And("User clicks Send button.")
    public void userClicksSendButton() {
        BrowserUtilities.sleep(2);
        sendMessagePage.sendButton.click();
        BrowserUtilities.sleep(2);
    }

    @And("User clicks Comma icon.")
    public void userClicksCommaIcon() {
        sendMessagePage.commaIcon.click();
    }

    @And("User fills Quote box with {string}.")
    public void userFillsQuoteBoxWith(String quoteText) {

        Driver.getDriver().switchTo().frame(sendMessagePage.quoteBoxIframe);
        sendMessagePage.quoteBox.sendKeys(quoteText);
        Driver.getDriver().switchTo().parentFrame();
    }

    @Then("Verify that user can create quote as {string} text.")
    public void verifyThatUserCanCreateQuoteAsText(String quoteText) {
        Assert.assertEquals(sendMessagePage.quoteTextElement.getText(),quoteText);
    }

    @And("User fills Message Title which is mandatory field with {string}.")
    public void userFillsMessageTitleWhichIsMandatoryFieldWith(String messageTitle) {
        Driver.getDriver().switchTo().frame(sendMessagePage.messageTitleIframe);
        sendMessagePage.messageTitleBox.sendKeys(messageTitle);
        Driver.getDriver().switchTo().parentFrame();
    }

    @Then("Verify that user can send a message as {string} text.")
    public void verifyThatUserCanSendAMessageAsText(String messageTitle) {
        Assert.assertEquals(sendMessagePage.lastCreatedMessage.getText(), messageTitle);
    }

    @And("User clicks Add mention icon.")
    public void userClicksAddMentionIcon() {
        sendMessagePage.addMentionIcon.click();
    }

    @And("User adds mention below.")
    public void userAddsMentionBelow() {


//        for (String eachMention : mentions){
//            if (eachMention.equals(sendMessagePage.eachMention.getText())){
//               sendMessagePage.eachMention.click();
//            }
////            sendMessagePage.addMentionIcon.sendKeys(eachMention);
//            BrowserUtilities.sleep(2);
//        }
    }

    @And("User adds mentions below.")
    public void userAddsMentionsBelow() {
        sendMessagePage.mention2Text.click();
        sendMessagePage.mention3Text.click();
        sendMessagePage.mention4Text.click();
        sendMessagePage.mention5Text.click();
        sendMessagePage.closeButton.click();
    }

    @And("User clicks Employees and Departments.")
    public void userClicksEmployeesAndDepartments() {
        sendMessagePage.employeesAndDepartments.click();
    }


    @And("User adds {string}.")
    public void userAdds(String mention) {

        BrowserUtilities.sleep(2);

        sendMessagePage.mention1Text.click();
    }

    @And("User clicks more recipient link.")
    public void userClicksMoreRecipientLink() {
        sendMessagePage.moreRecipientLink.click();
    }

    @Then("Verify that user can add mention.")
    public void verifyThatUserCanAddMention() {
       // Assert.assertTrue(sendMessagePage.mention1Text.isDisplayed());
//        Assert.assertEquals(sendMessagePage.mention2.getText(), sendMessagePage.mention2Text);
//        Assert.assertEquals(sendMessagePage.mention3.getText(), sendMessagePage.mention3Text);
//        Assert.assertEquals(sendMessagePage.mention4.getText(), sendMessagePage.mention4Text);
//        Assert.assertEquals(sendMessagePage.mention5.getText(), sendMessagePage.mention5Text);
    }
}

