package com.procrm.step_definitions;

import com.github.javafaker.Faker;
import com.procrm.pages.CompanyPage;
import com.procrm.pages.FunctionsUnderEmployeeMenuPage;
import com.procrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class functionsUnderEmployeeMenu_StepDefinitions {

    FunctionsUnderEmployeeMenuPage functionsUnderEmployeeMenu = new FunctionsUnderEmployeeMenuPage();
    CompanyPage companyPage = new CompanyPage();
    Actions action = new Actions(Driver.getDriver());

    Faker faker = new Faker();

    @When("user clicks ADD Department button")
    public void user_clicks_add_department_button() {
        functionsUnderEmployeeMenu.addDepartment.click();

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
    public void user_can_see_the_name_of_the_newly_created_department() {
        Assert.assertTrue(functionsUnderEmployeeMenu.createdDepartmentName.isDisplayed());

    }

}



