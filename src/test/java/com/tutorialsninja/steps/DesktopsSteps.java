package com.cucumber.steps;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ProductPage;
import com.tutorialsninja.pages.ShoppingPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DesktopsSteps {
    @When("^I select currency \"([^\"]*)\"$")
    public void iSelectCurrency(String currency) {
        new HomePage().selectCurrency(currency);
    }

    @And("^I Mouse hover on desktops Tab and click$")
    public void iMouseHoverOnDesktopsTabAndClick() {
        new HomePage().mouseHoverOnDesktopsLinkAndClick();
    }

    @And("^click on \"([^\"]*)\"$")
    public void clickOn(String menu) {
        new HomePage().selectMenu(menu);
    }

    @And("^I select Sort by Name Z to A position \"([^\"]*)\"$")
    public void iSelectSortByNameZToAPosition(String sortBy) {
        new DesktopPage().selectSortByOption(sortBy);
    }

    @Then("^verify the product will arrange in Descending order$")
    public void verifyTheProductWillArrangeInDescendingOrder() {
        new DesktopPage().verifyTheProductWillArrangeInDescendingOrder();

    }


    @And("^I select sortby position \"([^\"]*)\"$")
    public void iSelectSortbyPosition(String sortBy) {
        new DesktopPage().selectSortByOption(sortBy);
    }

    @And("^I select product \"([^\"]*)\"$")
    public void iSelectProduct(String productName) {
        new DesktopPage().selectProductByName(productName);
    }

    @And("^verify the HPLPtext \"([^\"]*)\"$")
    public void verifyTheHPLPText(String expectedMessage) {
        new ProductPage().VerifyTheTextHPLP3065(expectedMessage);
    }

    @And("^select delivery date \"([^\"]*)\"$")
    public void selectDeliveryDate(String deliveryDate) {
        new ProductPage().selectDeliveryDate("30", "November", "2022");
    }

    @And("^I enter Qty \"([^\"]*)\" using Select class$")
    public void iEnterQtyUsingSelectClass(String qty) {
        new ProductPage().enterQuantity(qty);
    }

    @And("^I click on Add to Cart button$")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCartButton();

    }

//    @And("^verify the you have added HPLP to your shoppingCart success message \"([^\"]*)\"$")
//    public void verifyTheYouHaveAddedHPLPToYourShoppingCartSuccessMessage(String expectedMessage) {
//        new ProductPage().verifyTheMessageSuccessYouHaveAddedHPLP3065ToYourShoppingCart(expectedMessage);
//    }

    @And("^click on link Shopping cart link display into success message$")
    public void clickOnLinkShoppingCartLinkDisplayIntoSuccessMessage() {
        new ProductPage().clickOnShoppingCartLinkIntoMessage();
    }

    @And("^verify the ShoppingCart text \"([^\"]*)\"$")
    public void verifyTheShoppingCartText(String expectedMessage) {
        new ShoppingPage().verifyTheTextShoppingCart(expectedMessage);
    }

    @And("^verify the HPLP product name \"([^\"]*)\"$")
    public void verifyTheHPLPProductName(String expectedMessage) {
        new ShoppingPage().verifyTheProductNameHPLP3065(expectedMessage);
    }

    @And("^verify the Delivery date \"([^\"]*)\"$")
    public void verifyTheDeliveryDate(String expectedMessage) {
        new ShoppingPage().verifyTheDeliveryDate(expectedMessage);
    }

    @And("^verify the Product model \"([^\"]*)\"$")
    public void verifyTheProductModel(String expectedMessage) {
        new ShoppingPage().verifyTheModelProduct21(expectedMessage);
    }

    @Then("^verify the Total \"([^\"]*)\"$")
    public void verifyTheTotal(String expectedMessage) {
        new ShoppingPage().verifyTheTotal(expectedMessage);
    }
}
