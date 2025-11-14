Feature: Sign up functionality
Background:
Given user is at application home page

Scenario Outline: sign up to the application
Given user is at sign up page
When user enters name as "<name>" on the form
And user select gender as "<gender>"
And user select slotnumber as <slotnumber>
Then user gets created

Examples:
| name | gender | slotnumber |
| ram  | male   |     1      |
| prem | male   |     2      |
| jyoti | female |    3      |
| karan | male  |     4      |