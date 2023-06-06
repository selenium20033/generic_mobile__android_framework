#Author: mozkan@thinkwhy.com
Feature: Displaying change password window

  Background: 
    When I login laborIQ Website

  @changePassword
  
  Scenario: Displaying change password window
  
    When I click on accounts icon
    And I click on account settings icon
    And I click on security link
    And I click on change password button
    And I enter old and new passwords
    Then I verify that update password button is enabled
   
    
    
  
