@TestMeAPP
Feature: Login functionality

  @SmokeTesting
  Scenario: Login functionality with valid credentials
    Given User is on homepage
    When User enters username and password
    Then User loged in successful
    