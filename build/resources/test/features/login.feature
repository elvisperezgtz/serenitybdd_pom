Feature: Login
  As user
  I want to use my credentials
  To get access to my account

  Scenario: Login successful
    Given He is on the login page
    When he logs in whit her credentials
      | username              | password  |
      | pruebaindra@gmail.com | 123456789 |
    Then he should be able to see the system greeting


  Scenario: Login failure
    Given He is on the login page
    When he logs in whit her credentials
      | username              | password   |
      | pruebaindra@gmail.com | 1451562168 |
    Then he should be able to see the error message

  Scenario: Login with wrong email field
    Given He is on the login page
    When he logs in whit wrong credentials
      | username     | password   |
      | pruebaindra@ | 1451562168 |
    Then he should be able to see the error message