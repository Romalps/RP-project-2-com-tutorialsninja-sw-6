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

public class LaptopsAndNotebooksPage extends Utility {

    private static final Logger log = LogManager.getLogger(LaptopsAndNotebooksPage.class.getName());

    public LaptopsAndNotebooksPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement laptopsAndNotebooksText;
    By productsPrices = By.xpath("//p[@class ='price']");
    By productsList = By.xpath("//h4/a");
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortBy;

    public String getLaptopsAndNotebooksText() {

        log.info("Get Laptops and Notebooks text " + laptopsAndNotebooksText.toString());
        return getTextFromElement(laptopsAndNotebooksText);
    }

    public void verifyTheTextLaptopsAndNotebooks(String expectedMessage) {
        Assert.assertEquals(getLaptopsAndNotebooksText(), expectedMessage);
        log.info("Verify the text Laptops and Notebooks " + laptopsAndNotebooksText.toString());
    }

    public ArrayList<Double> getProductsPriceList() {

        List<WebElement> products = getListOfElements(productsPrices);
        ArrayList<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        return originalProductsPrice;
    }

    List<Double> originalProductPrice;
    ArrayList<Double> afterSortByPrice;
    // Get all the products price and stored into array list
    public void getAllTheProductsPriceAndStoredIntoArraylist(){
        originalProductPrice=getProductsPriceList();
    }
    public void afterFilterPriceHighToLowGetAllTheProductsNameAndStoredIntoArrayList(){
        Collections.sort(originalProductPrice,Collections.reverseOrder());
        afterSortByPrice=getProductsPriceList();
    }
    public void verifyTheProductWillArrangeInHighToLowPrice(){
        Assert.assertEquals(originalProductPrice,afterSortByPrice);
    }
    public void selectSortByOption(String option) {

        selectByVisibleTextFromDropDown(sortBy, option);
        log.info("Select sort by option " + sortBy.toString());
    }

    public void selectProductByName(String product) {

        List<WebElement> products = getListOfElements(productsList);
        for (WebElement e : products) {
            if (e.getText().equals(product)) {
                e.click();
                break;
            }
        }
    }


}
