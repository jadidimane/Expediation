Feature: logged in user
  Scenario: validate user is able to view after log in
    Given user navigate to the login page
    When  user succcessfully enter the login details
    Then  User should be able to see the product category page