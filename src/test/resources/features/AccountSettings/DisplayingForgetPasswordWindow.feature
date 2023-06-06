#Author: mozkan@thinkwhy.com

Feature: Displaying forget password window on login page

  @displayingForgetPasswordOnLoginPage
  
  Scenario: Displaying forget password window on login page
  
   When I click on forget password link on login page
    And I enter email address for forget password on login page
    Then I verify that send link button is enabled for login page forget password
   
    
    
  
