Feature: Dropdowns
  Background: Handling dropdowns
    Given I launch browser
    When I open Login page
    Then wait for sometimes

  Scenario Outline: Handling dropdowns in java

    When User click on Interaction with simple elements page
    And verify user landed into Interaction with simple elements page
    When User click on dropdown using index
    When User click on dropdown using value
    When User click on dropdown using text

    Examples:
      |user name|option|
      |user1    |example1|

