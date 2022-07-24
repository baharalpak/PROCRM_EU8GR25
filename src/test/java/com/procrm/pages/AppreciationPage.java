package com.procrm.pages;

import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage {

    //CONSTRUCTOR
    public AppreciationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    String fileName;

    //WEBELEMENTS
    @FindBy(className = "feed-add-post-form-link-text")
    public WebElement moreButton;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[2]")
    public WebElement appreciationButton;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    private WebElement uploadFilesIcon;

    @FindBy(name = "bxu_files[]")
    public WebElement uploadFilesAndImagesButton;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "//a[text()='My Drive / Uploaded files']")
    public WebElement uploadedFiles;

    @FindBy(xpath = "//*[@id=\"bx-destination-tag\"]")
    public WebElement addUsersButton;

    @FindBy (xpath = "//*[contains(@id, 'destDepartmentTab_destination')]")
    public WebElement employeesAndDepartmentsButton;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[2]/div[1]/div[1]")
    public WebElement email1;

    @FindBy(xpath = "//*[@id=\"bx-lm-category-relation-129\"]/a[3]/div[1]/div[1]")
    public WebElement email2;

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement linkIcon;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement linkText;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkURL;

    @FindBy(xpath = "//*[@id=\"undefined\"]")
    public WebElement linkSaveButton;

    @FindBy(xpath = "//*[@id=\"bx-b-video-blogPostForm\"]/span")
    public WebElement videoIcon;

    @FindBy(xpath = "//body[@class='vsc-initialized']")
    public WebElement messageBox;

    @FindBy(xpath = "//*[@title='Quote text']")
    public WebElement quoteIcon;

    @FindBy (xpath = "//*[@class='bxhtmled-quote']")
    public WebElement quotationBox;



    //METHODS
    public void uploadFile(String filePath) {
        uploadFilesIcon.click();
        uploadFilesAndImagesButton.sendKeys(filePath);
        BrowserUtilities.sleep(5);
        // sendButton.click();
        fileName = filePath.substring(filePath.lastIndexOf("\\") + 1, filePath.lastIndexOf("."));
    }

    public void uploadPicture(String picturePath) {
        //uploadFilesIcon.click();
        uploadFilesAndImagesButton.sendKeys(picturePath);
        BrowserUtilities.sleep(5);
        // sendButton.click();
    }

    public void addLinkAndText(){
        linkIcon.click();
        BrowserUtilities.sleep(2);
        String linkTextWritten = "The title of the linked website";
        linkText.sendKeys(linkTextWritten);
        BrowserUtilities.sleep(2);
        String youtubeLink = "www.youtube.com";
        linkURL.sendKeys(youtubeLink);
        BrowserUtilities.sleep(2);
        linkSaveButton.click();
    }

    public boolean isFilesAndImagesUploaded(int totalNumberOfFilesAndImages) {
        boolean flag = true;
        for (int i = 1; i <= totalNumberOfFilesAndImages; i++) {
            Driver.getDriver().findElement(By.xpath("(//a[text()='My Drive / Uploaded files'])[" + i + "]"));
            if (!uploadedFiles.isDisplayed()) {
                flag = false;
            }
        }
        return flag;
    }

    public boolean isFileNameMatching() {

        return uploadedFiles.getAttribute("title").contains("file")
                && uploadedFiles.getAttribute("alt").contains(".xlsx");
    }

    public boolean isPictureNameMatching() {

        return uploadedFiles.getAttribute("alt").contains("image")
                && uploadedFiles.getAttribute("alt").contains(".jpg");

    }
}
