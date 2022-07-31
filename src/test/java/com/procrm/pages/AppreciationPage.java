package com.procrm.pages;

import com.github.javafaker.Faker;
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


    Faker faker = new Faker();
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

    @FindBy(xpath = "//div[@class='feed-post-block feed-post-block-short feed-post-block-separator']//a[text()='helpdesk35@cybertekschool.com']")
    public WebElement emailChosen1;
    @FindBy(xpath = "//div[@class='feed-post-block feed-post-block-short feed-post-block-separator']//a[text()='marketing26@cybertekschool.com']")
    public WebElement emailChosen2;
    @FindBy(xpath = "//div[@class='feed-post-block feed-post-block-short feed-post-block-separator']//a[text()='hr89@cybertekschool.com ']")
    public WebElement emailChosen3;

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
    public WebElement quotationBoxIframe;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement messageBoxIframe;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement quotationBox;

    @FindBy(xpath = "//body[@style='min-height: 184px;']")
    public WebElement emptyMessageBox;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement mentionIcon;

    //a[@class='bx-finder-box-tab bx-lm-tab-department bx-finder-box-tab-selected']
    @FindBy(xpath = "//a[contains(@id,'destDepartmentTab')]")
    public WebElement employeesAndDepartmentsButtonForAddingMentions;

    @FindBy(xpath = "(//table[@class='blogquote'])[1]//td")
    public WebElement topQuotation;

    @FindBy(xpath = "(//span[@class='feed-add-post-destination-cont'])[1]")
    public WebElement topUserData;

    @FindBy(xpath = "//div[@class='feed-add-post-destination-wrap']")
    public WebElement contactsBox;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement excludingAllEmployees;


    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement choosingContacts;

    @FindBy(xpath = "//div[@class='feed-post-text-block-inner-inner']/a")
    public WebElement urlLink;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner']//a[text()='helpdesk35@cybertekschool.com'])[1]")
            public WebElement addedMention;

    //Driver.getDriver().findElement(By.xpath("(//div[@class='feed-post-text-block-inner-inner']//a[text()='+"---+"'])[1]"))


    //div[@class='feed-post-text-block-inner-inner']/a

    String youtubeLink;

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
        Driver.getDriver().switchTo().frame(messageBoxIframe);
        emptyMessageBox.clear();
        BrowserUtilities.sleep(2);
        emptyMessageBox.sendKeys(faker.educator().university());
        BrowserUtilities.sleep(2);
        Driver.getDriver().switchTo().parentFrame();

        mentionIcon.click();
        BrowserUtilities.sleep(2);
        employeesAndDepartmentsButtonForAddingMentions.click();



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
        try {
            //wait.until(ExpectedConditions.elementToBeClickable(topQuotation));
            BrowserUtilities.waitForClickablility(topQuotation, 10);
            return topQuotation.getText();
        } catch (StaleElementReferenceException e) {
            Driver.getDriver().navigate().refresh();
            return topQuotation.getText();
        }
    }

    public String getTopUsersData() {
        try {
            //wait.until(ExpectedConditions.elementToBeClickable(topQuotation));
            BrowserUtilities.waitForClickablility(topUserData, 10);
            return topUserData.getText().toString();
        } catch (StaleElementReferenceException e) {
            Driver.getDriver().navigate().refresh();
            return topUserData.getText().toString();
        }
    }
    public void chooseContacts(String email) {
        try {
            BrowserUtilities.sleep(2);
            Driver.getDriver().findElement(By.xpath("//div[@class='bx-finder-company-department-employees']//div[text()='" + email + "']")).click();
        }catch (Exception e)
        {
            Driver.getDriver().switchTo().parentFrame();
            mentionIcon.click();
            BrowserUtilities.sleep(2);
            employeesAndDepartmentsButtonForAddingMentions.click();
            BrowserUtilities.sleep(2);
            Driver.getDriver().findElement(By.xpath("//div[@class='bx-finder-company-department-employees']//div[text()='" + email + "']")).click();
        }
    }
}
