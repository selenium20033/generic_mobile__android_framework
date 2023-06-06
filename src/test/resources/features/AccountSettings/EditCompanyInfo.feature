#Author: mozkan@thinkwhy.com
Feature: Editing my organization on account settings

  Background: 
    When I login laborIQ Website

  @editingMyOrganization
  
  Scenario: Editing my organization on account settings
  
    When I click on accounts icon
    And I click on account settings icon
    And I click on edit my organization link
    And I update my organization section
    Then I confirm the changes for my organization
   
    
    
  
