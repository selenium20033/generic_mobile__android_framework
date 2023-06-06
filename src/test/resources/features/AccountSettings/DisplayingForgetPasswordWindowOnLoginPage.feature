#Author: mozkan@thinkwhy.com

Feature: Displaying forget password window on security tab

  Background: 
    When I login laborIQ Website

  @displayingForgetPasswordonSecurityTab
  
  Scenario: Displaying forget password window on security tab
  
    When I click on accounts icon
    And I click on account settings icon
    And I click on security link
    And I click on change password button
    And I click on forget password link
    And I enter email address
    Then I verify that send link button is enabled
   
    
    
  
