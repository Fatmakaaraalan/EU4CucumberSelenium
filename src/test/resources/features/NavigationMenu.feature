@navigate
Feature: Navigation menu

  Scenario: Navigation Fleet -- Vehicle
    Given  the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Fleet, vehicle
    Then  title should be Vehicle

  Scenario: Navigating Marketing - Campaigns
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Marketing - Campaigns
    Then  title should be Campaigns

  Scenario: Navigating Activities -- Calender Events
    Given the user is on the login page
    And the user enters the sale manager information
    When the user navigates to Activities -- Calender Events
    Then title should be Calendars
