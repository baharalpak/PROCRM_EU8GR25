package com.procrm.step_definitions;

import com.github.javafaker.Faker;
import com.procrm.pages.CompanyPage;
import com.procrm.pages.functionsUnderEmployeeMenuPage;
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
    CompanyPage companyPage = new CompanyPage();
    Actions action = new Actions(Driver.getDriver());

    Faker faker = new Faker();

    @When("user clicks ADD Department button")
    public void user_clicks_add_department_button() throws InterruptedException {
        functionsUnderEmployeeMenu.addDepartment.click();
        //BrowserUtilities.waitForClickablility(functionsUnderEmployeeMenu.addDepartment, 10);
        Thread.sleep(5000);

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
        //BrowserUtilities.waitForClickablility(functionsUnderEmployeeMenu.addDepartment, 10);
        Thread.sleep(5000);

    }

    @When("user clicks Find Employees")
    public void userClicksFindEmployees() {
        functionsUnderEmployeeMenu.employeesButton.click();
        functionsUnderEmployeeMenu.employeesFindButton.click();

    }

    @And("user types {string} in the search box")
    public void userTypesInTheSearchBox(String name) {
        functionsUnderEmployeeMenu.employeesSearchButton.sendKeys(name + Keys.ENTER);

    }

    @Then("user can see {string} employee info displayed")
    public void userCanSeeEmployeeInfoDisplayed(String arg0) {
    }

    @When("user click Find Employees")
    public void userClickFindEmployees() {
    }

    @And("user clicks Search By Alphabet button")
    public void userClicksSearchByAlphabetButton() {
    }

    @And("user clicks the letter {string}")
    public void userClicksTheLetter(String arg0) {
    }

    @Then("user can see employee info")
    public void userCanSeeEmployeeInfo() {
    }

    @Given("\"<user> user is on homepage")
    public void userUserIsOnHomepage() throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
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

}