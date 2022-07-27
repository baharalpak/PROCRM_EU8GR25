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

    @And("user clicks the letter A")
    public void userClicksTheLetter() {
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
    }

    @Then("user download the file")
    public void userDownloadTheFile() {
        // Assert.assertEquals(userDownloadTheFile,functionsUnderEmployeeMenu.userDownloadTheFile.getText());

    }

    @Then("user disable to see the result of input")
    public void userDisableToSeeTheResultOfInput() {
        functionsUnderEmployeeMenu.findEmployeeResultChild1.isDisplayed();
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
        functionsUnderEmployeeMenu.sendMessageBox.sendKeys(message +Keys.ENTER);

    }
    @Then("verify that {string} gets {string}")
    public void verify_that_gets(String string, String string2) {
    Assert.assertTrue(functionsUnderEmployeeMenu.cemal.isDisplayed());
    }

    @When("user clicks ADD Department button again")
    public void user_clicks_add_department_button_again() {
        functionsUnderEmployeeMenu.addDepartmentAgain.click();

    }
    @When("user types same department name again")
    public void user_types_same_department_name_again() {
        functionsUnderEmployeeMenu.addSameDepartmentName.sendKeys("Group25");

    }
    @Then("user gets an error message")
    public void user_gets_an_error_message() {
       // Assert.assertTrue(functionsUnderEmployeeMenu.getAnErrorMesage.isDisplayed()));

    }

    @When("user clicks {string} button {int} times")
    public void user_clicks_button_times(String string, Integer int1) {

    }
    @Then("verify that {string} gets an {string}")
    public void verify_that_gets_an(String string, String string2) {

    }


    /*
    @When("user clicks {string}")
    public void user_clicks(String string) {

    }
    @When("{string} login")
    public void login(String string) {

    }
    @Then("verify that {string} gets {string}")
    public void verify_that_gets(String string, String string2) {

    }



/*
    @Then("user can not see any employee info displayed")
    public void user_can_not_see_any_employee_info_displayed() {
        
    }


    @When("user click Find Employees")
    public void userClickFindEmployees() {
    }





    @Then("user can see employee info")
    public void userCanSeeEmployeeInfo() {
    }

    @Given("\"<user> user is on homepage")
    public void userUserIsOnHomepage(){
    }

    @And("user clicks the more button")
    public void userClicksTheMoreButton() {
    }

    @And("user clicks Export to Excel")
    public void userClicksExportToExcel() {
    }

    @Then("user download the file")
    public void userDownloadTheFile() {
    }

    @Given("there are two users in application as {string} and {string}")
    public void thereAreTwoUsersInApplicationAsAnd(String arg0, String arg1) {
    }

    @When("{string} send {string} to {string}")
    public void sendTo(String arg0, String arg1, String arg2) {
    }

    @And("{string} login")
    public void login(String arg0) {
    }

    @Then("verify that {string} gets {string}")
    public void verifyThatGets(String arg0, String arg1) {
    }

    @And("user types some {string} in the search box")
    public void userTypesSomeInTheSearchBox(String arg0) {
    }


 */
}