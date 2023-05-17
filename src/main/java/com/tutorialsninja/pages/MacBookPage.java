package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MacBookPage extends Utility {

    private static final Logger log = LogManager.getLogger(MacBookPage.class.getName());

    public MacBookPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'MacBook')]")
    WebElement macBookText;
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement macBookAddToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement macBookSuccessMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartLink;

    //2.5 Verify the text “MacBook”
    public void verifyTheTextMacBook(String expectedMessage) {

        Assert.assertEquals(getTextFromElement(macBookText), expectedMessage);
    }

    //2.6 Click on ‘Add To Cart’ button
    public void clickOnAddToCartButton() {
        clickOnElement(macBookAddToCartButton);
        log.info("Click on Add to cart button " + macBookAddToCartButton.toString());
    }

    //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
    public void verifyYouHaveAddedMacBookToYourShoppingCartSuccessMessage(String expectedMessage) {
        Assert.assertTrue(getTextFromElement(macBookSuccessMessage).contains(expectedMessage));
    }

    //2.8 Click on link “shopping cart” display into success message
    public void clickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        clickOnElement(shoppingCartLink);
        log.info("Click on link shopping cart display into success message " + shoppingCartLink);
    }

}
