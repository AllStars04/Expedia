@homepage
Feature: As a user I want to go to the homepage
  So that i can see all the deals and options available there

  Scenario: Opening homepage
    Given I have open the browser
    When I enter the web address of the website
    Then I am able to see the homepage


  Scenario: Opening of hotel search page
    Given I am on homepage
    When I go to the hotel option
    Then I successfully navigate to hotel search page


  Scenario: Opening of Flight search page
    Given I am on homepage
    When I go to the hotel option
    Then I successfully navigate to Flight search page


  Scenario: Opening of Flight and Hotel search page
    Given I am on homepage
    When I go to the hotel option
    Then I successfully navigate to Flight and Hotel package search page


  Scenario: Opening of Car search page
    Given I am on homepage
    When I go to the hotel option
    Then I successfully navigate to Car search page


  Scenario: Opening of Deal search page
    Given I am on homepage
    When I go to the hotel option
    Then I successfully navigate to Deal search page