Feature: Opening bank account

Scenario: Opening bank account with nominee
Given user is at accounts page
When user enters the following data
| firstname | lastname | email | phone |
| Erin | Smith | erin.smith@gmail.com | 9988776655 |
| Robert | Jackson | robert.jackson@gmail.com | 987654320 |
And user clicks on submit button
Then user should get confirmation
