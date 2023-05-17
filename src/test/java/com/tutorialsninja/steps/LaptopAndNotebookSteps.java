package com.tutorialsninja.steps;

import com.tutorialsninja.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LaptopAndNotebookSteps {
    @When("^select currency \"([^\"]*)\"$")
    public void selectCurrency(String currency) {
        new HomePage().selectCurrency(currency);
    }

    @And("^I mouse hover on LaptopsAndNotebooks tab and click$")
    public void iMouseHoverOnLaptopsAndNotebooksTabAndClick() {
        new HomePage().mouseHoverOnLaptopsAndNotebooksLinkAndClick();
    }

    @And("^I click on show all laptops and notebooks \"([^\"]*)\"$")
    public void iClickOnShowAllLaptopsAndNotebooks(String menu) {
        new HomePage().selectMenu(menu);
    }

    @And("^select sort by \"([^\"]*)\"$")
    public void selectSortBy(String sortBy) {
        new LaptopsAndNotebooksPage().selectSortByOption(sortBy);
    }

    @Then("^verify the product price will arrange in High to Low order$")
    public void verifyTheProductPriceWillArrangeInHighToLowOrder() {
        new LaptopsAndNotebooksPage().verifyTheProductWillArrangeInHighToLowPrice();
    }

    @And("^select Product\"([^\"]*)\"$")
    public void selectProduct(String productName) {
        new LaptopsAndNotebooksPage().selectProductByName(productName);
    }

    @And("^verify the MacBook text \"([^\"]*)\"$")
    public void verifyTheMacBookText(String expectedMessage) {
        new MacBookPage().verifyTheTextMacBook(expectedMessage);
    }

    @And("^click on Add to cart button$")
    public void clickOnAddToCartButton() {
        new MacBookPage().clickOnAddToCartButton();
    }

    @And("^verify the You have added MacBook to your shopping cart Success message \"([^\"]*)\"$")
    public void verifyTheYouHaveAddedMacBookToYourShoppingCartSuccessMessage(String expectedMessage) {
        new MacBookPage().verifyYouHaveAddedMacBookToYourShoppingCartSuccessMessage(expectedMessage);
    }

    @And("^click on link ShoppingCart display into success message$")
    public void clickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new MacBookPage().clickOnLinkShoppingCartDisplayIntoSuccessMessage();
    }

    @And("^verify the Shopping Cart text \"([^\"]*)\"$")
    public void verifyTheShoppingCartText(String expectedMessage) {
        new ShoppingPage().verifyTheTextShoppingCart(expectedMessage);
    }

    @And("^verify the MacBook product name \"([^\"]*)\"$")
    public void verifyTheMacBookProductName(String expectedMessage) {
        new ShoppingPage().verifyTheProductNameMacBook(expectedMessage);
    }

    @And("^change Quantity \"([^\"]*)\"$")
    public void changeQuantity(String qty) {
        new ShoppingPage().changeMacBookQtyTo2(qty);
    }

    @And("^click on Update tab$")
    public void clickOnUpdateTab() {
        new ShoppingPage().clickOnUpdateTab();
    }

    @And("^verify the You have modified your shopping cart success message \"([^\"]*)\"$")
    public void verifyTheYouHaveModifiedYourShoppingCartSuccessMessage(String expectedMessage) {
        new ShoppingPage().verifyYouHaveModifiedYourShoppingCartSuccessMessage(expectedMessage);
    }

    @And("^verify the total \"([^\"]*)\"$")
    public void verifyTheTotal(String expectedMessage) {
        new ShoppingPage().verifyTheTotal737_45(expectedMessage);
    }

    @And("^click on Checkout button$")
    public void clickOnCheckoutButton() {
        new ShoppingPage().clickOnCheckoutButton();
    }

    @And("^verify the Checkout text \"([^\"]*)\"$")
    public void verifyTheCheckoutText(String expectedMessage) {
        new CheckoutPage().verifyTheTextCheckout(expectedMessage);
    }

//    @And("^verify the New Customer text \"([^\"]*)\"$")
//    public void verifyTheNewCustomerText(String expectedMessage) {
//        new CheckoutPage().verifyTheTextNewCustomer(expectedMessage);
//    }

    @And("^click on Guest Checkout radio button$")
    public void clickOnGuestCheckoutRadioButton() {
        new CheckoutPage().clickOnGuestCheckoutRadioButton();
    }

    @And("^click on Continue tab$")
    public void clickOnContinueTab() {
        new CheckoutPage().clickOnContinueTab();
    }

    @And("^fill the mandatory fields$")
    public void fillTheMandatoryFields() {
        new CheckoutPage().fillTheMandatoryFields();
    }

    @And("^click on continue button$")
    public void clickOnContinueButton() {
        new CheckoutPage().clickOnContinueButton();
    }

    @And("^add comments about your order into text area$")
    public void addCommentsAboutYourOrderIntoTextArea() {
        new CheckoutPage().addCommentsAboutYourOrderIntoTextArea();
    }

    @And("^check the Terms and Condition check box$")
    public void checkTheTermsAndConditionCheckBox() {
        new CheckoutPage().checkTheTermsAndConditionsCheckbox();
    }

    @And("^click on Continue$")
    public void clickOnContinue() {
        new CheckoutPage().clickOnContinue();
    }

    @Then("^verify the  payment method required warning message \"([^\"]*)\"$")
    public void verifyThePaymentMethodRequiredWarningMessage(String expectedMessage) {
        new CheckoutPage().verifyTheWarningPaymentMethodRequiredMessage(expectedMessage);
    }
}
