package com.ijmeet.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.config.Constants;
import com.config.Keywords;
import com.config.Utility;

public final class SignInPage {
	private static SignInPage sip = new SignInPage();

	// This is to Initializing the page Objects
	private SignInPage() {
		PageFactory.initElements(Constants.driver, this);
	}

	public static SignInPage getSignInPage() {
		return sip;
	}

	String propertiesFilepath = "E:\\Java\\IJmeet\\Configuration\\ObjectRepo.properties";

	@FindBy(xpath = "//a[text()=' Sign In ']")
	@CacheLookup
	private WebElement signIn;

	@FindBy(css = "#email")
	@CacheLookup
	private WebElement emailAddressTextbox;

	@FindBy(css = "#password")
	@CacheLookup
	private WebElement passwordTextbox;

	@FindBy(css = "input[type=checkbox]")
	@CacheLookup
	public WebElement rememberMeCheckbox;

	@FindBy(css = "//span[text()=' Sign Up ']")
	@CacheLookup
	private WebElement SignUpLink;
	
	@FindBy(css = "//button[text()='  Sign In ']")
	@CacheLookup
	private WebElement SignInButton;

	// This Method is to verify visibility of Sign In button
	public boolean signInButtonVisibility() {
		return signIn.isDisplayed();
	}

	// This method to click on Sign In link
	public void clickOnSignIn() {
		signIn.click();
	}

	// This method to enter email address in email address textbox
	public void enterEmailAddress(String emailAddress) {
		emailAddressTextbox.sendKeys(emailAddress);
	}

	// This method to enter Password in email Password textbox
	public void enterPassword(String password) {
		passwordTextbox.sendKeys(password);
	}

	// This method to click on 'Remember me' checkbox
	public void clickOnRememberMeCheckbox() {
		rememberMeCheckbox.click();
		Keywords.sleep(5000);
	}

	// This method to check color of 'Remember me' checkbox after clicking on it
	public void toCheckColorOfRemembermeCheckbox() {

	}

	// This method to click on ;Sign Up' Link
	public void clickOnSIgnUpLink() {
		SignUpLink.click();
	}

	// This method to enter valid email address in email address textbox
	public void enterValidEmailAddress(String emailAddress) {
		emailAddressTextbox.clear();
		emailAddressTextbox.sendKeys(emailAddress);
	}

	// This method to enter valid Password in email Password textbox
	public void enterValidPassword(String password) {
		passwordTextbox.clear();
		passwordTextbox.sendKeys(password);
	}
	//This method to click on 'Sign In' button
	public void clickOnSignInButton() {
		SignInButton.click();
	}

}