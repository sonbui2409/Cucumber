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

Feature: Login Feature
  I want to use this template for my feature file


  Scenario: Login Valid Account
    Given I want to use "Firefox"
    And I want to login to page "http://demo.guru99.com/v4/"
    When I input username as "mngr340943"
    And I input password as "rUpyjEd"
    And I Click to login button
    Then I can see the home page

 