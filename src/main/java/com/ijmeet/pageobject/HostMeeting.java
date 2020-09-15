package com.ijmeet.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.config.Constants;
import com.config.Keywords;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class HostMeeting {
	
	
	
	
	
	public HostMeeting(WebDriver driver) {
		Constants.driver= driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(className="collapse navbar-collapse float-right")
	private WebElement TopMenuIteams;
	
	@FindBy(xpath = "//a[contains(@class,'navbar-brand font-weight-bold d-block')]//img")
	private WebElement Logo;
	@FindBy(xpath="//footer[@class='container cutomer-bottom-footer']")
	private WebElement HostMeetingPageFootersection;
	@FindBy(xpath="//a[contains(text(),'Host Meeting')]")
	private WebElement hostMeetingTab;
	
	
	
	
	
	
	public void getHostMeetingLinkClick() {
		hostMeetingTab.click();
		
	}
	public void getFooterLink() {
try {
	Keywords.findNumberOfLinkPresent(HostMeetingPageFootersection);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	public WebElement HostPageTopMenuIteams()
	{
		return TopMenuIteams;
	}
	public WebElement IjmeetLogo()
	{
		return Logo;
	}
	public boolean HostMeetingPageFootersectionIsDisplayed()
	{
		 return HostMeetingPageFootersection.isDisplayed();
	}
	
}
