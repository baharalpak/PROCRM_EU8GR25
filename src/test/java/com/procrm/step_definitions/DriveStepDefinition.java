package com.procrm.step_definitions;

import com.procrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DriveStepDefinition {

    @Given("user is on Home Page.")
    public void user_is_on_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user click on Drive module.")
    public void user_click_on_drive_module() {
        WebElement dirverButton = Driver.getDriver().findElement(By.xpath("//*[@id=\"bx_left_menu_menu_files\"]/a/span"));
        dirverButton.click();
    }
    @Then("user should be able to see My Driver")
    public void user_should_be_able_to_see_my_driver() {
        String expectedTitle = "My Drive";
        WebElement actualTitle = Driver.getDriver().findElement(By.xpath("//*[@id=\"top_menu_id_docs_menu_my_disk\"]"));
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Given("user is on Driver module.")
    public void user_is_on_driver_module() {
        WebElement dirverButton = Driver.getDriver().findElement(By.xpath("//*[@id=\"bx_left_menu_menu_files\"]/a/span"));
        dirverButton.click();
    }

    @Then("user click on All Documents.")
    public void user_click_on_all_documents() {

        // //*[@id="top_menu_id_docs_63494979"]/a/span[2]/span[2]
        WebElement AllDocButton = Driver.getDriver().findElement(By.xpath("//*[@id=\"top_menu_id_docs_63494979\"]/a/span[2]/span[2]"));
        AllDocButton.click();
    }

    @Then("user should be able to see All Documents.")
    public void user_should_be_able_to_see_all_documents() {
       //#pagetitle
        String expectedTitle = "All Documents";
        WebElement actualTitle = Driver.getDriver().findElement(By.cssSelector("#pagetitle"));
        Assert.assertEquals(expectedTitle,actualTitle);
    }


}
