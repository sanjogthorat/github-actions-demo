Feature: Manage Profile Functionality
Background:
Given I have logged into application
And I am at home page

Scenario: Addition of profile
When I click on Add button
And I enter the data
Then Profile should get added

Scenario: Updation of profile
When I click on Edit button
And I update the data
Then Profile should get updated

Scenario: Deletion of profile
When I click on Delete button
Then Profile should get deleted