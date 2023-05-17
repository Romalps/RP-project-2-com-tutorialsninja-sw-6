Feature: Desktops Test
  As a user I want to add product to shopping cart on TutorialsNinja website

  @sanity @regression
  Scenario: verify product arrange in alphabetical order
    Given I am on HomePage
    When I select currency "£Pound Sterling"
    And I Mouse hover on desktops Tab and click
    And click on "Show AllDesktops"
    And I select Sort by Name Z to A position "Name (Z - A)"
    Then verify the product will arrange in Descending order

  @smoke @regression
  Scenario: verify product added to shopping cart successfully
    Given I am on HomePage
    When I select currency "£Pound Sterling"
    And I Mouse hover on Desktops Tab and click
    And click on "Show AllDesktops"
    And I select sortby position "Name (A - Z)"
    And I select product "HP LP3065"
    And verify the HPLPtext "HP LP3065"
    And select delivery date "2022-11-30"
    And I enter Qty "1" using Select class
    And I click on Add to Cart button
#      And verify the you have added HPLP to your shoppingCart success message "Success: You have added HP LP3065 to your shopping cart!"
    And click on link Shopping cart link display into success message
    And verify the ShoppingCart text "Shopping Cart"
    And verify the HPLP product name "HP LP3065"
    And verify the Delivery date "2023-11-30"
    And verify the Product model "Product 21"
    Then verify the Total "£74.73"


