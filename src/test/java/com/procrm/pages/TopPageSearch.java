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

   /* @FindBy(id="LIVEFEED_search")
   // public WebElement secondTopPageSearch;

    //@FindBy(id = "search-textbox-input")
    //@FindBy(xpath = "//span[@class='header-search-icon header-search-icon-title']")
    //@FindBy(xpath = "//*[@id=\"search\"]/span[1]")
    //@FindBy(xpath = "(//a[@class='search-title-top-item-link'])[1]")
    @FindBy(xpath = "(//a[@href='/company/personal/user/693/blog/'])[3]")
    public WebElement topPageSearchButton;  */
    @FindBy(xpath = "(//a[@href='/about/company/contacts.php'])[1]")
    public WebElement otherSite;

    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement verifyConversations;





}
