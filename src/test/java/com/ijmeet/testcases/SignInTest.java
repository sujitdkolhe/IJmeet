package com.ijmeet.testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.config.Constants;
import com.config.TestListener;
@Listeners(TestListener.class)
public class SignInTest extends BaseClass {
	@Test
	public void tc_001() {
		Constants.signInPage.clickOnSign();
		Constants.logger.info("Verify Sign In link");
		Constants.extent.createTest("tc_001 Sign In link");
	}
}
