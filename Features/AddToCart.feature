Feature: Add to cart functionality
  Scenario: Verify add to cart functionality
    Given user logged in and lands on home page
    When user search product as "mobiles"
    Then search result should displayed

  Scenario: Verify cart items
    Given user navigates to cart
    When user clicks on view cart
    Then cart should displayed all items