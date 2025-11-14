Feature: Login Functionality
Scenario: login to application
Given I am at the login page
When I enter the credentials
And I click on login button
Then I should be able to login

Scenario: Verify title of login page
Given I am at the login page
Then User should be able to see title
