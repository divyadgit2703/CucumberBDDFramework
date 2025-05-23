Feature: H&M User Login scenarios
  Background: H&M.com page
    Given User launch browser window
    When User open H&M.com
    Then wait for few seconds


    Scenario Outline: User sign in to H&M

      And verify and hover on signInButton
      Then User enter "<Email>" and "<password>"
      And User click on signInButton

      Examples:
      |Email|password|
      |Automation123@gmail.com|Tester@123 |


      Scenario Outline: User create an an account in H&M

        And User click on Not A member join now button
        Then User enter "<Email>" and "<password>"
        Then User enter "<DOB>"
        And User click on subscriptionCheckbox and BecomeAnH&Mmember button

        Examples:
          |Email|password|DOB|
          |Automation123@gmail.com|Tester@123 |27/03/1998|



