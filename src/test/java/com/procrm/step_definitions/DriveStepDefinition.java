

package com.procrm.step_definitions;

import com.procrm.pages.BasePage;
import com.procrm.pages.DriverPage;
import com.procrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DriveStepDefinition {
    DriverPage driverPage =  new DriverPage();



    @When("click on Drive module.")
    public void click_on_drive_module() {
        driverPage.DriverButton.click();    }

    @Then("user should be able to see and access My Drive.")
    public void user_should_be_able_to_see_and_access_my_drive() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Drive"));    }



    @When("user click on All Documents.")
    public void user_click_on_all_documents() {
driverPage.AllDocumentsButton.click();

    }
    @Then("user should be able to see All Documents.")
    public void user_should_be_able_to_see_all_documents() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("All Documents"));
    }
    @When("user click on Drive module.")
    public void user_click_on_drive_module() {
        driverPage.DriverButton.click();
    }











}