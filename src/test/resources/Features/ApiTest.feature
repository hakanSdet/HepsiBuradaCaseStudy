Feature: Hepsiburada mock API test

  Scenario: Test 1
    Given I use get http request with "allGrocery" endpoint
    Then I check the status code as 200

  Scenario Outline: Test 2
    Given I use get http request with "<end point>" endpoint
    Then I check the status code as 200
    Then I check the name as "<name>"
    Examples:
      | end point         | name   |
      | allGrocery/apple  | apple  |
      | allGrocery/grapes | grapes |

  Scenario: Test 3
    Given I use post http request with "allGrocery/add" endpoint and add a request body
    Then I check the status code as 200

  Scenario: Test 4
    Given I use get http request with "allGrocery/strawberry" endpoint
    Then I check the status code as 400

  Scenario: Test 5
    Given I use get http request with "allGrocery/cucumber" endpoint
    Then I check the status code as 404
    Then I check the message as "Double check your method and the request path and try again."