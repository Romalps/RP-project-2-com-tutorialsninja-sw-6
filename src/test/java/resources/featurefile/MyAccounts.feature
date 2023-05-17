Feature: MyAccounts test
  As a user I want to register on TutorialsNinja website

  @sanity @regression
  Scenario: verify user should navigate to Register page successfully
    Given I am on HomePage
    When I click on My Account Link
    And I call the method select MyAccount Options method and pass the parameter "Register"
    Then verify the Register Account text "Register Account"

  @smoke @regression
  Scenario: verify user should navigate to Login page successfully
    Given I am on HomePage
    When I click on My Account Link
    And I call the method select MyAccount Options method and pass the parameter "Login"
    Then verify the Login Text "Returning Customer"

  @regression
  Scenario Outline: verify that user Register Account successfully
    Given I am on HomePage
    And Click on My Account Link on homepage
    And Call the method select My Account Options method on homepage and pass the parameter "Register"
    And Enter First Name "<firstName>"
    And Enter Last Name "<lastName>"
    And Enter Email "<email>"
    And Enter Telephone "<telephone>"
    And Enter Password "<password>"
    And Enter Password Confirm "<confirmPassword>"
    And Select Subscribe Yes radio button "Yes"
    And Click on Privacy Policy check box
    And Click on Continue button
    Then Verify the message "Your Account Has Been Created!"
    When I Click on continue button on registered page
    And  I Click on My Account Link on registered page
    And I Call the method selectMyAccountOptions method and pass the parameters "Logout"
    Then Verify the text "Account Logout"
    And Click on Continue button on logout page

    Examples:
      | firstName | lastName | email                     | telephone   | password  | confirmPassword |
      | Prime     | Tester   | prime101tester1@gmail.com | 07154897455 | Prime101T | Prime101T       |

  @regression
  Scenario Outline: verify that user should Login and Logout successfully
    Given I am on HomePage
    When I click on My Account Link
    And Call the method selectMyAccountOptions method and pass the parameter "Login"
    And Enter Email address "<emailAddress>"
    And Enter Password to "<passwordField>"
    And Click on Login button
    Then Verify myAccount text "My Account"
    When Click on My Account Link
    And Call the method selectMyAccountOptions method and pass the parameter "Logout"
    Then Verify the account Logout text "Account Logout"
    And Click on Continue button on logout page

    Examples:
      | emailAddress              | passwordField |
      | prime1233@gmail.com       | test1234      |