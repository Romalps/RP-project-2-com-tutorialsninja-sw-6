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

public class ShoppingPage extends Utility {

    private static final Logger log = LogManager.getLogger(ShoppingPage.class.getName());

    public ShoppingPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement deliveryDate;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement model;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement total;
    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")

    WebElement qtyField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")

    WebElement qtyUpdateBtn;
    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement successModifiedMessage;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement macBookText;
    @CacheLookup
    @FindBy(css = "input[value='1']")
    WebElement macBookQty;
    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-refresh']")
    WebElement updateTab;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement modifiedSuccessMessage;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement macBookTotalPrice;
    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement checkoutButton;

    public String getShoppingCartText() {

        log.info("Get Shopping cart text " + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public void verifyTheTextShoppingCart(String expectedMessage) {
        Assert.assertTrue(getShoppingCartText().contains(expectedMessage));
    }

    public String getProductName() {

        log.info("Get Product name " + productName.toString());
        return getTextFromElement(productName);
    }

    public void verifyTheProductNameHPLP3065(String expectedMessage) {
        Assert.assertEquals(getProductName(), expectedMessage);
    }

    public String getDeliveryDate() {

        log.info("Get Delivery date " + deliveryDate.toString());
        return getTextFromElement(deliveryDate);
    }

    public void verifyTheDeliveryDate(String expectedMessage) {
        Assert.assertTrue(getDeliveryDate().contains(expectedMessage));
    }

    public String getModel() {

        log.info("Get model " + model.toString());
        return getTextFromElement(model);
    }

    public void verifyTheModelProduct21(String expectedMessage) {
        Assert.assertEquals(getModel(), expectedMessage);
    }

    public String getTotal() {

        log.info("Get total " + total.toString());
        return getTextFromElement(total);
    }

    public void verifyTheTotal(String expectedMessage) {
        Assert.assertEquals(getTotal(), expectedMessage);
    }

    public void changeQuantity(String qty) {

        sendTextToElement(qtyField, qty);
        log.info("Change quantity " + qtyField.toString());
    }

    public void clickOnQtyUpdateButton() {

        clickOnElement(qtyUpdateBtn);
        log.info(" Click on qty update button " + qtyUpdateBtn.toString());
    }

    public String getSuccessModifiedMessage() {

        log.info("Get success modified message " + successModifiedMessage.toString());
        return getTextFromElement(successModifiedMessage);
    }

    //2.10 Verify the Product name "MacBook"
    public void verifyTheProductNameMacBook(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(macBookText), expectedMessage);
    }

    //2.11 Change Quantity "2"
    public void changeMacBookQtyTo2(String qty) {
        macBookQty.clear();
        sendTextToElement(macBookQty, qty);
        log.info("Change quantity to 2 " + macBookQty.toString());
    }

    //2.12 Click on “Update” Tab
    public void clickOnUpdateTab() {
        clickOnElement(updateTab);
        log.info("Click on Update tab " + updateTab.toString());
    }

    //2.13 Verify the message “Success: You have modified your shopping cart!”
    public void verifyYouHaveModifiedYourShoppingCartSuccessMessage(String expectedMessage) {
        Assert.assertTrue(getTextFromElement(modifiedSuccessMessage).contains(expectedMessage));
    }

    //2.14 Verify the Total £737.45
    public void verifyTheTotal737_45(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(macBookTotalPrice), expectedMessage);
    }

    //2.15 Click on “Checkout” button
    public void clickOnCheckoutButton() {
        clickOnElement(checkoutButton);
        log.info("Click on checkout button " + checkoutButton.toString());
    }
}
