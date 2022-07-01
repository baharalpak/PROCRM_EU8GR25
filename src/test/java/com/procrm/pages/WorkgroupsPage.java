package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkgroupsPage {

    public WorkgroupsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "menu-item-link-text")
    public WebElement workgroupLink;

   @FindBy(className = "sonet-groups-group-link")
    public WebElement CChristmasParty;

   @FindBy(id = "bx-sonet-groups-sort-value")
   public WebElement abcOrder;

   @FindBy(id= "bx-sonet-groups-request-1")
   public WebElement groupRequest;

}
