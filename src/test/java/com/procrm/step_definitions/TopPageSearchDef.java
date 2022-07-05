package com.procrm.step_definitions;

import com.procrm.pages.BasePage;
import com.procrm.pages.TopPageSearch;
import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.ConfigurationReader;
import com.procrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopPageSearchDef {
    TopPageSearch topPageSearch=new TopPageSearch();
   // @Given("user is on agileprocrm homepage")
   // public void user_is_on_agileprocrm_homepage() {
 //       BasePage.loginAsHR();
  //  }
   @Given("{string} user is on homepage")
   public void userIsOnHomepage(String user) {
        BasePage.loginAsHR();
   }

    @When("user types {string} in the agileprocrm search box and press enter")
    public void user_types_in_the_agileprocrm_search_box_and_press_enter(String searchValue) {

        topPageSearch.searchBox.sendKeys(searchValue);
        BrowserUtilities.sleep(3);
        topPageSearch.searchBox.sendKeys(Keys.ENTER);
        BrowserUtilities.sleep(3);
    }
    @Then("user should see Conversations in the page")
    public void user_should_see_conversations_in_the_page() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Conversations"));
    }


    @Then("user should see {string} in the page")
    public void userShouldSeeInThePage(String result) {
        Assert.assertTrue(Driver.getDriver().getTitle().substring(5).trim().equals(result));
        //Assert.assertTrue(Driver.getDriver().getTitle().substring(5).equals(result));
       // Assert.assertTrue(Driver.getDriver().getTitle().contains(result));
    }

    @When("user types non-related characters {string} in the agileprocrm search box and press enter")
    public void userTypesNonRelatedCharactersInTheAgileprocrmSearchBoxAndPressEnter(String nonRelatedWords) {
        topPageSearch.searchBox.sendKeys(nonRelatedWords);
        BrowserUtilities.sleep(3);
        topPageSearch.searchBox.sendKeys(Keys.ENTER);
        BrowserUtilities.sleep(3);
    }

    @Then("user should not see search result {string}")
    public void userShouldNotSeeSearchResult(String result) {
       Assert.assertTrue(Driver.getDriver().getTitle().substring(5).trim().equals(result));
       // Assert.assertFalse(Driver.getDriver().getTitle().contains(result));
    }

    @When("user does not types anything")
    public void userDoesNotTypesAnything() {
        topPageSearch.searchBox.sendKeys(Keys.ENTER);
        BrowserUtilities.sleep(3);
    }

    @Then("user cannot search")
    public void userCannotSearch() {
        Assert.assertTrue(Driver.getDriver().getTitle().substring(5).trim().equals("Portal"));
    }


}
