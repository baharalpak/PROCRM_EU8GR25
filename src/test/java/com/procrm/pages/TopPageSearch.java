package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopPageSearch {
    public TopPageSearch(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //@FindBy(xpath = "//input[@id='search-textbox-input']")
    @FindBy(id="search-textbox-input")
    public WebElement searchBox;

    @FindBy(xpath = "//a[@href='/company/personal/user/693/blog/']")
    public WebElement conversationsButton;

    @FindBy(xpath = "(//a[@href='/about/company/contacts.php'])[1]")
    public WebElement otherSite;

    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement verifyConversations;





}
