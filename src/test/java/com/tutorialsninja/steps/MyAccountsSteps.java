package com.tutorialsninja.steps;

import com.tutorialsninja.pages.AccountLoginPage;
import com.tutorialsninja.pages.AccountRegisterPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.MyAccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyAccountsSteps {
    @When("^I click on My Account Link$")
    public void iClickOnMyAccountLink() {
        new HomePage().clickOnMyQAccountTab();

    }

    @And("^I call the method select MyAccount Options method and pass the parameter \"([^\"]*)\"$")
    public void iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameter(String option) {
        new HomePage().selectMyAccountOptions(option);
    }

    @Then("^verify the Register Account text \"([^\"]*)\"$")
    public void verifyTheRegisterAccountText(String expectedMessage) {
        new AccountRegisterPage().verifyTheTextRegisterAccount(expectedMessage);
    }

    @Then("^verify the Login Text \"([^\"]*)\"$")
    public void verifyTheLoginText(String expectedMessage) {
        new AccountLoginPage().verifyTheTextReturningCustomer(expectedMessage);
    }

    @And("^Click on My Account Link$")
    public void clickOnMyAccountLink() {
        new HomePage().clickOnMyQAccountTab();
    }

    @And("^Call the method selectMyAccountOptions method and pass the parameter \"([^\"]*)\"$")
    public void callTheMethodSelectMyAccountOptionsMethodAndPassTheParameter(String option) {
        new HomePage().selectMyAccountOptions(option);
    }
    @And("^Click on My Account Link on homepage$")
    public void clickOnMyAccountLinkOnHomepage() {
        new HomePage().clickOnMyQAccountTab();
    }


    @And("^Call the method select My Account Options method on homepage and pass the parameter \"([^\"]*)\"$")
    public void callTheMethodSelectMyAccountOptionsMethodOnHomepageAndPassTheParameter(String option) {
        new HomePage().selectMyAccountOptions(option);
    }
    @And("^Enter First Name \"([^\"]*)\"$")
    public void enterFirstName(String firstName) {
        new AccountRegisterPage().enterFirstName(firstName);
    }

    @And("^Enter Last Name \"([^\"]*)\"$")
    public void enterLastName(String lastName) {
        new AccountRegisterPage().enterLastName(lastName);
    }

    @And("^Enter Email \"([^\"]*)\"$")
    public void enterEmail(String email) {
        new AccountRegisterPage().enterEmail(email);
    }

    @And("^Enter Telephone \"([^\"]*)\"$")
    public void enterTelephone(String telephone) {
        new AccountRegisterPage().enterTelephone(telephone);
    }

    @And("^Enter Password \"([^\"]*)\"$")
    public void enterPassword(String password) {
        new AccountRegisterPage().enterPassword(password);
    }

    @And("^Enter Password Confirm \"([^\"]*)\"$")
    public void enterPasswordConfirm(String password) {
        new AccountRegisterPage().enterConfirmPassword(password);
    }

    @And("^Select Subscribe Yes radio button \"([^\"]*)\"$")
    public void selectSubscribeYesRadioButton(String option) {
        new AccountRegisterPage().selectSubscription(option);
    }

    @And("^Click on Privacy Policy check box$")
    public void clickOnPrivacyPolicyCheckBox() {
        new AccountRegisterPage().clickOnPrivacyPolicyCheckBox();
    }

    @And("^Click on Continue button$")
    public void clickOnContinueButton() {
        new AccountRegisterPage().clickOnContinueButton();
    }

    @Then("^Verify the message \"([^\"]*)\"$")
    public void verifyTheMessage(String expectedMessage) {
        new AccountRegisterPage().verifyTheMessageYourAccountHasBeenCreated(expectedMessage);
    }

    @When("^I Click on continue button on registered page$")
    public void iClickOnContinueButtonOnRegisteredPage() {
        new AccountRegisterPage().clickOnContinueOnRegisteredSuccessPage();
    }

    @And("^I Click on My Account Link on registered page$")
    public void iClickOnMyAccountLinkOnRegisteredPage() {
        new HomePage().clickOnMyQAccountTab();
    }

    @And("^I Call the method selectMyAccountOptions method and pass the parameters \"([^\"]*)\"$")
    public void iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameters(String option) {
        new HomePage().selectMyAccountOptions(option);
    }

    @Then("^Verify the text \"([^\"]*)\"$")
    public void verifyTheText(String expectedMessage) {
        new AccountRegisterPage().verifyTheTextAccountLogout(expectedMessage);
    }

    @And("^Click on Continue button on logout page$")
    public void clickOnContinueButtonOnLogoutPage() {
        new AccountRegisterPage().clickOnContinue();
    }

    @And("^Enter Email address \"([^\"]*)\"$")
    public void enterEmailAddress(String email)  {
new AccountLoginPage().enterEmailAddress(email);
    }

    @And("^Enter Password to \"([^\"]*)\"$")
    public void enterPasswordTo(String password)  {
new AccountLoginPage().enterPassword(password);
    }


    @And("^Click on Login button$")
    public void clickOnLoginButton() {
    new AccountLoginPage().clickOnLoginButton();
    }

    @Then("^Verify myAccount text \"([^\"]*)\"$")
    public void verifyMyAccountText(String expectedMessage)  {
new AccountLoginPage().verifyTextMyAccount(expectedMessage);
    }

    @Then("^Verify the account Logout text \"([^\"]*)\"$")
    public void verifyTheAccountLogoutText(String expectedMessage)  {
new MyAccountPage().verifyTheTextAccountLogout(expectedMessage);
    }


}
