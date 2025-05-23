Feature: Login
  Background: Login to Home page
    Given I launch browser
    When User open H&M.com
    Then wait for sometimes

    Scenario Outline: Add to cart - Add items to the cart and verify they appear correctly

      When user click on hamburger menu
      When user hover on "<category>"
      Then I click on the "<Option>"
      Then verify whether its taking to selected "<Option>" page
      And validate whether user able to select "<color>" and "<size>"
      And validate whether user able to select and add the item into cart


      Examples:
        |category|Option|color|size|
        |Ladies    |example1|blue|M |

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
