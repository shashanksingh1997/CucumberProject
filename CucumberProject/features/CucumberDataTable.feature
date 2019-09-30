@tag
Feature: Login Functionality

 @tag2
 Scenario: Test HeroKuApp login
    Given user is on HerokuApp page
    When user enters username and password
    	| tomsmith | SuperSecretPassword! |
    Then display message user login successfully

   
