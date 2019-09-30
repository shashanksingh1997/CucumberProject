@FunctionalTest
Feature: TestMeApp

  @tag1
  Scenario Outline: Login
    Given TestMeApp home page
    When Enter the "<username1>" and "<password1>"
    Then click on login for successful login

    Examples: 
      | username1    | password1 |
      | shashank4000 |   1234567 |
      | shashank4001 |   1234567 |
