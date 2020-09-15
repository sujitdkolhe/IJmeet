package com.ijmeet.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.config.Constants;

public final class SignUpPage {
	
	public SignUpPage() {
		// This is to Initializing the page Objects
		PageFactory.initElements(Constants.driver, this);
	}
	
	/*public static SignUpPage getsignUpPage() {
		
		return signUpPage;
	}*/
	
	@FindBy(xpath = " //a[contains(text(),'Sign Up')]")
	@CacheLookup
	private WebElement signup;
	
	// This Method is to verify visibility of Sign Up button
	public boolean SignUpButtonVisibility() {
		
		return signup.isDisplayed();
	}
	
	// This method to click on Sign Up link
	public void clickOnSignUp() {
		
		signup.click();
	}	

}
