Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts.
  And dashboard should be displayed.
  Accounts are: librarian, student, admin

  #This is how we comment in feature file

  Scenario: login as librarian
    Given user is on login page
    When use enter librarian username
    And user enters librarian password
    Then user should see the dashboard

