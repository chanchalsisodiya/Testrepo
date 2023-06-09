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
@tag
Feature: Verify login functionality

Background: User navigates to Swaglabs
Given User launch site URL



@Test
Scenario Outline: Verify unsuccessful login when username and password is incorrect
When user enter correct "<username>" and correct "<password>"
And click on login button

Examples:

|username|password|
|automation|testing|
|Test|Automation|
