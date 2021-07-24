@regression @smoke @login
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different accounts.
  And dashboard should be displayed.
  Accounts are: librarian, student, admin

  #This is how we comment in feature file
  Background: Assuming user is on the login page
    Given user is on login page

@librarian @employee
  Scenario: login as librarian
    When use enter librarian username
    And user enters librarian password
    Then user should see the dashboard

  @student @db
    Scenario: login as student
    When user enters student username
    And user enters student password
    Then user should see the dashboard

@admin @employee
  Scenario: login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard



