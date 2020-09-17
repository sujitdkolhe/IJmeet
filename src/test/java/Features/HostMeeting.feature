Feature: HostMeeting Page Validation


Background:
   Given User Launch chrome Browser
   When User opens URL "https://ijmeet.com/"
   Then HomePage of IJMEET should  be open
   Then Verify visibility of "Host Meeting" button
   Then Click on "Host Meeting" Button
   Then Verify "Host Meeting Page" should be Open

Scenario: Verify Links presents on "HostMeeting Footer Section"
   Given User is On "HostMeeting Page"
   When User move to Footer Section page and clicks on every Link Buttons present on Footer Section Links
   Then Verify Each link should be clickable and respective new Tab should be open and take Title of each new Tab Page