Feature: Verify Sign Up page

 Background: Below some common steps
    Given launch chrome browser
    When Opens URL "https://ijmeet.com/"
    Then Check visibility of Sign Up button
    Then Click on Sign Up button
    Then Navigate to Sign Up Page
    
    Scenario: Verify Sign Up page fields
     Then Mouse hover on Full Name text box
     Then Enter Full Name as "Arjun Reddy"
     Then Mouse hover on Company Name text box
     Then Enter Company Name as "ABC Ltd"
     Then Mouse hover on Email id text box
     Then Enter Email id as "arjunreddy8254@gmail.com"
     Then Mouse hover on Mobile Number text box
     Then Enter Mobile Number as "9876543210"
     Then User Enters Password as "abc@123"  
    
 


