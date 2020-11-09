Feature: Verify Sign In page

  Scenario: Verify Sign In page fields
    Given User launch chrome browser
    When User opens URL "https://ijmeet.com/"
    Then Verify visibility of Sign In button
    Then Click on Sign In button
    Then Navigate to Sign In Page
    Then user enters more than  thirty char in email address textbox "Sujitghjuikgfgddhjddjkolhe@gmail.com"
    Then user enters more than  thirty char in password textbox "gjgfduguigiuhkghkfjhgiufi"
        
  Scenario: Verify click ability of remember me checkbox
    Then user click on Remember me checkbox 
    Then check Remember me checkbox color
    
  Scenario: Validate 'Sign Up' link
    When user click on sign up link it will navigate to register page
    
  Scenario: Validate 'Sign In' button after clicking on it will navigate to register page 
  	When user enter valid email address "sujitdkolhe@gmail.com"
  	When user enter valid password "Sujitkolhe@26"
  	Then user click on Sign in button
  	
  
    

    