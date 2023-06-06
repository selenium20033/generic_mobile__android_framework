#Author: mozkan@thinkwhy.com

Feature: User sign out
    
@signOut

  Scenario: User sign out
  
    When  I enter valid username
    And I enter valid  password into textbox
    And I click login button
    And I validate that home page is displayed
    And I click on default menu button
    And I click on sign out link
    Then I validate that user is logged out 

    
  
   
   