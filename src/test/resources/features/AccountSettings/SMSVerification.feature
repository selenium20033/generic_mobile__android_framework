#Author: mozkan@thinkwhy.com
Feature: Sms verification

  Background: 
    When I login laborIQ Website

  @SMSVerification
  
  Scenario: Sms verification
  
    When I click on accounts icon
    And I click on account settings icon
    And I click on security link
    And I click on SMS verification edit button
    And I enter the phone number
    And I click on submit button
    And I click on resend code button
    Then I click on cancel button
   
    
    
  
