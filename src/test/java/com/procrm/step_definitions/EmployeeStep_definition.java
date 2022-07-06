package com.procrm.step_definitions;

import com.procrm.pages.BasePage;
import com.procrm.pages.CompanyPage;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EmployeeStep_definition {

    CompanyPage companyPage = new CompanyPage();


    @When("user clicks Employees button")
    public void user_clicks_employees_button() {
        companyPage.menu.click();
        BrowserUtilities.sleep(3);
    }
    @When("user clicks Company Structure button")
    public void user_clicks_company_structure_button() {
        companyPage.companyStructure.click();
        BrowserUtilities.sleep(3);
    }
    @Then("user should see the Company Structure")
    public void user_should_see_the_company_structure() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Company Structure"));
    }
    @When("user clicks Telephone Directory button")
    public void user_clicks_telephone_directory_button() {
        companyPage.telephoneDirectory.click();
        BrowserUtilities.sleep(3);

      }
    @Then("user should see the telephone directory")
    public void user_should_see_the_telephone_directory() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Telephone Directory"));

    }

    @Given("{string} logs in home page")
    public void logsInHomePage(String user) {
        if (user.equals("hr")){
            BasePage.loginAsHR();
            BrowserUtilities.sleep(3);
        }else if (user.equals("marketing")){
            BasePage.loginAsMarketing();
            BrowserUtilities.sleep(3);
        }else {
            BasePage.loginAsHelpDesk();
            BrowserUtilities.sleep(3);
        }

    }
    }

