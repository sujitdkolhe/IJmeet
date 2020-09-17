package com.ijmeet.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.config.Constants;
import com.ijmeet.pageobject.HostMeeting;

public class HostMeetingTest extends BaseClass {
	HostMeeting host;

	@BeforeMethod
	public void HostMeetingTest() {
		host = new HostMeeting(Constants.driver);
		host.getHostMeetingLinkClick();

	}

	@Test
	public void isFooterLinksClickable() {

		host.getFooterLink();
	}

}
