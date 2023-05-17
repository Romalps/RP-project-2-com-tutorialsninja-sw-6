package com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    By topMenu = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
    WebElement laptopsAndNotebooksLink;
    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement componentsLinks;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Currency']")
    WebElement currencyTab;
    By currencyList = By.xpath("//ul[@class='dropdown-menu']/li");

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountTab;

    By myAccountOptions = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");


    public void selectMenu(String menu) {

        List<WebElement> topMenuList = getListOfElements(topMenu);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(topMenu);
        }
    }

    public void mouseHoverOnDesktopsLinkAndClick() {

        mouseHoverToElementAndClick(desktopLink);
        log.info("Mouse Hover on Desktops link and click " + desktopLink.toString());
    }

    public void mouseHoverOnLaptopsAndNotebooksLinkAndClick() {

        mouseHoverToElementAndClick(laptopsAndNotebooksLink);
        log.info("Mouse Hover on Laptops and Notebooks link and click " + laptopsAndNotebooksLink.toString());
    }

    public void mouseHoverOnComponentLinkAndClick() {

        mouseHoverToElementAndClick(componentsLinks);
        log.info("Mouse Hover on Component link and click " + componentsLinks.toString());
    }

    public void selectCurrency(String currency) {

        clickOnElement(currencyTab);
        List<WebElement> listOfElements = getListOfElements(currencyList);
        for (WebElement e : listOfElements) {
            if (e.getText().equalsIgnoreCase(currency)) {
                e.click();
                break;
            }
        }
    }

    public void clickOnMyQAccountTab() {

        clickOnElement(myAccountTab);
        log.info("Click on My Account tab " + myAccountTab.toString());
    }

    public void selectMyAccountOptions(String option) {

        List<WebElement> myAccountList = getListOfElements(myAccountOptions);
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(myAccountOptions);
        }
    }

}
