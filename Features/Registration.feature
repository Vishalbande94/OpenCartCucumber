Feature: Registration

  Scenario: Verify registration functionality with valid information
    Given User lands on open cart application for registration
    When user clicks on profile icon for registration
    And User clicks on register button
    And Enters all valid details as below
      | First Name | Vishal             |
      | Last Name  | Bande              |
      | Email      | Vishal15@gmail.com |
      | Password   | Abc@123            |
    And Clicks on privacy toggle
    And Clicks on continue button
    Then Account should register successfully





