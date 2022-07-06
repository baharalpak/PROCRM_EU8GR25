package com.procrm.step_definitions;

import com.procrm.pages.CompanyPage;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.ConfigurationReader;
import com.procrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class EmployeeStep_definition {

    CompanyPage companyPage = new CompanyPage();

    @And("user clicks {string} button")
    public void userClicksButton(String functionName) {
    companyPage.menuButton.click();
        BrowserUtilities.sleep(2);
    companyPage.clickAnyFunctions(functionName);
    }

    @Then("user verifies Page Title as {string}")
    public void userVerifiesPageTitleAs(String expectedPageTitle) {
        BrowserUtilities.sleep(2);
        Assert.assertEquals(expectedPageTitle, companyPage.pageTitle.getText());
    }


}
