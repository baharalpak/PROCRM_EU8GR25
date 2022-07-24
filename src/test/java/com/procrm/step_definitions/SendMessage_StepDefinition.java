package com.procrm.step_definitions;

import com.procrm.pages.SendMessagePage;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
        sendMessagePage.videoSourceBox.sendKeys(videoURL);
    }

//    @And("User clicks Save button.")
//    public void userClicksSaveButton() {
//        sendMessagePage.saveButton.click();
//        Driver.getDriver().switchTo().parentFrame();
//    }

    @Then("Verify that user can add video.")
    public void verifyThatUserCanAddVideo() {
        BrowserUtilities.sleep(3);
        Assert.assertFalse(sendMessagePage.videoNotAddedError.isDisplayed());
    }
}

