Feature: Add to Cart Functionality test

Business Need: When we add to cart a product product should be added to cart

  Background:
    Given I am on the saucedemo login page


  Scenario:
    Given I input valid username and password
    When I click on login button
    Then I am able to login successfully and land on home page
    Then I click on add to cart for "Sauce Labs Onesie" on product home page
    When I click on Cart button
    Then Product "Sauce Labs Onesie" is in cart page