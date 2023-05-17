package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());


    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Checkout']")
    WebElement checkoutText;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New Customer']")
    WebElement newCustomerText;
    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestCheckoutRadioBtn;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//div[@class='form-group required']//input[@placeholder='E-Mail']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Telephone']")
    WebElement telephone;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Address 1']")
    WebElement address1;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='City']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postcode;
    @CacheLookup
    @FindBy(xpath = "//select[@name='country_id']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath = "//select[@name='zone_id']")
    WebElement region;
    @CacheLookup
    @FindBy(xpath = "//div[@class='pull-right']//input[@value='Continue']")
    WebElement continueBtn;

    @CacheLookup
    @FindBy(xpath = "//textarea[@name='comment']")
    WebElement addComments;
    @CacheLookup
    @FindBy(xpath = "//input[@name='agree']")
    WebElement termsAndConditionCheckbox;
    @CacheLookup
    @FindBy(xpath = "//div[@class='panel-collapse collapse in']//input[@value='Continue']")
    WebElement continueTab;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    WebElement warningMessage;

    //2.16 Verify the text “Checkout”
    public void verifyTheTextCheckout(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(checkoutText), expectedMessage);
    }

    //2.17 Verify the Text “New Customer”
    public void verifyTheTextNewCustomer(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(newCustomerText), expectedMessage);
    }

    //2.18 Click on “Guest Checkout” radio button
    public void clickOnGuestCheckoutRadioButton() {
        clickOnElement(guestCheckoutRadioBtn);
        log.info("Click on guest checkout radio button " + guestCheckoutRadioBtn.toString());
    }

    //2.19 Click on “Continue” tab
    public void clickOnContinueTab() {
        clickOnElement(continueButton);
        log.info("Click on continue tab " + continueButton.toString());
    }

    //2.20 Fill the mandatory fields
    public void fillTheMandatoryFields() {
        // Find First Name field element and send element
        sendTextToElement(firstName, "prime" + getRandomString(4));
        // Find Last Name field element and send element
        sendTextToElement(lastName, "Tester");
        // Find Email field element and send element
        sendTextToElement(email, "prime" + getRandomString(4) + "@gmail.com");
        // Find Telephone field element and send element
        sendTextToElement(telephone, "07963258712");
        // Find Address1 field element and send element
        sendTextToElement(address1, "333, High Hill");
        // Find City field element and send element
        sendTextToElement(city, "Birmingham");
        // Find Postcode field element and send element
        sendTextToElement(postcode, "BR10 6TR");
        // Find Country field element and select element
        selectByVisibleTextFromDropDown(country, "United States");
        // Find Region field element and select element
        selectByVisibleTextFromDropDown(region, "Colorado");
    }

    //2.21 Click on “Continue” Button
    public void clickOnContinueButton() {
        clickOnElement(continueBtn);
        log.info("Click on continue " + continueBtn);
    }

    //2.22 Add Comments About your order into text area
    public void addCommentsAboutYourOrderIntoTextArea() {
        sendTextToElement(addComments, "Make sure it's arrive on time and handle with care.");
        log.info("Add comments about your order into text area  " + addComments.toString());
    }

    //2.23 Check the Terms & Conditions check box
    public void checkTheTermsAndConditionsCheckbox() {
        clickOnElement(termsAndConditionCheckbox);
        log.info("Check the terms and conditions check box " + termsAndConditionCheckbox.toString());
    }

    //2.24 Click on “Continue” button
    public void clickOnContinue() {
        clickOnElement(continueTab);
        log.info("Click on continue button " + continueTab.toString());
    }

    public void verifyTheWarningPaymentMethodRequiredMessage(String expectedMessage) {
        Assert.assertTrue(getTextFromElement(warningMessage).contains(expectedMessage));
    }
}
