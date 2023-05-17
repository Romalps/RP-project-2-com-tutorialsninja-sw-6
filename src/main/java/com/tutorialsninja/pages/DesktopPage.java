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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Desktops']")
    WebElement desktopsText;

    By productsList = By.xpath("//h4/a");
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortBy;


    public String getDesktopsText() {

        log.info("Get Desktop Text " + desktopsText.toString());
        return getTextFromElement(desktopsText);
    }

    public void verifyTheTextDesktops(String expectedMessage) {
        Assert.assertEquals(getDesktopsText(), expectedMessage);
        log.info("Verify the text Desktops " + desktopsText.toString());
    }

    public ArrayList<String> getProductsNameList() {

        List<WebElement> products = getListOfElements(productsList);
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        return originalProductsName;
    }

    ArrayList<String> originalProductName;
    ArrayList<String> afterSortedByZtoAProductName;

    // Get all the products name and stored into array list
    public void getAllProductNameAndStoredIntoArrayList() {
        originalProductName = getProductsNameList();
    }

    public void afterFilterZtoAGetAllTheProductNameAndStoredIntoArrayList() {
        // Sort By Reverse order
        Collections.reverse(originalProductName);
        // After filter Z -A Get all the products name and stored into array list
        afterSortedByZtoAProductName = getProductsNameList();
    }

    public void verifyTheProductWillArrangeInDescendingOrder() {

//        ArrayList<String > originalProductName = getProductsNameList();

//        Collections.reverse(originalProductName);

//        ArrayList<String> afterSortByZToAProductName = getProductsNameList();
        Assert.assertEquals(originalProductName, afterSortedByZtoAProductName);
   }

        public void selectProductByName (String product){

            List<WebElement> products = getListOfElements(productsList);
            for (WebElement e : products) {
                if (e.getText().equals(product)) {
                    e.click();
                    break;
                }
            }
        }

        public void selectSortByOption (String option){

            selectByVisibleTextFromDropDown(sortBy, option);
            log.info("Select sort by option " + sortBy.toString());
        }

    }
