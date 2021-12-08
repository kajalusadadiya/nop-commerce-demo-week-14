package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    @FindBy(linkText = "Computers")
    //li[@class='active last']//a[normalize-space()='Computers']
    WebElement computerLink;

    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computerPageTitle;

    @FindBy(xpath = "//li[@class='active last']//a[normalize-space()='Desktops']")
    WebElement desktop;

    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopText;

    @FindBy(xpath = "//div[@class='picture']//img[@title='Show details for Build your own computer']")
    WebElement buildYourOwnComputer;

    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement ProcessorDropDownBox;
    @FindBy(id = "product_attribute_2")
    WebElement ram;
    @FindBy(id = "product_attribute_3_7")
    WebElement hdd;
    @FindBy(id = "product_attribute_4_9")
    WebElement OS;

    // By selectSoftwareOneOption =By.id("product_attribute_5_10");
    //  By selectSoftwarTwoOption = By.id("product_attribute_5_12");
    public void clickOnComputerLink() {
        Reporter.log(" Click on WomenTab button " + computerLink.toString() + "<br>");
        clickOnElement(computerLink);
    }

    public void verifycomputerpagetitle(String title) {
        Reporter.log(" Comptuer page " + title + " dispalyed " + computerPageTitle.toString() + "<br>");
        verifyThatTextIsDisplayed(computerPageTitle, "Computers");
    }

    public void selectDesktopOption() {
        mouseHoverToElement(computerLink);
        clickOnElement(desktop);

    }

    public void verifydesktoppagetitle(String title) {
        Reporter.log(" desktop page " + title + " dispalyed " + desktopText.toString() + "<br>");
       // verifyText(computerPageTitle, "Desktops");
       verifyThatTextIsDisplayed(computerPageTitle, "Desktops");
    }

    public void clickOnBuildYourOwnComputer() {
        Reporter.log(" desktop page " + buildYourOwnComputer.toString() + "<br>");
        clickOnElement(buildYourOwnComputer);

    }

    public void SelectProcessorDropDownBox(String processor) {
        selectByValueFromDropDown(ProcessorDropDownBox, processor);
    }

    public void selectRamFromDropDown(String Ram) {

        selectByValueFromDropDown(ram, Ram);

    }
    public void selectHDD(){
        clickOnElement(hdd);

    }
}
