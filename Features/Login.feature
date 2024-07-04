Feature: Login
  Background: Login to Home page
    Given I launch browser
    When I open Login page
    Then wait for sometimes

    Scenario Outline: Login Page validation - For Invalid user login

      When user hover on Education dropdown
      Then wait for sometimes
      Then I click on the Login page link
      Then validate label Email and password
      And User click on SignInButton
      And Invalid error message displayed

      Examples:
        |user name|option|
        |user1    |example1|

#    Scenario Outline: Handling dropdown
#
#      When User click on Interaction with simple elements page
#      And verify user landed into Interaction with simple elements page
#      When User click on dropdown using index
#      When User click on dropdown using value
#      When User click on dropdown using text
#
#      Examples:
#        |user name|option|
#        |user1    |example1|
#
#
#
#
#
#
