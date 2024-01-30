@tag
Feature: Check the flow of casual leave by employee

  @sanity
  Scenario: Verify the flow of casual leave by employee for two days and apply immediate day again
    Given Login employee with valid credentials
    When Click on Apply Casual Leave 
    Then Apply leave for two days
    And Apply leave for immediate nextday