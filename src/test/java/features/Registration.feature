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

@Registration @Release1.0
Feature: Registration functionality
New user will be able to register to the applciation using the functionality.

## Data Driven Testing -> instead of Scenario us Scenario Outline
@Positive @End-to-End @Regression
Scenario Outline: Positive registration functionality test
Given user is in registration page
When user enters "<username>", "<password>" and "<confirmPassword>"
And user click submit button
Then user should be able to register
And should be able to see registration success message

Examples: 
|username|password|confirmPassword|
|tom12|t12|t12|
|david12|d12|d12|
|edward12|e12|e12|

@Negative @Smoke @Regression
Scenario Outline: Negative registration functionality test with no confirm password
Given user is in registration page
When user enters "<username>", "<password>" but no confirmPassword
And user click submit button
Then user should not be able to register
And should see error message

Examples: 
|username|password|
|tom12|t12|
|david12|d12|
|edward12|e12|

@Negative @Smoke @Regression
Scenario Outline: Negative registration functionality test with no username
Given user is in registration page
When user enters no username but enters "<password>" and "<confirmPassword>"
And user click submit button
Then user should not be able to register
And should see error message

Examples: 
|password|confirmPassword|
|t12|t12|
|d12|d12|
|e12|e12|

