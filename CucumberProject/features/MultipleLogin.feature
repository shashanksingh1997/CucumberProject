@FunctionalTest
Feature: To test multiple login functionality

  @SmokeTest
  Scenario Outline: Tst multiple login functionality on DemoWebShop
    Given User is on DemoWebShop Page
    When User enters "<username>" and "<password>"
    Then Display message Logged in successfully

    Examples: 
      | username  | password | 
      | pratiksha@test.com | pratiksha |
      | rick@test.com | tester |
