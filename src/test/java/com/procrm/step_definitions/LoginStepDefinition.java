package com.procrm.step_definitions;

import com.procrm.pages.LoginPage;
import com.procrm.utilities.ConfigurationReader;
import com.procrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginStepDefinition {


    LoginPage loginPage = new LoginPage();

        @Given("user launch  the given url")
        public void user_launch_the_given_url() {

            String url = ConfigurationReader.getProperty("url");
            Driver.getDriver().get(url);
        }


        @When("user enters {string} and {string}")
        public void user_enters_and(String username, String password) {
            loginPage.login(username, password);
        }
        @When("user click on login button")
        public void user_click_on_login_button() {
            loginPage.loginButton.click();
        }
        @Then("user should land on home page")
        public void user_should_land_on_home_page() {
            Assert.assertTrue(Driver.getDriver().getTitle().contains("Portal"));
        }


    @When("user enters invalid {string} and {string}")
    public void userEntersInvalidAnd(String username, String password) {
            loginPage.login(username,password);

    }

    @Then("user should not login on home page")
    public void userShouldNotLoginOnHomePage() {
            Assert.assertFalse("User cannot login with invalid credentials",Driver.getDriver().getTitle().contains("Portal"));

    }
}



