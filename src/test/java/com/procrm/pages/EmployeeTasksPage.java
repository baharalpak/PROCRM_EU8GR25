package com.procrm.pages;

import com.procrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.util.List;

public class EmployeeTasksPage {




    public EmployeeTasksPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='webform-small-button-text']")
    public WebElement addDepartment;

    @FindBy(id = "NAME")
    public WebElement addDepartmentName;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement addDepartmentButton;

    @FindBy(xpath = "//a[@title='Department25']")
    public WebElement createdDepartmentName;

    //@FindBy(xpath = "(//span[@class='menu-item-link-text'])[10]")
    @FindBy(xpath = "//*[@id='bx_left_menu_menu_company']/a/span")
    public WebElement employeesButton;

    @FindBy(xpath = "(//span[@class='main-buttons-item-text-title'])[2]")
    public WebElement employeesFindButton;

    @FindBy(xpath = "//input[@id='user-fio']")
    public WebElement employeesSearchButton;

    @FindBy(xpath = "//a[@class='employee-name-link']")
    public WebElement disPlayedEmployeeName;

    @FindBy(id = "sitemap-menu")
    public WebElement openLeftMenu;

    @FindBy(xpath = "//*[@id='top_menu_id_company_342409671']/a/span[2]/span[2]")
    public WebElement findEmployeeButton;

    @FindBy(xpath = "(//span[@class='bx24-top-bar-search-icon'])")
    public WebElement secondSearchButton;

    @FindBy(xpath = "//span[@class='filter-but-text']")
    public WebElement searchByAlphabet;

    @FindBy(linkText = "A")
    public WebElement alphabetA;

    @FindBy(xpath = "//div[@id='comp_c14920942c1dc3377c56d580c09bf654']/p")
    public WebElement message;

    @FindBy(xpath = "//*[@id='filter-but-more']/span[2]")
    public WebElement moreButton;

    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-more-action-menu']/div/div/a[1]/span[2]")
    public WebElement exportToExcel;

    @FindBy(xpath = "//*[@id='tr_485']//td[1]")
    public WebElement findEmployeeResultChild1;

    @FindBy(css = "[class='bx-user-name']")
    public List<WebElement> telephoneDirectoryList;

    public WebElement findReceiverName(String recevierName) {
        WebElement expectedMention = null;
        for (WebElement el : telephoneDirectoryList) {
            if (el.getText().equalsIgnoreCase(recevierName))
                expectedMention = el;
        }
        return expectedMention;
    }

    @FindBy(css = "[class='webform-small-button-text']")
    public WebElement sendMessageButton;

    @FindBy(css="[class='bx-messenger-textarea-input']")
    public WebElement sendMessageBox;

    @FindBy(css="[class='bx-messenger-message']")
    public WebElement cemal;

    @FindBy(xpath = "//a[@bx-tooltip-user-id='500']")
    public WebElement typesHiMessage;

    @FindBy(xpath = "//span[@class='webform-small-button-text']")
    public WebElement addDepartmentAgain;

    @FindBy(id = "NAME")
    public WebElement addSameDepartmentName;

    @FindBy(xpath = "//*[text()='Telephone Directory']")
    public WebElement telephoneDirectory;

   public static Boolean isFileDownloaded(String fileName) {
        boolean flag = false;
        //paste your directory path below
        //eg: C:\\Users\\username\\Downloads
        String dirPath = "C:\\Users\\ecebo\\Downloads";
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        if (files.length == 0 || files == null) {
            System.out.println("The directory is empty");
            flag = false;
        } else {
            for (File listFile : files) {
                if (listFile.getName().contains(fileName)) {
                    System.out.println(fileName + " is present");
                    break;
                }
                flag = true;
            }
        }
        return flag;

    }

 /*
    public boolean isFileDownloaded(String downloadPath, String fileName) {
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();

        for (int i = 0; i < dirContents.length; i++) {
            if (dirContents[i].getName().equals(fileName)) {
                // File has been found, it can now be deleted:
                dirContents[i].delete();
                return true;
            }
        }
        return false;
    }*/
}

