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

    @FindBy(xpath = "//a[@id='bx-destination-tag']")
    public WebElement addUsersButton;

    @FindBy (xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-department bx-finder-box-tab-selected']")
    public WebElement employeesAndDepartmentsButton;

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
