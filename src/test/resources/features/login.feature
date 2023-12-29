Feature: Login

  Scenario: user is able to login to mobile application
    Given user is on the login page
    When user input credentials
    |userName|password|
    | userx       |   pasword123     |
    Then user is able to access dashboard