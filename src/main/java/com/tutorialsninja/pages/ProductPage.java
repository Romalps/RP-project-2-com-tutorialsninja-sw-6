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

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='HP LP3065']")
    WebElement productText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'input-group date']//button")
    WebElement calendarButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")
    WebElement monthAndYearText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//th[@class='next']")
    WebElement nextButton;
    By dateList = By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']");
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement qtyField;
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")

    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMessage;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLink;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'input-group date']//button")
    WebElement datePicker;


    public String getProductText() {

        log.info("Get Product text " + productText.toString());
        return getTextFromElement(productText);
    }

    public void VerifyTheTextHPLP3065(String expectedMessage) {
        Assert.assertEquals(getProductText(), expectedMessage);
    }

    public void selectDeliveryDate(String day, String month, String year) {

        clickOnElement(datePicker);
        while (true) {
            String monthAndYear = getTextFromElement(monthAndYearText);
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(nextButton);
            }
        }
        List<WebElement> allDates = getListOfElements(dateList);
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(day)) {
                e.click();
                break;
            }
        }
    }

    public void clickOnAddToCartButton() {

        clickOnElement(addToCartButton);
        log.info("Click on Add to Cart button " + addToCartButton.toString());
    }

    public String getProductAddedSuccessMessage() {

        log.info("Get product added success message " + successMessage.toString());
        return getTextFromElement(successMessage);
    }

    public void verifyTheMessageSuccessYouHaveAddedHPLP3065ToYourShoppingCart(String expectedMessage) {
        Assert.assertTrue(getProductAddedSuccessMessage().contains(expectedMessage));
    }

    public void clickOnShoppingCartLinkIntoMessage() {

        clickOnElement(shoppingCartLink);
        log.info("Click on Shopping cart link into message " + shoppingCartLink.toString());
    }

    public void enterQuantity(String qty) {

        clearTextOnElement(qtyField);
        sendTextToElement(qtyField, qty);
        log.info(" Enter Quantity " + qtyField.toString());
    }

}
