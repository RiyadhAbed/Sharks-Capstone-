Feature: Retail Page Feature

  Background: 
    Given user is on Retail home Page
    When user click on MyAccount
    And user click on Login option
    And user enter userName "Test3000.3000@gmail.com"  and password "Alajeele123"
    And user click on login button
    Then user should be logged into myAccount Page

  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company  | website      | taxID   | paymentMethod | payeeName |
      | USA FOOd | USA.Food.com | 1222121 | Cheque        | USA Food  |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      | BB&T     |   1233444 |  45759303 | saving      |    1234556777 |
    And User click on Continue button
    Then User should see a success message

  Scenario: Edit your account Information
    When User click on Edit your account information link
    And User modify below information
      | firstname | lastName | email                   | telephone  |
      | Ahmad     | Ali      | Test3000.3000@gmail.com | 2023983689 |
    And User click on Continue button
    Then User should see a message 'Success: Your account has been successfully updated.'
