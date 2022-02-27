Feature: Login functionality

  Scenario Outline: Login with valid credentials
    Given User navigates to login page
    When User enters "<username>" into username input
    And User clicks on submit button
    And User navigate to password page
    And User enters "<password>" into password input
    And User clicks on submit button
    And User can see Product Page
    Then User can see his-her full name on My Account page

    Examples:
      | username              | password  |
      | hkahraman96@gmail.com | 0011096   |
      | 5541245668            | 255364    |
      | 05541245668           | ab,255364 |

  Scenario Outline: Login with valid credentials (Enter Button)
    Given User navigates to login page
    When User enters "<username>" into username input
    And User clicks on login button
    And User navigate to password page
    And  User hits Enter Button on keyboard
    And User clicks on login button
    And User can see Product Page
    Then User can see his/her full name on My Account page

    Examples:
      | username        | password |
      | 123@gmail.com   | 121212   |
      | 123@hotmail.com | ababab   |
      | 5556871446      | .,?*=]   |
      | 05556871446     | @jH),8   |

  Scenario Outline: Check the eye button on password page
    Given User navigates to login page
    When User enters "<username>" into username input
    And User clicks on login button
    And User navigate to password page
    And User enters "<password>" into password input
    Then User can see bullet signs on password input box
    And User clicks eye symbol
    Then User can see password on password input box

    Examples:
      | username        | password |
      | 123@gmail.com   | 121212   |
      | 123@hotmail.com | ababab   |
      | 5556871446      | .,?*=]   |
      | 05556871446     | @jH),8   |

  Scenario Outline: Login with valid username and empty password
    Given User navigates to login page
    When User enters "<username>" into username input
    And User clicks on login button
    And User navigate to password page
    And User enters "<password>" into password input
    Then User can not click login button

    Examples:
      | username        | password |
      | 123@gmail.com   |          |
      | 123@hotmail.com |          |
      | 5556871446      |          |
      | 05556871446     |          |

  Scenario Outline: Login with empty username
    Given User navigates to login page
    When User enters "<username>" into username input
    And User clicks on login button
    Then User can see warning message "E-posta adresinizi veya telefon numaranızı girmelisiniz."


    Examples:
      | username |
      |          |


  Scenario Outline: Login with valid username and invalid password
    Given User navigates to login page
    When User enters "<username>" into username input
    And User clicks on login button
    And User navigate to password page
    And User enters "<password>" into password input
    And User clicks on login button
    Then User can see red warning message "Girdiğiniz şifre eksik veya hatalı.Kontrol edip tekrar deneyin." and red exclamation mark

    Examples:
      | username                | password |
      | standard_user           | 1233     |
      | locked_out_user         | secret   |
      | problem_user            | _sauce   |
      | performance_glitch_user | /*-54sd  |

  Scenario Outline: Login with invalid username (e-mail)
    Given User navigates to login page
    When User enters invalid "<e-mail>" into username input
    And User clicks on login button
    Then User can see red warning message "Geçerli bir e-posta adresi girmelisiniz." and red exclamation mark


    Examples:
      | e-mail        |
      | fdsf123---    |
      | 788rtr...@com |
      | jask          |
      | 144---7       |

  Scenario Outline: Login with invalid username (Phone number)
    Given User navigates to login page
    When User enters invalid "<phone number>" into username input
    And User clicks on login button
    Then User can see red warning message "Geçerli bir cep telefonu girmelisiniz." and red exclamation mark

    Examples:
      | phone number |
      | 88888888888  |
      | 788777777777 |
      | 25263999     |
      | 147852369    |


  Scenario Outline: After logout, user can not go back product page by navigating back
    Given User navigates to login page
    When User enters "<username>" into username input
    And User clicks on login button
    And User navigate to password page
    And User enters "<password>" into password input
    And User clicks on login button
    And User can see Product Page
    Then User can see his/her full name on My Account page
    And User hover on My Account Box
    And user clicks sign out button
    And User navigates back
    Then User can not go back product page


    Examples:
      | username        | password |
      | 123@gmail.com   | 121212   |
      | 123@hotmail.com | ababab   |
      | 5556871446      | .,?*=]   |
      | 05556871446     | @jH),8   |


