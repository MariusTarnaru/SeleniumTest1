Feature: LoginFeature
  The feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And  I enter the username and rest of fields
    Then I should see the user form page submitting
