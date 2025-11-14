Feature: Login functionality validation with data
Scenario: Login with valid credentials
Given user should be at login page
When user enters username as "testuser"
And user enters username as "test@1234"
And user clicks on the Login 1.55 button
Then user should get logged into the application