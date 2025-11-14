Feature: Placing order validation
Scenario: Oerder Confirmation
Given I should be at the product page
When I click on add to cart button
Then product should get add to cart
When I click on the place order button
Then order should get placed