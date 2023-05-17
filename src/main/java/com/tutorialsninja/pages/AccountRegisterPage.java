package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class AccountRegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountRegisterPage.class.getName());

    public AccountRegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerAccountText;
    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephoneField;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement passwordConfirmField;

    By subscribeRadios = By.xpath("//fieldset[3]//input");
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@name='agree']")
    WebElement privacyPolicyCheckBox;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@value='Continue']")
    WebElement continueBtn;

    @CacheLookup
    @FindBy(xpath = "//form[contains(@action,'login')]//input[@type='submit']")
    WebElement loginBtn;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement registerAccountSuccessMessage;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButtonOnSuccessPage;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Account Logout']")
    WebElement accountLogoutText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement clickOnContinue;

    public String getRegisterAccountText() {

        log.info("Get Register Account Text " + registerAccountText.toString());
        return getTextFromElement(registerAccountText);

    }

    public void verifyTheTextRegisterAccount(String expectedMessage) {
        Assert.assertEquals(getRegisterAccountText(), expectedMessage);
    }

    public void enterFirstName(String fName) {

        sendTextToElement(firstNameField, fName);
        log.info("Enter First Name " + firstNameField.toString());
    }

    public void enterLastName(String lName) {

        sendTextToElement(lastNameField, lName);
        log.info("Enter Last name " + lastNameField.toString());
    }

    public void enterEmail(String email) {

        sendTextToElement(emailField, email);
        log.info("Enter Email " + emailField.toString());
    }

    public void enterTelephone(String telephone) {

        sendTextToElement(telephoneField, telephone);
        log.info("Enter Telephone Number " + telephoneField.toString());
    }

    public void enterPassword(String password) {

        sendTextToElement(passwordField, password);
        log.info("Enter Password " + passwordField.toString());
    }

    public void enterConfirmPassword(String cPassword) {

        sendTextToElement(passwordConfirmField, cPassword);
        log.info("Enter confirm Password " + passwordConfirmField.toString());
    }

    public void selectSubscription(String option) {

        List<WebElement> radioButtons = getListOfElements(subscribeRadios);
        for (WebElement e : radioButtons) {
            if (e.getText().equals(option)) {
                e.click();
                break;
            }
        }
    }

    public void clickOnPrivacyPolicyCheckBox() {

        clickOnElement(privacyPolicyCheckBox);
        log.info("Click on Privacy Policy Checkbox " + privacyPolicyCheckBox.toString());
    }

    public void clickOnContinueButton() {

        clickOnElement(continueBtn);
        log.info("Click on Continue Button " + continueBtn.toString());
    }

    public void verifyTheMessageYourAccountHasBeenCreated(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(registerAccountSuccessMessage), expectedMessage);
    }

    public void clickOnContinueOnRegisteredSuccessPage() {
        clickOnElement(continueButtonOnSuccessPage);
        log.info("Click on continue " + continueButtonOnSuccessPage.toString());
    }

    public void verifyTheTextAccountLogout(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(accountLogoutText), expectedMessage);
    }

    public void clickOnContinue() {
        clickOnElement(clickOnContinue);
        log.info("Click on continue " + clickOnContinue.toString());
    }
}
