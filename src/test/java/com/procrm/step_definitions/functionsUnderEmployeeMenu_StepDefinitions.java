package com.procrm.step_definitions;

import com.github.javafaker.Faker;
import com.procrm.pages.BasePage;
import com.procrm.pages.functionsUnderEmployeeMenuPage;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class functionsUnderEmployeeMenu_StepDefinitions {
    functionsUnderEmployeeMenuPage functionsUnderEmployeeMenu = new functionsUnderEmployeeMenuPage();
    Actions action = new Actions(Driver.getDriver());

    Faker faker = new Faker();

    @Given("{string} user is on homepage.")
    public void userIsOnHomepage(String userType) {

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
    }

    @When("user clicks ADD Department button")
    public void user_clicks_add_department_button() throws InterruptedException {
        functionsUnderEmployeeMenu.addDepartment.click();
        //BrowserUtilities.waitForClickablility(functionsUnderEmployeeMenu.addDepartment, 10);


    }

    @When("user types department name")
    public void user_types_department_name() {
        functionsUnderEmployeeMenu.addDepartmentName.sendKeys("Group25");

    }

    @When("user clicks add")
    public void user_clicks_add() {
        functionsUnderEmployeeMenu.addDepartmentButton.click();

    }

    @Then("user can see the name of the newly created department")
    public void user_can_see_the_name_of_the_newly_created_department() throws InterruptedException {
        Assert.assertTrue(functionsUnderEmployeeMenu.createdDepartmentName.isDisplayed());
        //BrowserUtilities.waitForClickability(functionsUnderEmployeeMenu.addDepartment, 10);


    }

   /* @When("{string} user clicks Find Employees")
    public void userClicksFindEmployees() throws InterruptedException {
        //functionsUnderEmployeeMenu.openLeftMenu.click();
        /*
        Thread.sleep(5000);
        functionsUnderEmployeeMenu.employeesButton.click();
        Thread.sleep(5000);
        functionsUnderEmployeeMenu.employeesFindButton.click();
        Thread.sleep(5000);

         */

    //}


    @And("user types name of employee {string} in the search box")
    public void userTypesInTheSearchBox(String name) {

        functionsUnderEmployeeMenu.employeesSearchButton.sendKeys(name + Keys.ENTER);

    }

    @Then("user can see name of employee {string} employee info displayed")
    public void userCanSeeEmployeeInfoDisplayed(String nameEmployee) {
        //functionsUnderEmployeeMenu.disPlayedEmployeeName.isDisplayed();
        String actualNameEmployee = functionsUnderEmployeeMenu.disPlayedEmployeeName.getText();
        //Assert.assertEquals(nameEmployee, actualNameEmployee);
        Assert.assertTrue(functionsUnderEmployeeMenu.disPlayedEmployeeName.isDisplayed());

    }


    @And("user types wrong employee name {string} in the search box")
    public void userTypesWrongEmployeeNameInTheSearchBox(String anyName) {
        //functionsUnderEmployeeMenu.employeesSearchButton.sendKeys(anyName);
        functionsUnderEmployeeMenu.employeesSearchButton.sendKeys(anyName + Keys.ENTER);

    }

    @When("user clicks Employees button.")
    public void userClicksEmployeesButton() {
        functionsUnderEmployeeMenu.employeesButton.click();
    }

    @And("user clicks Find Employees")
    public void userClicksFindEmployees() {

        BrowserUtilities.sleep(3);
        functionsUnderEmployeeMenu.findEmployeeButton.click();
        BrowserUtilities.sleep(3);
    }

    @When("user click search button")
    public void user_click_search_button() {
        functionsUnderEmployeeMenu.secondSearchButton.click();

    }

    @And("user clicks Search By Alphabet button")
    public void userClicksSearchByAlphabetButton() {
        functionsUnderEmployeeMenu.searchByAlphabet.click();
    }

    @And("user clicks the letter {string}")
    public void userClicksTheLetter(String letter) {
        functionsUnderEmployeeMenu.alphabetA.click();
        BrowserUtilities.sleep(7);
    }

    @Then("user can see this message {string}")
    public void userCanSeeThisMessage(String message) {
        Assert.assertEquals(message, functionsUnderEmployeeMenu.message.getText());

    }

    @And("user clicks the more button")
    public void userClicksTheMoreButton() {
        functionsUnderEmployeeMenu.moreButton.click();
    }

    @And("user clicks Export to Excel")
    public void userClicksExportToExcel() {
        functionsUnderEmployeeMenu.exportToExcel.click();
        BrowserUtilities.sleep(7);

    }

    @Then("user download the file")
    public void userDownloadTheFile() {
        // Assert.assertEquals(userDownloadTheFile,functionsUnderEmployeeMenu.userDownloadTheFile.getText());
        Assert.assertTrue(functionsUnderEmployeeMenu.isFileDownloaded("\"C:\\Users\\ecebo\\Downloads\"", "users.xlsx"));

    }

    @Then("user disable to see the result of input")
    public void userDisableToSeeTheResultOfInput() {
        //functionsUnderEmployeeMenu.findEmployeeResultChild1.isDisplayed();
        Assert.assertTrue(functionsUnderEmployeeMenu.findEmployeeResultChild1.isDisplayed());
    }

    @And("user types some {string} in the search box")
    public void userTypesSomeInTheSearchBox(String specialCharacter) {
        functionsUnderEmployeeMenu.employeesSearchButton.sendKeys(specialCharacter + Keys.ENTER);

    }

    @When("user find name of receiver as {string}")
    public void user_find_name_of_receiver_as(String receiver) {
        functionsUnderEmployeeMenu.typesHiMessage.click();

    }

    @When("user clicks {string} button")
    public void user_clicks_button(String string) {
        functionsUnderEmployeeMenu.sendMessageButton.click();

    }

    @When("user types {string} and send message")
    public void user_types_and_send_message(String message) {
        functionsUnderEmployeeMenu.sendMessageBox.sendKeys(message + Keys.ENTER);

    }

    @Then("verify that {string} gets {string}")
    public void verify_that_gets(String string, String string2) {
        Assert.assertTrue(functionsUnderEmployeeMenu.cemal.isDisplayed());
    }

    @Then("user gets an error message")
    public void user_gets_an_error_message() {
        //Assert.assertTrue(functionsUnderEmployeeMenu.getAnErrorMesage.isDisplayed()));
        //Assert.assertFalse(functionsUnderEmployeeMenu.);
    }

    @When("user clicks {string} button {int} times")
    public void user_clicks_button_times(String message, Integer times) {


    }

    @When("user types {string} and send message {string} times")
    public void user_types_and_send_message_times(String message, String string2) {
        int times = Integer.parseInt(string2);
        for (int i = 0; i < times; i++) {
            functionsUnderEmployeeMenu.sendMessageBox.sendKeys(message + Keys.ENTER);
            BrowserUtilities.sleep(3);

        }
    }

    @Then("verify that {string} gets an {string}")
    public void verify_that_gets_an(String string, String string2) {

    }


}