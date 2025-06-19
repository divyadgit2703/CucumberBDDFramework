Feature: Login
  Background: Login to Home page
    Given User launch browser window
#    When User open H&M.com
    Then wait for few seconds

    Scenario Outline: Add to cart - Add items to the cart and verify they appear correctly

      When user click on Categories dropdown
      Then wait for few seconds

      When user click on "<category>"
      Then wait for few seconds

#      Then I click on the "<Option>"
      Then user search with "<searchContent>"
      Then validate all the relavant products of "<searchContent>" are displayed


      Examples:
        |category|searchContent|color|size|
        |Appliances    |"iphone"|blue|M |

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
