@tag
Feature: Institution User - Check the flow of Verified Certificates

  @sanity
  Scenario: Verify the flow of Verified Certificates
    Given login by the valid Username and Password
    When click the reports type option
    Then click the verified certificates
    Then click by the send mail and click the ok
    Then click on the download original certificates icon
    Then click on the QR Code icon
    And select student checkbox again click by ok
    
    
    