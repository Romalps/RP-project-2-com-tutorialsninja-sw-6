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

public class AccountLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountLoginPage.class.getName());

    public AccountLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement returningCustomerText;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[1]//h2")
    WebElement newCustomerText;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailAddressField;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//form[contains(@action,'login')]//input[@type='submit']")
    WebElement loginBtn;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='My Account']")
    WebElement myAccountText;

    public String getReturningCustomerText() {

        log.info("Get Returning Customer Text " + returningCustomerText.toString());
        return getTextFromElement(returningCustomerText);

    }

    public void verifyTheTextReturningCustomer(String expectedMessage) {
        Assert.assertEquals(getReturningCustomerText(), expectedMessage);
    }

    public String getNewCustomerText() {

        log.info("Get New Customer text " + newCustomerText.toString());
        return getTextFromElement(newCustomerText);
    }

    public void enterEmailAddress(String email) {

        sendTextToElement(emailAddressField, email);
        log.info("Enter Email Address " + emailAddressField.toString());
    }

    public void enterPassword(String password) {

        sendTextToElement(passwordField, password);
        log.info("Enter Password " + passwordField.toString());
    }

    public void clickOnLoginButton() {

        clickOnElement(loginBtn);
        log.info("Click On Login button " + loginBtn.toString());
    }

    public void verifyTextMyAccount(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(myAccountText), expectedMessage);
    }

}
