@campaign
Feature: Sending email campaign
@sanity
Scenario: Create campaign
Given user should be at campaign page
When user click on create campaign button
And user enters information
Then campaign should get created

@regression
Scenario: Shedule campaign
Given user should be at campaign page
When user click on shedule campaign
And user enters a shedule time
Then campaign should get sheduled

@functional @sanity
Scenario: Validate set campaign
Given user should be at campaign page
When user click on send campaign
Then user should see the sent count of email