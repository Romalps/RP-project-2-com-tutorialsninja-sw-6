package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MyAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    public MyAccountPage() {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Account Logout']")
    WebElement accountLogoutText;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accountCreatedText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueBtn;

    public String getAccountLogoutText()  {
        log.info("Get Account Logout text " + accountLogoutText.toString());
        return getTextFromElement(accountLogoutText);
    }
    public void verifyTheTextAccountLogout(String expectedMessage){
        Assert.assertEquals(getAccountLogoutText(),expectedMessage);
    }

    public String getYourAccountHasBeenCreatedText()  {
        log.info("Get your Account has been created text " + accountCreatedText.toString());
        return getTextFromElement(accountCreatedText);
    }

    public void clickOnContinueButton()  {

        clickOnElement(continueBtn);
        log.info(" Click on Continue button " + continueBtn.toString());
    }


}
