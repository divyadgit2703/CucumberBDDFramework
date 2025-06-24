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
      Then user search with "<searchContent>"
      Then validate all the relavant products of "<searchContent>" are displayed
      Then User select iphone with feature "<producttype>" and "<color>" and "<price>"
      Then User click on Add to cart button
      Then Validate Added to cart text is displayed and click on shopping cart Icon
      Then Vaidate Same product is added to cart by validating "<producttype>" and "<color>"

      Examples:
        |category|searchContent|producttype|color|price|
        |Appliances    |iphone|Apple iPhone 15|Black|₹60,200|


