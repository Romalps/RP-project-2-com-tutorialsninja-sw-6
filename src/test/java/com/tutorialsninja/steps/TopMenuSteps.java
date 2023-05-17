package com.tutorialsninja.steps;

import com.tutorialsninja.pages.ComponentPage;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TopMenuSteps {
    @Given("^I am on HomePage$")
    public void iAmOnHomePage() {

    }

    @When("^I Mouse hover on Desktops Tab and click$")
    public void iMouseHoverOnDesktopsTabAndClick() {
        new HomePage().mouseHoverOnDesktopsLinkAndClick();
    }

    @And("^I call selectMenu method and pass the menu = \"([^\"]*)\"$")
    public void iCallSelectMenuMethodAndPassTheMenu(String menu) {
        new HomePage().selectMenu(menu);

    }

    @Then("^verify the Desktop text \"([^\"]*)\"$")
    public void verifyTheDesktopText(String expectedMessage) {
        new DesktopPage().verifyTheTextDesktops(expectedMessage);
    }

    @When("^I mouse hover on Laptops and Notebooks tab and click$")
    public void iMouseHoverOnLaptopsAndNotebooksTabAndClick() {
        new HomePage().mouseHoverOnLaptopsAndNotebooksLinkAndClick();
    }

    @And("^I call selectmenu method and pass the menu = \"([^\"]*)\"$")
    public void iCallSelectmenuMethodAndPassTheMenu(String menu) {
        new HomePage().selectMenu(menu);
    }


    @Then("^verify the  Laptops and Notebooks text \"([^\"]*)\"$")
    public void verifyTheLaptopsAndNotebooksText(String expectedMessage) {
        new LaptopsAndNotebooksPage().verifyTheTextLaptopsAndNotebooks(expectedMessage);

    }


    @When("^I mose hover on Components tab and click$")
    public void iMoseHoverOnComponentsTabAndClick() {
        new HomePage().mouseHoverOnComponentLinkAndClick();
    }

    @And("^call select menu method and pass the menu = \"([^\"]*)\"$")
    public void callSelectMenuMethodAndPassTheMenu(String menu)  {
       new HomePage().selectMenu(menu);
    }

    @Then("^verify the Components text \"([^\"]*)\"$")
    public void verifyTheComponentsText(String expectedMessage)  {
       new ComponentPage().verifyTheTextComponents(expectedMessage);
    }
}
