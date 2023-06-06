#Author: mozkan@thinkwhy.com

Feature: Valid login
    
@validLogin

  Scenario: Valid login
    When  I enter valid username
    And I enter valid  password into textbox
    And I click login button
    And I validate that home page is displayed

    
  
   
   