Feature: Screenshot
  Background: Takescreenshot of Interaction with simple elements page
    Given I launch browser window
    When I open Login screen
    Then wait for sometime
    And User click on elements option

  Scenario Outline: Interaction with simple elements page - Take screen shot of full page

    When User click on Interaction with simple elements screen
    And verify user landed into Interaction with simple elements screen
    When User take screen shot of full page
    And User take portion screen shot
    And User take WebElement screen shot




    Examples:
      |user name|option|
      |user1    |example1|

    Scenario Outline: Text box implementation - validating labels, entering user data and submission

      And User click on Text box option




      Examples:
        |user name|option|
        |user1    |example1|