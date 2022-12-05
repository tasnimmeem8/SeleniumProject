Feature: Automated Leaftaps Application


@WIP
Scenario Outline:: TC001_Login and Logout

Given Launch chrome browser and load
Given enter username as <username>
Given enter password as <password>
When Click the login button
Then its navigated Homepage
Then Click the logout button
Then Close browser 

Examples:
         |username|password|
         |DemoSalesManager|crmsfa|
         |DemoCSR|crmsfa|


@Done
Scenario: TC002_Login and Logout Negative testing 

Given Launch Chrome browser and load
And  enter username as DemosSalesManager
And enter password as CRM
When Click the login button 
Then Then nevigated to same page
And Error message will shown 
But Check the error messag 
And Close browser

