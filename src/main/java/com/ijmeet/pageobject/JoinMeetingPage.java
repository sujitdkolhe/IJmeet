package com.ijmeet.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.config.Constants;

public class JoinMeetingPage {
	
	private static JoinMeetingPage jmp= new JoinMeetingPage();
	private JoinMeetingPage() {
		PageFactory.initElements(Constants.driver, this);
	}
	public static JoinMeetingPage getJoinMeetingPage() {
		return jmp;
		
	}
	@FindBy(xpath = "//a[text()=' Join Meeting ']")
	@CacheLookup
	private WebElement join_MeetingLink;
	
	@FindBy(xpath="//input[@id='username']")
	@CacheLookup
	private WebElement enterUrNameTb;
	
	@FindBy(xpath="//input[@id='meetingid']")
	@CacheLookup
	private WebElement meetingIdTb;
	
	@FindBy(xpath="//button[@id='before_start']")
	@CacheLookup
	private WebElement joinMeetingBtn;

	
	// This Method is to verify visibility of  Join meeting link
	public boolean joinMeetingVisibility() {
		return join_MeetingLink.isDisplayed();
	}
	
	// This method to click on join Meeting link link
	public void clickOnJoin_MeetingLink() {
		join_MeetingLink.click();
	}
	
	//This method is used for to enter value in "Enter Your name" textbox
	public void enterUserName(String username) {
		enterUrNameTb.sendKeys(username);
		
		}
	
	//This method is used for to enter meeting id in "Meeting id" textbox
	public void enterMeetingId(String id) {
		meetingIdTb.sendKeys(id);
		
	}
	
	//This method is used for to click on Join Meeting button
	public void click_OnJoinMeetingBtn() {
		joinMeetingBtn.click();
		
	}


}
