package com.procrm.pages;

import com.procrm.utilities.ConfigurationReader;
import com.procrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

   public static void loginAsHR() {
                Driver.getDriver().get(ConfigurationReader.getProperty("url"));
                Driver.getDriver().findElement(By.name("USER_LOGIN")).sendKeys(ConfigurationReader.getProperty("hrUser"));
                Driver.getDriver().findElement(By.name("USER_PASSWORD")).sendKeys(ConfigurationReader.getProperty("password"));
                Driver.getDriver().findElement(By.className("login-btn")).click();
    }

    public static void loginAsMarketing() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().findElement(By.name("USER_LOGIN")).sendKeys(ConfigurationReader.getProperty("marketingUser"));
        Driver.getDriver().findElement(By.name("USER_PASSWORD")).sendKeys(ConfigurationReader.getProperty("password"));
        Driver.getDriver().findElement(By.className("login-btn")).click();
    }
    public static void loginAsHelpDesk() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().findElement(By.name("USER_LOGIN")).sendKeys(ConfigurationReader.getProperty("helpdeskUser"));
        Driver.getDriver().findElement(By.name("USER_PASSWORD")).sendKeys(ConfigurationReader.getProperty("password"));
        Driver.getDriver().findElement(By.className("login-btn")).click();
    }

    public static void clickAnyFunctions(String functionName){
        WebElement element = Driver.getDriver().findElement(By.xpath("//*[text()='"+functionName+"']"));
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();

    }

}







