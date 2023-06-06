#Author: mozkan@thinkwhy.com
Feature: Editing my profile account settings

  Background: 
    When I login laborIQ Website

  @editingMyProfileSection
  
  Scenario: Editing my profile account settings
  
    When I click on accounts icon
    And I click on account settings icon
    And I click on edit my profile link
    And I update my profile section
    Then I confirm the changes
   
    
    
  
