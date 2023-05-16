package com.cucumber.steps;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
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
    public void verifyTheMacBookText(String arg0) {

    }

    @And("^click on Add to cart button$")
    public void clickOnAddToCartButton() {
    }

    @And("^verify the You have added MacBook to your shopping cart Success message \"([^\"]*)\"$")
    public void verifyTheYouHaveAddedMacBookToYourShoppingCartSuccessMessage(String arg0) {

    }

    @And("^click on link ShoppingCart display into success message$")
    public void clickOnLinkShoppingCartDisplayIntoSuccessMessage() {
    }

    @And("^verify the Shopping Cart text \"([^\"]*)\"$")
    public void verifyTheShoppingCartText(String arg0) {

    }

    @And("^verify the MacBook product name \"([^\"]*)\"$")
    public void verifyTheMacBookProductName(String arg0) {

    }

    @And("^change Quantity \"([^\"]*)\"$")
    public void changeQuantity(String arg0) {

    }

    @And("^click on Update tab$")
    public void clickOnUpdateTab() {
    }

    @And("^verify the You have modified your shopping cart success message \"([^\"]*)\"$")
    public void verifyTheYouHaveModifiedYourShoppingCartSuccessMessage(String arg0) {

    }

    @And("^verify the total \"([^\"]*)\"$")
    public void verifyTheTotal(String arg0) {

    }

    @And("^click on Checkout button$")
    public void clickOnCheckoutButton() {
    }

    @And("^verify the Checkout text \"([^\"]*)\"$")
    public void verifyTheCheckoutText(String arg0) {

    }

    @And("^verify the New Customer text \"([^\"]*)\"$")
    public void verifyTheNewCustomerText(String arg0) {

    }

    @And("^click on Guest Checkout radio button$")
    public void clickOnGuestCheckoutRadioButton() {
    }

    @And("^click on Continue tab$")
    public void clickOnContinueTab() {
    }

    @And("^fill the mandatory fields$")
    public void fillTheMandatoryFields() {
    }

    @And("^click on continue button$")
    public void clickOnContinueButton() {
    }

    @And("^add comments about your order into text area$")
    public void addCommentsAboutYourOrderIntoTextArea() {
    }

    @And("^check the Terms and Condition check box$")
    public void checkTheTermsAndConditionCheckBox() {
    }

    @And("^click on Continue$")
    public void clickOnContinue() {
    }

    @Then("^verify the  payment method required warning message \"([^\"]*)\"$")
    public void verifyThePaymentMethodRequiredWarningMessage(String arg0) {

    }
}
