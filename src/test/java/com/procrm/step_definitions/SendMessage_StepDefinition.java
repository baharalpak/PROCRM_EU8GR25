package com.procrm.step_definitions;

import com.procrm.pages.SendMessagePage;
import com.procrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class SendMessage_StepDefinition {

    SendMessagePage sendMessagePage = new SendMessagePage();

    @When("User fills Message Title which is mandatory field with {string}.")
    public void userFillsMessageTitleWhichIsMandatoryFieldWith(String text) {

        Driver.getDriver().switchTo().frame(sendMessagePage.messageTitleIframe);
        sendMessagePage.messageTitleBox.sendKeys(text);
        Driver.getDriver().switchTo().parentFrame();
    }

    @And("User clicks {string}.")
    public void userClicks(String element) {

    }


}
