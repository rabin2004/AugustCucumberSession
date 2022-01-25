#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@Login @Release3.0
Feature: Login Funtionality
Registered user will be able to login into application providing valid credentials.

@Positive @End-to-End @Regression
Scenario: Positive login functionality test by clicking submit button
Given user loads application
When user enters valid username
And user enters valid password
And user click submit button
Then user should be able to login
And user should see login success message

@Positive @End-to-End @Regression
Scenario: Positive login functionality test by hitting Enter key
Given user loads application
When user enters valid username
And user enters valid password
And user hits Enter key
Then user should be able to login
And user should see login success message

@Negative @End-to-End @Regression
Scenario: Negative login functionality test using invalid username and invalid password
Given user loads application
When user enters invalid username
And user enters invalid password
And user click submit button
Then user should not be able to login
And user should see login error message

@Negative @End-to-End @Regression
Scenario: Negative login functionality test using invalid username and valid password
Given user loads application
When user enters invalid username
And user enters valid password
And user click submit button
Then user should not be able to login
And user should see login error message

@Negative @End-to-End @Regression
Scenario: Negative login functionality test using valid username and invalid password
Given user loads application
When user enters valid username
And user enters invalid password
And user click submit button
Then user should not be able to login
And user should see login error message

@Negative @End-to-End @Regression
Scenario: Negative login functionality test using blank username and blank password
Given user loads application
When user enters blank username
And user enters blank password
And user click submit button
Then user should not be able to login
And user should see login error message

