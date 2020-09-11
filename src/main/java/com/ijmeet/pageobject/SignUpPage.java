package com.ijmeet.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.config.Constants;

public class SignUpPage {
	
	WebElement txtfullname;
	WebElement txtcompanyname;
	WebElement txtEmailid;
	WebElement txtmobilenumber;
	WebElement txtpassword;
	
	public SignUpPage() {
		// This is to Initializing the page Objects
		PageFactory.initElements(Constants.driver, this);
	}
	
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
	
	public void enterFullName(String fname) {
		
		txtfullname.sendKeys(fname);
	}
	
	public void entercompanyname(String Company_name) {
		
		txtcompanyname.sendKeys(Company_name);
	}
	
	public void enterEmailid(String emailid) {
		
		txtEmailid.sendKeys(emailid);
	}
	
	public void entermobilenumber(String mobileNo) {
		
		txtmobilenumber.sendKeys(mobileNo);
	}
	
	public void enterpassword(String Pwd) {
		
		txtpassword.sendKeys(Pwd);
	}

}
