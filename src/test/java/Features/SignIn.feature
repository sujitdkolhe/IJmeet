Feature: Verify Sign In page

  Background: Below some common steps
    Given User launch chrome browser
    When User opens URL "https://ijmeet.com/"
    Then Verify visibility of Sign In button
    Then Click on Sign In button
    Then Navigate to Sign In Page

  Scenario: Verify Sign In page fields
    Then user enters email address "Sujitghjuikgfgddhjddjkolhe@gmail.com"
    Then user enters password "gjgfduguigiuhkghkfjhgiufi"
