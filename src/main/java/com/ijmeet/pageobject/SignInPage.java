package com.ijmeet.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.config.Constants;
import com.config.Keywords;

public final class SignInPage {
	
	private static SignInPage sip= new SignInPage();
	
	// This is to Initializing the page Objects
	private SignInPage() {
		
		PageFactory.initElements(Constants.driver, this);
	}
	
	public static SignInPage getSignInPage() {
		
		return sip;		
	}

	@FindBy(xpath = "//a[text()=' Sign In ']")
	@CacheLookup
	private WebElement signIn;
	
	// This Method is to verify visibility of Sign In button
	public boolean signInButtonVisibility() {
		return signIn.isDisplayed();
	}
	
	// This method to click on Sign In link
	public void clickOnSign() {
		signIn.click();
	}
}