package com.procrm.step_definitions;

import com.github.javafaker.Faker;
import com.procrm.pages.EmployeeTasksPage;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class EmployeeTasksStepDef {
    EmployeeTasksPage empTasksPage = new EmployeeTasksPage();
    Actions action = new Actions(Driver.getDriver());

    Faker faker = new Faker();

    @When("user clicks ADD Department button.")
    public void user_clicks_add_department_button() throws InterruptedException {
        empTasksPage.addDepartment.click();
        //BrowserUtilities.waitForClickablility(empTasksPage.addDepartment, 10);


    }

    @When("user types department name")
    public void user_types_department_name() {
        empTasksPage.addDepartmentName.sendKeys("Group25");

    }

    @When("user clicks add")
    public void user_clicks_add() {
        empTasksPage.addDepartmentButton.click();

    }

    @Then("Verify that user can see the name of the newly created department")
    public void user_can_see_the_name_of_the_newly_created_department() throws InterruptedException {
        Assert.assertTrue(empTasksPage.createdDepartmentName.isDisplayed());
        //BrowserUtilities.waitForClickability(empTasksPage.addDepartment, 10);


    }

   /* @When("{string} user clicks Find Employees")
    public void userClicksFindEmployees() throws InterruptedException {
        //empTasksPage.openLeftMenu.click();
        /*
        Thread.sleep(5000);
        empTasksPage.employeesButton.click();
        Thread.sleep(5000);
        empTasksPage.employeesFindButton.click();
        Thread.sleep(5000);

         */

    //}


    @And("user types name of employee {string} in the search box")
    public void userTypesInTheSearchBox(String name) {

        empTasksPage.employeesSearchButton.sendKeys(name + Keys.ENTER);

    }

    @Then("Verify that user can see name of employee {string} employee info displayed")
    public void userCanSeeEmployeeInfoDisplayed(String nameEmployee) {
        //empTasksPage.disPlayedEmployeeName.isDisplayed();
        String actualNameEmployee = empTasksPage.disPlayedEmployeeName.getText();
        //Assert.assertEquals(nameEmployee, actualNameEmployee);
        Assert.assertTrue(empTasksPage.disPlayedEmployeeName.isDisplayed());

    }


    @And("user types wrong employee name {string} in the search box")
    public void userTypesWrongEmployeeNameInTheSearchBox(String anyName) {
        //empTasksPage.employeesSearchButton.sendKeys(anyName);
        empTasksPage.employeesSearchButton.sendKeys(anyName + Keys.ENTER);

    }

    @When("user clicks Employees button.")
    public void userClicksEmployeesButton() {
        empTasksPage.employeesButton.click();
    }

    @And("user clicks Find Employees")
    public void userClicksFindEmployees() {

        BrowserUtilities.sleep(3);
        empTasksPage.findEmployeeButton.click();
        BrowserUtilities.sleep(3);
    }

    @When("user click search button")
    public void user_click_search_button() {
        empTasksPage.secondSearchButton.click();

    }

    @And("user clicks Search By Alphabet button")
    public void userClicksSearchByAlphabetButton() {
        empTasksPage.searchByAlphabet.click();
    }

    @And("user clicks the letter {string}")
    public void userClicksTheLetter(String letter) {
        empTasksPage.alphabetA.click();
        BrowserUtilities.sleep(7);
    }

    @Then("Verify that user can see this message {string}")
    public void userCanSeeThisMessage(String message) {
        Assert.assertEquals(message, empTasksPage.message.getText());

    }

    @And("user clicks the more button")
    public void userClicksTheMoreButton() {
        empTasksPage.moreButton.click();
    }

    @And("user clicks Export to Excel")
    public void userClicksExportToExcel() {
        empTasksPage.exportToExcel.click();
        BrowserUtilities.sleep(7);

    }

    @Then("Verify that user download the file")
    public void userDownloadTheFile() {
        // Assert.assertEquals(userDownloadTheFile,empTasksPage.userDownloadTheFile.getText());
//        Assert.assertTrue(empTasksPage.isFileDownloaded("C:\\Users\\ecebo\\Downloads", "users.xlsx"));
        Assert.assertTrue(empTasksPage.isFileDownloaded("users.xlsx"));

    }

    @Then("Verify that user disable to see the result of input")
    public void userDisableToSeeTheResultOfInput() {
        //empTasksPage.findEmployeeResultChild1.isDisplayed();
        Assert.assertTrue(empTasksPage.findEmployeeResultChild1.isDisplayed());
    }

    @And("user types some {string} in the search box")
    public void userTypesSomeInTheSearchBox(String specialCharacter) {
        empTasksPage.employeesSearchButton.sendKeys(specialCharacter + Keys.ENTER);

    }

    @When("user find name of receiver as {string}")
    public void user_find_name_of_receiver_as(String receiver) {
        empTasksPage.typesHiMessage.click();

    }

    @When("user clicks {string} button")
    public void user_clicks_button(String string) {
        empTasksPage.sendMessageButton.click();

    }

    @When("user types {string} and send message")
    public void user_types_and_send_message(String message) {
        empTasksPage.sendMessageBox.sendKeys(message + Keys.ENTER);

    }

    @Then("verify that {string} gets {string}")
    public void verify_that_gets(String string, String string2) {
        Assert.assertTrue(empTasksPage.cemal.isDisplayed());
    }

    @When("user clicks {string} button {int} times")
    public void user_clicks_button_times(String message, Integer times) {


    }

    @When("user types {string} and send message {string} times")
    public void user_types_and_send_message_times(String message, String string2) {
        int times = Integer.parseInt(string2);
        for (int i = 0; i < times; i++) {
            empTasksPage.sendMessageBox.sendKeys(message + Keys.ENTER);
            BrowserUtilities.sleep(3);

        }
    }

    @Then("verify that {string} gets an {string}")
    public void verify_that_gets_an(String string, String string2) {

    }


}