Feature: Login into Application

Scenario Outline: Positive test validating login  //The words "Outline" and "Example" are necessary when the test is parametrized
Given Initialize the browser with chrome
And Navigate to "http://www.qaclickacademy.com/" Site
And Click on Login link in home page to land on Secure Sign in page
When User enters <username> and <password> and logs in
Then Verify that user is successfully logged in
And Close browsers in Login TC1


Examples: 
|username              |password    |
|test99@gmail.com      |123456      |
|test123@gmail.com     |1234        |