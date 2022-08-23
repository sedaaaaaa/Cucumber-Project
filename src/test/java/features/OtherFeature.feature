Feature: Validate Techfios login functionality



Background:
Given User is on techfios login page
@OtherScenario1
Scenario: Login with valid credentials
When User enters username as "demo@techfios.com"
When User enters password as "abc123"
When User clicks on signin button 
Then User should land on dashboard page

@OtherScenario2
Scenario: Login with incorrect username
When User enters username as "demo2@techfios.com"
When User enters password as "abc123"
When User clicks on signin button
Then User should not land on dashboard page