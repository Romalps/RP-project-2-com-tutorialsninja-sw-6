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

public class ComponentPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComponentPage.class.getName());

    public ComponentPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement componentsText;

    public String getComponentsText() {
        log.info("Get Components Text " + componentsText.toString());
        return getTextFromElement(componentsText);
    }

    public void verifyTheTextComponents(String expectedMessage) {

        Assert.assertEquals(getComponentsText(), expectedMessage);
        log.info("Verify the text Components " + componentsText.toString());
    }
}
