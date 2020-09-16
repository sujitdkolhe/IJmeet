package com.ijmeet.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.config.Constants;
import com.config.Keywords;

public final class HomePage {
	private static HomePage homepage= new HomePage();
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

	
	// This Method is to verify visibility of IJmeet logo link
	public boolean iJmeetLogoVisibility() {
		return iJmeetLogoLink.isDisplayed();
	}
	
	// This method to click on IJmeet logo link
	public void clickOnIJmeetLogoLink() {
		iJmeetLogoLink.click();
	}
}