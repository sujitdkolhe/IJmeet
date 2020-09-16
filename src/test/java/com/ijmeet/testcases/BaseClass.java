package com.ijmeet.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.config.Constants;
import com.config.Keywords;
import com.config.Utility;
import com.ijmeet.pageobject.SignInPage;

public class BaseClass {
	static String propertiesFilepath = "./Configuration\\ObjectRepo.properties";

	@BeforeMethod
	public static void baseTest() {
		Keywords.openBrowser("Chrome");
		
		
		
		
		
		Keywords.launchURL(Utility.getProperty("BaseURL", propertiesFilepath));
		Keywords.maximizeBrowser();
		Keywords.loggerInfo("entering appliction url and maximizing browser");
		Constants.logger = Logger.getLogger(BaseClass.class);
		PropertyConfigurator.configure("log4j.properties");
		Constants.sip = SignInPage.getSignInPage();
	}

	@AfterMethod
	public static void closeDriver() {
		Constants.driver.close();
		Constants.driver.quit();
	}
}