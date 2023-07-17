Feature: When We checkout from cart we should be on checkout pages

Business Need: When we add to cart a product product should be added to cart and when We checkout we should get to checkout page

  Background:
    Given I am on the saucedemo login page


  Scenario:
    Given I input valid username and password
    When I click on login button
    Then I am able to login successfully and land on home page
    Then I click on add to cart for "Sauce Labs Onesie" on product home page
    When I click on Cart button
    Then Product "Sauce Labs Onesie" is in cart page
    When I click on checkout
    Then We should be on the Checkout page