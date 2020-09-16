Feature: Verify SignUp functionality

Background: Below some common steps
    Given User launch chrome browser
    When User opens URL "https://ijmeet.com/"
    Then Verify visibility of Sign In button

Scenario: Verify SignUp page should be open 
		Given ijmeet URL is open in chrome browser
		When User click on Sign Up button
		Then Sign Up page should be open
	
Scenario: Verify that by entering all valid values and click on submit button then Registration is done successfully
		Given ijmeet URL is open in chrome browser
		When User click on Sign Up button
		When User enter all valid values
		Then Registration is done successfully