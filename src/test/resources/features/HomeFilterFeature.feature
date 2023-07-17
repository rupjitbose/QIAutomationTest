Feature: Filter Functionality test

Business Need: When we apply different types of filter conditions the page items should get sorted in that order.

Background:
  Given I am on the saucedemo login page


Scenario:
  Given I input valid username and password
  When I click on login button
  Then I am able to login successfully and land on home page
  And I able to navigate to the filter on the page
  When I select "Price (low to high)" on the filter
  Then Page items are sorted in the "Price (low to high)" order successfully

  Scenario Outline:
    Given I input valid username and password
    When I click on login button
    Then I am able to login successfully and land on home page
    And I able to navigate to the filter on the page
    When I select "<FilterType>" on the filter
    Then Page items are sorted in the "<FilterType>" order successfully
Examples:
  | FilterType          |
  | Name (A to Z)       |
  | Name (Z to A)       |
  | Price (high to low) |





