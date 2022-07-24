package com.procrm.step_definitions;

import com.procrm.pages.BasePage;
import com.procrm.pages.InteractWithEmployeesPage;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.text.DateFormat;
import java.util.Date;

public class InteractWithEmployees_StepDefinitions {
    InteractWithEmployeesPage interactWithEmployeesPage= new InteractWithEmployeesPage();
    Date date = new Date();


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
        Driver.getDriver().switchTo().frame(interactWithEmployeesPage.commentBoxIFrame); //iFrame switch

        BrowserUtilities.waitForClickablility(interactWithEmployeesPage.commentInputBox,5);
        interactWithEmployeesPage.commentInputBox.click();
        interactWithEmployeesPage.commentInputBox.sendKeys(String.valueOf(date));
    }

    @When("User click the send button at the INPUT BOX.")
    public void user_click_the_send_button_at_the_input_box() {
        Driver.getDriver().switchTo().defaultContent();

        interactWithEmployeesPage.sendButton.click();
    }

    @Then("User should see own comment on other employees' posts is applicable.")
    public void user_should_see_own_comment_on_other_employees_posts_is_applicable() {
        Assert.assertTrue(interactWithEmployeesPage.commentIsVisible.isDisplayed());
    }

        @When("User click the like button at the INPUT BOX.")
        public void userClickTheLikeButtonAtTheINPUTBOX () {

            interactWithEmployeesPage.likeButton.click();
            BrowserUtilities.sleep(5);
        }

        @Then("User should see like on other employees' posts.")
        public void userShouldSeeLikeOnOtherEmployeesPosts () {

            Assert.assertTrue(interactWithEmployeesPage.likeButtonIsVisible.isDisplayed());
        }

        @When("User click the unfollow button at the INPUT BOX.")
        public void userClickTheUnfollowButtonAtTheINPUTBOX () {

            interactWithEmployeesPage.unfollowButton.click();
            BrowserUtilities.sleep(5);


        }

        @Then("User should see follow button on other employees' posts.")
        public void userShouldSeeFollowButtonOnOtherEmployeesPosts () {

            Assert.assertTrue(interactWithEmployeesPage.followButtonIsVisible.isDisplayed());


        }

        @When("User click the like button at the reviewers's comments.")
        public void userClickTheLikeButtonAtTheReviewersSComments () {
            interactWithEmployeesPage.likeButtonReviwers.click();
            BrowserUtilities.sleep(5);
        }

        @Then("User should see like on other reviewers's comments.")
        public void userShouldSeeLikeOnOtherReviewersSComments () {
            Assert.assertTrue(interactWithEmployeesPage.getLikeButtonReviwersIsVisible.isDisplayed());
        }


        @When("User click the reviewers' name")
        public void userClickTheReviewersName () {

            interactWithEmployeesPage.clickReviwersName.click();
            BrowserUtilities.sleep(5);

        }

        @Then("User should be able to see reviewers' profiles.")
        public void userShouldBeAbleToSeeReviewersProfiles () {
            Assert.assertTrue(interactWithEmployeesPage.displayReviwersProfiles.isDisplayed());

        }

        @When("User click the star icon.")
        public void userClickTheStarIcon () {
            interactWithEmployeesPage.starIconButton.click();
            BrowserUtilities.sleep(5);
        }

        @Then("User should be able to see yellow star icon is applicable")
        public void userShouldBeAbleToSeeYellowStarIconIsApplicable () {
            Assert.assertTrue(interactWithEmployeesPage.seeYellowStarIcon.isDisplayed());
        }

    @When("User click the {string} button at the employees' posts.")
    public void userClickTheButtonAtTheReviewersSComments(String interactionButton) {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(interactWithEmployeesPage.likeButton).perform();

        BrowserUtilities.sleep(5);
        switch (interactionButton.toLowerCase()) {
            case "cry":
                interactWithEmployeesPage.cryButton.click();
                break;
            case "kiss":
                interactWithEmployeesPage.kissButton.click();
                break;
            case "laugh":
                interactWithEmployeesPage.laughButton.click();
                break;
        }

        BrowserUtilities.sleep(5);
    }




    @Then("User should see {string} on other employees' posts.")
    public void userShouldSeeOnOtherReviewersSComments(String interactionButton) {


        switch (interactionButton.toLowerCase()) {
            case "cry":
               Assert.assertTrue(interactWithEmployeesPage.cryButtonIsVisible.isDisplayed());
                break;
            case "kiss":
                Assert.assertTrue(interactWithEmployeesPage.kissButtonISVisible.isDisplayed());
                break;
            case "laugh":
                Assert.assertTrue(interactWithEmployeesPage.laughButtonIsVisible.isDisplayed());
                break;
        }



    }

    @When("User click the comments button at the reviewers's comments.")
    public void userClickTheCommentsButtonAtTheReviewersSComments() {

        interactWithEmployeesPage.reviwersReplyButton.click();

    }

    @And("User write comment in the INPUT BOX at the reviewers's comments.")
    public void userWriteCommentInTheINPUTBOXAtTheReviewersSComments() {

        Driver.getDriver().switchTo().frame(interactWithEmployeesPage.commentBoxIFrame); //iFrame switch

        BrowserUtilities.waitForClickablility(interactWithEmployeesPage.commentInputBox,5);

        interactWithEmployeesPage.commentInputBox.click();
        interactWithEmployeesPage.commentInputBox.sendKeys(String.valueOf(date));



    }

    @And("User click the send button at the INPUT BOX at the reviewers's comments.")
    public void userClickTheSendButtonAtTheINPUTBOXAtTheReviewersSComments() {

        Driver.getDriver().switchTo().defaultContent();
        BrowserUtilities.sleep(3);
        interactWithEmployeesPage.sendButton.click();

    }

    @Then("User should see own comment on other reviewers's comments is applicable.")
    public void userShouldSeeOwnCommentOnOtherReviewersSCommentsIsApplicable() {

        Assert.assertTrue(interactWithEmployeesPage.commentIsVisible.isDisplayed());


    }

    @Then("User should see error message {string} in INPUT BOX.")
    public void userShouldSeeErrorMessageInINPUTBOX(String message) {

        Assert.assertTrue(interactWithEmployeesPage.errorMessage.getText().contains(message));
    }
}