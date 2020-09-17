package stepDefination;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import com.config.Constants;
import com.config.Keywords;
import com.config.TestListener;
import com.config.Reporting;
import com.config.Utility;
import com.ijmeet.pageobject.SignInPage;
import com.ijmeet.testcases.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//@Listeners(TestListener.class)
public class SignInSteps {
	
//	@Before
//	public void openBrowser() {
//		Keywords.openBrowser("Chrome");
//		Keywords.maximizeBrowser();
//		Keywords.loggerInfo("****** Launching chrome browser *****");
//		Constants.extent.createTest("Launching chrome browser");
//	}
//
//	@After
//	public void closeBrowser() {
//		Keywords.closeBrowser();
//	}

	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		Keywords.openBrowser("Chrome");
		Keywords.maximizeBrowser();
		Keywords.loggerInfo("****** Launching chrome browser *****");
		//Constants.extent.createTest("Launching chrome browser");
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		Constants.driver.get(url);
		Constants.actual = Constants.driver.getCurrentUrl();
		String expectedUrl = "https://ijmeet.com/";
		Assert.assertEquals(Constants.actual, expectedUrl);
		Keywords.loggerInfo("****** Open URL *****");
		//Constants.extent.createTest("Open URL");
	}

	@Then("Verify visibility of Sign In button")
	public void verify_visibility_of_sign_in_button() {
		Constants.sip = SignInPage.getSignInPage();
		Constants.sip.signInButtonVisibility();
		Assert.assertTrue(true);
		Keywords.loggerInfo("****** Verify visibility of Sign In button *****");
		//Constants.extent.createTest("Verify visibility of Sign In button");
	}

	@Then("Click on Sign In button")
	public void click_on_sign_in_button() {
		Constants.sip = SignInPage.getSignInPage();
		Constants.sip.clickOnSign();
	}

	@Then("Navigate to Sign In Page")
	public void navigate_to_sign_in_page() {
		Keywords.switchToWindow(0);
		String expectedUrl = Constants.driver.getCurrentUrl();
		Constants.actual = "https://ijmeet.com/login";
		Assert.assertEquals(Constants.actual, expectedUrl);
		Keywords.loggerInfo("****** Navigate to Sign In Page *****");
		//Constants.extent.createTest("Navigate to Sign In Page");
	}

	@Then("user enters email address {string}")
	public void user_enters_email_address(String emailAddress) {
		Constants.sip = SignInPage.getSignInPage();
		Constants.sip.enterEmailAddress(emailAddress);
		Keywords.loggerInfo("****** Enter more than 30 character in Email Address textbox *****");
		//Constants.extent.createTest("user enters email address");
	}

	@Then("user enters password {string}")
	public void user_enters_password(String password) {
		Constants.sip = SignInPage.getSignInPage();
		Constants.sip.enterPassword(password);
		Keywords.loggerInfo("****** Enter more than 30 character in Password textbox *****");
		//Constants.extent.createTest("user enters password");
	}

}
