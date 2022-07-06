package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {

    public CompanyPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="sitemap-menu")
    public WebElement menu;

    @FindBy(xpath= "(//span[@class='menu-item-link-text'])[14]")
    public WebElement employeesButton;

    @FindBy(id = "pagetitle")
    public WebElement pageTitle;

    @FindBy(xpath = "(//a[@href='/company/vis_structure.php'])[3]")
    public WebElement companyStructure;

    @FindBy(xpath = "(//a[@href='/company/telephones.php'])")
    public WebElement telephoneDirectory;

    /*public void clickAnyFunctions(String functionName){
        WebElement element = Driver.getDriver().findElement(By.xpath("//*[text()='"+functionName+"']"));
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();



    }
 */

}
