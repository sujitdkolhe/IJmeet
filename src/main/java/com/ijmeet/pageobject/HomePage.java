package com.ijmeet.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.config.Constants;
import com.config.Keywords;

public final class HomePage {
	private static HomePage homepage = new HomePage();

	// This is to Initializing the page Objects
	private HomePage() {
		PageFactory.initElements(Constants.driver, this);
	}

	public static HomePage getHomePage() {
		return homepage;

	}

	@FindBy(xpath = "//a[contains(@class,'navbar-brand font-weight-bold d-block')]//img")
	@CacheLookup
	private WebElement iJmeetLogoLink;

	@FindBy(xpath = "//a[contains(text(),'Join Meeting')]")
	@CacheLookup
	private WebElement joinMeetingLink;

	@FindBy(xpath = "//a[contains(text(),'Host Meeting')]")
	@CacheLookup
	private WebElement hostMeetingLink;

	@FindBy(xpath = "//a[contains(text(),'Contact sales')]")
	@CacheLookup
	private WebElement contactSalesLink;

	@FindBy(xpath = "//a[@class='nav-link nav-right-cutom-bg font-weight-bold']")
	@CacheLookup
	private WebElement signInButton;

	@FindBy(xpath = "//a[contains(@class,'nav-right-cutom-bg-1 font-weight-bold')]")
	@CacheLookup
	private WebElement signUpButton;

	// This Method is to verify visibility of IJmeet logo link
	public boolean iJmeetLogoVisibility() {
		return iJmeetLogoLink.isDisplayed();
	}

	// This method to click on IJmeet logo link
	public void clickOnIJmeetLogoLink() {
		iJmeetLogoLink.click();
	}

	// This Method is to verify visibility of Join Meeting link
	public boolean joinMeetingLinkVisibility() {
		return joinMeetingLink.isDisplayed();
	}

	// This method to click on Join Meeting link
	public void clickOnJoinMeetingLink() {
		joinMeetingLink.click();
	}

	// This Method is to verify visibility of Host Meeting link
	public boolean hostMeetingLinkVisibility() {
		return hostMeetingLink.isDisplayed();
	}

	// This method to click on Host Meeting link
	public void clickOnHostMeetingLink() {
		hostMeetingLink.click();
	}

	// This Method is to verify visibility of Contact Sales link
	public boolean contactSalesLinkVisibility() {
		return contactSalesLink.isDisplayed();
	}

	// This method to click on Contact Sales link
	public void clickOnContactSalesLink() {
		contactSalesLink.click();
	}

	// This Method is to verify visibility of Sign In Button
	public boolean signInButtonVisibility() {
		return signInButton.isDisplayed();
	}

	// This method to click on Sign In Button
	public void clickOnSignInButton() {
		signInButton.click();
	}

	// This Method is to verify visibility of Sign Up Button
	public boolean signUpButtonVisibility() {
		return signUpButton.isDisplayed();
	}

	// This method to click on Sign Up Button
	public void clickOnSignUpButton() {
		signUpButton.click();
	}
}