package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyPage extends BasePage {

    @FindBy(id = "sitemap-menu")
    public WebElement menuButton;

    @FindBy(id = "pagetitle")
    public WebElement pageTitle;


    public void clickAnyFunctions(String functionName){
        WebElement element = Driver.getDriver().findElement(By.xpath("//*[text()='"+functionName+"']"));
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();

    }


}
