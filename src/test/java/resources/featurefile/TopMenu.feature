Feature: TopMenu Test
  As a user I want to navigate to different Menu page on TutorialsNinja website
@sanity @regression
  Scenario: verify user should navigate to Desktop Page successfully
    Given I am on HomePage
    When I Mouse hover on Desktops Tab and click
    And I call selectMenu method and pass the menu = "Show AllDesktops"
    Then verify the Desktop text "Desktops"

@smoke @regression
  Scenario: verify user should navigate to Laptop and Notebooks page successfully
    Given I am on HomePage
    When I mouse hover on Laptops and Notebooks tab and click
    And I call selectmenu method and pass the menu = "Show AllLaptops & Notebooks"
    Then verify the  Laptops and Notebooks text "Laptops & Notebooks"
  @regression
  Scenario: verify user should navigate to Components page successfully
    Given I am on HomePage
    When I mose hover on Components tab and click
    And call select menu method and pass the menu = "Show AllComponents"
    Then verify the Components text "Components"