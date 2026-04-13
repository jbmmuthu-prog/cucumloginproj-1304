Feature: Login

  Scenario: Valid Login
    Given User navigates to login page
    When User enters a valid username and password
    Then User should be successfully logged in redirected to Secure Area page

  Scenario: InvValid Login
    Given User navigates to login net page
    When User enters a invalid username and password
    Then User get an error message Your username is invalid should be displayed
