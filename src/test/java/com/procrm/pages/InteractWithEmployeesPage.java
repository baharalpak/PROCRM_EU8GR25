package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InteractWithEmployeesPage {

    public InteractWithEmployeesPage() {

        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(xpath = "(//a[.='Comment'])[1]")
    public WebElement commentButton;

    @FindBy(xpath = "//body[@style='min-height: 84px;']")
    public WebElement commentInputBox;


   @FindBy(id="lhe_button_submit_blogCommentFormWbPP")
    public WebElement sendButton;

   @FindBy(id = "record-BLOG_103-15")
    public WebElement isVisibleName;

    @FindBy(xpath = "(//a[.='Like'])[1]")
    public WebElement likeButton;

    @FindBy(xpath ="//span[@title='Like']" )
    public WebElement likeButtonIsVisible;

   @FindBy(xpath = "(//span[.='Unfollow'])[1]")
    public WebElement unfollowButton;

   @FindBy(xpath = "//a[.='Follow']")
    public  WebElement followButtonIsVisible;

    @FindBy(xpath = "(//a[@class='bx-ilike-text'])[2]")
    public  WebElement likeButtonReviwers;

    @FindBy(xpath = "//span[@title='Like']")
    public WebElement getLikeButtonReviwersIsVisible;

  @FindBy(xpath = "//a[@class='feed-com-name  feed-author-name feed-author-name-600']")
    public WebElement clickReviwersName;


   @FindBy(xpath = "//div[@class='workarea-content-paddings']")
    public WebElement displayReviwersProfiles;

   @FindBy(id= "log_entry_favorites_787")
    public WebElement starIconButton;

   @FindBy(xpath = "//div[@title='Remove from favorites']")
    public WebElement seeYellowStarIcon;









}
