Feature: Amazon User Login scenarios
  Background: Amazon.com page
    Given User launch browser window
#    When User open H&M.com
    Then wait for few seconds


    Scenario Outline: User sign in to Amazon successfully

      And verify and hover on signInButton
      And User click on signInBtn
      Then User enter emailorPhoneNo "<EmailOrPhone>"
      And User click on continueButton

      Examples:
      |EmailOrPhone|
      |Automation123@gmail.com|
      |9836426456|



  Scenario Outline: User login to Amazon is failed

    And verify and hover on signInButton
    And User click on signInBtn
    Then User enter emailorPhoneNo "<Email>"
    And User click on continueButton
    And User enter password "<password>"
    And User click on signInButton in Login page
    And validate password incorrect message is displayed
        Examples:
          |Email|password|
          |Automation123@gmail.com|Tester@123 |

@EmailPhonNoValidation
  Scenario Outline: Email/phonNo and password validation

    And verify and hover on signInButton

    And User click on signInBtn
    Then User enter emailorPhoneNo "<EmailPhoneNo>"
    And User click on continueButton
    Then validate Email incorrect message is displayed
    Then User enter emailorPhoneNo "<EmailPhoneNo>"
    And User click on continueButton
    Examples:
      |EmailPhoneNo|
      |Automation123.com|
      |6574|



