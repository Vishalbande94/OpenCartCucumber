Feature: Login Functionality
  Scenario: Verify login functionality with valid user password
    Given User navigates on login page
    When User enters email as "vishal@gmail.com" and password "Abc@123"
    And Clicks on login button
    Then System should login and navigates on my account page

