 @FunctionalTest
 Feature: Tag Functionality

 Background: Background Functionality
    Given Test one Background
    When Test two Background
    Then Test three Background

    @SmokeTest
  Scenario: Test smoke functionality
    Given It is a smoke first step
    When It is a smoke second step
    Then It is a smoke third step 
    
    @RegressionTest
  Scenario: Test regression functionality
    Given It is a Regression first step
    When It is a Regression second step
    Then It is a Regression third step
    
    @IntegrationTest
  Scenario: Test integration functionality
    Given It is a Integration first step
    When It is a Integratuion second step
    Then It is a Integration third step