Feature: To verify join meeting without signin.

Background: Below some common steps
    Given User launch chrome browser
    When User Enters URL "https://ijmeet.com/"
    Then Verify visibility of Join meting Link
    Then Click on Join meeting 
    Then Navigate to Join meeting Window

  Scenario: Verify join meeting fields.
    Then user enters name "Punam"
    Then user enters meeting id  "7732948"
    Then click on join Meeting button
