Feature: Order information
Scenario: fetch currently placed order details
Given user is at orders page
When user click on order button
And user click on current order
Then user should see the current order info

Scenario: fetch previously placed order details
Given user is at orders page
When user click on order button
And user click on order history
Then user should see the previously placed order info

Scenario: fetch cancelled order details
Given user is at orders page
When user click on order button
And user click on cancelled order
Then user should see the cancelled order info