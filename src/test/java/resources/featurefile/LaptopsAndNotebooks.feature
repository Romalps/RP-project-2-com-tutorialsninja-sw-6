Feature: Laptops and Notebooks Test
  As a User I want to place the order successfully on TutorialsNinja website

  @sanity @regression
  Scenario: verify products price display High To Low successfully
    Given I am on HomePage
    When select currency "£Pound Sterling"
    And I mouse hover on LaptopsAndNotebooks tab and click
    And I click on show all laptops and notebooks "Show AllLaptops & Notebooks"
    And select sort by "Price (High > Low)"
    Then verify the product price will arrange in High to Low order
  @smoke @regression
  Scenario: verify that user place order successfully
    Given I am on HomePage
    When I select currency "£Pound Sterling"
    And I mouse hover on LaptopsAndNotebooks tab and click
    And I click on show all laptops and notebooks "Show AllLaptops & Notebooks"
    And select sort by "Price (High > Low)"
    And select Product"MacBook"
    And verify the MacBook text "MacBook"
    And click on Add to cart button
    And verify the You have added MacBook to your shopping cart Success message "Success: You have added MacBook to your shopping cart!"
    And click on link ShoppingCart display into success message
    And verify the Shopping Cart text "Shopping Cart"
    And verify the MacBook product name "MacBook"
    And change Quantity "2"
    And click on Update tab
    And verify the You have modified your shopping cart success message "Success: You have modified your shopping cart!"
    And verify the total "£737.45"
    And click on Checkout button
    And verify the Checkout text "Checkout"
#    And verify the New Customer text "New Customer"
    And click on Guest Checkout radio button
    And click on Continue tab
    And fill the mandatory fields
    And click on continue button
    And add comments about your order into text area
    And check the Terms and Condition check box
    And click on Continue
    Then verify the  payment method required warning message "Warning: Payment method required!"
