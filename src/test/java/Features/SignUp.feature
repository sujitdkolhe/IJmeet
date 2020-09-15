Feature: Verify Sign Up page

 Background: Below some common steps
    Given launch chrome browser
    When Opens URL "https://ijmeet.com/"
    Then Check visibility of Sign Up button
    Then Click on Sign Up button
    Then Navigate to Sign Up Page
    
    Scenario: Verify Sign Up page fields
     Then Mouse hover on Full Name text box
     Given Enter Full Name as "Arjun Reddy"
     Then Mouse hover on Company Name text box
     Given Enter Company Name as "ABC Ltd"
     Then Mouse hover on Email id text box
     Given Enter Email id as "arjunreddy8254@gmail.com"
     Then Mouse hover on Mobile Number text box
     Given Enter Mobile Number as "9876543210"
     Given User Enters Password as "abc@1234"
     Given User clicks on Sign Up button
   
    Scenario: Verify if user already have an account
    Then Mousehover on already have an account login link
    Given Click on Sign in with Google-plus button
    Then User navigates to "https://ijmeet.com/login"    
    
    
      
    
 
		

