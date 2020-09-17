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
	private WebElement Join_Meeting;

	
	// This Method is to verify visibility of  Join meeting link
	public boolean joinMeetingVisibility() {
		return Join_Meeting.isDisplayed();
	}
	
	// This method to click on Sign In link
	public void clickOnJoin_Meeting() {
		Join_Meeting.click();
	}


}
