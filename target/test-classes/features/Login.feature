Feature: Application login 
Scenario: Home page login
Given User is on netbanking landing page
When User login into application with username "sathish" and password "789456"
Then Home page is displayed
And cards are displayed "true"

Scenario: Home page login
Given User is on netbanking landing page
When User login into application with username "santhosh" and password "123456"
Then Home page is displayed
And cards are displayed "false"

Scenario: Home page login
Given User is on netbanking landing page
When User login into application with username " " and password " "
Then Home page is displayed
And cards are displayed "false"

Scenario: Home page login
Given User is on netbanking landing page
When User login into application with username "invalid_data" and password "invalid_data"
Then Home page is displayed
And cards are displayed "false"

Scenario: Edit profile validation or functionality
Given On header click on profile
When Select profile option
Then System should navigate to edit profile page
And User can able to see the profile edit fields like name DOB and location with save button


