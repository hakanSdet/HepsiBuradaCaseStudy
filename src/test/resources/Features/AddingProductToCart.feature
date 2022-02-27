Feature: Adding a product functionality
  @test1 @ui
  Scenario:Adding a product to the cart by logging in
    Given User navigate to WebPage
    When User navigate to LoginPage
    And User is logged in "username" and "password"
    And Verify the user login is done on the homepage
    And User searches for the product wants to buy here
    And User can choose from the list of products displayed as a result of the Search
    And For the selected product, the product is selected from two different vendors and added to the cart.
    Then verify on the 'My Cart' page that the selected product has been added correctly.
  @test2 @ui
  Scenario:Adding a product to the cart without logging in
    Given User navigate to WebPage
    And User searches for the product wants to buy here
    And User can choose from the list of products displayed as a result of the Search
    And For the selected product, the product is selected from two different vendors and added to the cart.
    And verify on the 'My Cart' page that the selected product has been added correctly.