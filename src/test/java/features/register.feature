Feature: Register a new user

Scenario Outline: Positive test validating register  //The words "Outline" and "Examples" are necessary when the test is parametrized
Given Initialize the browser
And Navigate to "http://www.qaclickacademy.com/" URL
And Click on Register button in home page to land on Register page
When User completes <fullname>, <email>, <password>, <confpass> and check terms
Then Verify that user is not successfully registered
And Close browsers in Login TC2


Examples: 
|fullname         |email              |password    |confpass    |
|Juan Usandivaras |email@mail.com     |pass1234    |pass1234    |
