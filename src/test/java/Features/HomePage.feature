Feature: Verify Home page

  Background: Below some common steps
    Given User launch chrome browser
    When User opens URL "https://ijmeet.com/"

  Scenario: Verify IJmeet logo
    Then verify visibility of IJmeet logo
    Then verify clickability of IJmeet logo link