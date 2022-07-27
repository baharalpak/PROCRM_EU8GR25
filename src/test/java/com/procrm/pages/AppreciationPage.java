package com.procrm.pages;

import com.procrm.utilities.BrowserUtilities;
import com.procrm.utilities.Driver;
import org.apache.commons.collections.functors.ExceptionPredicate;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppreciationPage {

    //CONSTRUCTOR
    public AppreciationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    String fileName;
    //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    //WEBELEMENTS
    @FindBy(className = "feed-add-post-form-link-text")
    public WebElement moreButton;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[2]")
    public WebElement appreciationButton;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    private WebElement uploadFilesIcon;

    @FindBy(name = "bxu_files[]")
    public WebElement uploadFilesAndImagesButton;

    @FindBy(xpath = "(//button[@class='ui-btn ui-btn-lg ui-btn-primary'])[1]")
    public WebElement sendButton;

    @FindBy(xpath = "//a[text()='My Drive / Uploaded files']")
    public WebElement uploadedFiles;

    @FindBy(xpath = "//a[@id='bx-destination-tag']")
    public WebElement addMoreButton;

    @FindBy(xpath = "//*[contains(@id, 'destDepartmentTab_destination')]")
    public WebElement employeesAndDepartmentsButton;

    @FindBy(xpath = "//a[@href='#U693']")
    public WebElement email1;

    @FindBy(xpath = "//a[@href='#U512']")
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

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-quote']")
    public WebElement quoteIcon;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement quotationIframe;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement quotationBox;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement mentionIcon;

    @FindBy(xpath = "//*[contains(@id, 'destDepartmentTab_mention')]")
    public WebElement employeesAndDepartmentsButtonForAddingMentions;

    @FindBy(xpath = "(//table[@class='blogquote'])[1]//td")
    public WebElement topQuotation;

    @FindBy(xpath = "//div[@class='feed-add-post-destination-wrap']")
    public WebElement contactsBox;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement excludingAllEmployees;



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

    public void addLinkAndText() {
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

    public void addingMention() {
        mentionIcon.click();
        employeesAndDepartmentsButtonForAddingMentions.click();
        BrowserUtilities.sleep(2);
        email1.click();
        BrowserUtilities.sleep(2);

    }

    public boolean isFileNameMatching() {

        return uploadedFiles.getAttribute("title").contains("file")
                && uploadedFiles.getAttribute("alt").contains(".xlsx");
    }

    public boolean isPictureNameMatching() {

        return uploadedFiles.getAttribute("alt").contains("image")
                && uploadedFiles.getAttribute("alt").contains(".jpg");

    }
    //method for the quotation scenario
    public String getTopQuotationText() {
        try
        {
            //wait.until(ExpectedConditions.elementToBeClickable(topQuotation));
            BrowserUtilities.waitForClickablility(topQuotation, 10);
            return topQuotation.getText();
        }
        catch (StaleElementReferenceException e)
        {
            Driver.getDriver().navigate().refresh();
            return topQuotation.getText();
        }
    }
}
