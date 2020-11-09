package stepDefination;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import com.config.Constants;
import com.config.Keywords;
import com.config.Utility;
import com.ijmeet.pageobject.SignInPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//@Listeners(TestListener.class)
public class SignInSteps {
	String propertiesFilepath = "E:\\Java\\IJmeet\\Configuration\\ObjectRepo.properties";
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
//	    Keywords.quiteDriver();
//	}

	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		Keywords.openBrowser("Chrome");
		Keywords.maximizeBrowser();
		Keywords.loggerInfo("****** Launching chrome browser *****");
		// Constants.extent.createTest("Launching chrome browser");
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		Constants.driver.get(url);
		Constants.actual = Constants.driver.getCurrentUrl();
		String expectedUrl = "https://ijmeet.com/";
		Assert.assertEquals(Constants.actual, expectedUrl);
		Keywords.loggerInfo("****** Open URL *****");
		// Constants.extent.createTest("Open URL");
	}

	@Then("Verify visibility of Sign In button")
	public void verify_visibility_of_sign_in_button() {
		Constants.sip = SignInPage.getSignInPage();
		Constants.sip.signInButtonVisibility();
		Assert.assertTrue(true);
		Keywords.loggerInfo("****** Verify visibility of Sign In button *****");
		// Constants.extent.createTest("Verify visibility of Sign In button");
	}

	@Then("Click on Sign In button")
	public void click_on_sign_in_button() {
		Constants.sip = SignInPage.getSignInPage();
		Constants.sip.clickOnSignIn();
		Keywords.loggerInfo("****** Click on Sign In button *****");
		// Constants.extent.createTest("Click on Sign In button");
	}

	@Then("Navigate to Sign In Page")
	public void navigate_to_sign_in_page() {
		Keywords.switchToWindow(0);
		String expectedUrl = Constants.driver.getCurrentUrl();
		Constants.actual = "https://ijmeet.com/login";
		Assert.assertEquals(Constants.actual, expectedUrl);
		Keywords.loggerInfo("****** Navigate to Sign In Page *****");
		// Constants.extent.createTest("Navigate to Sign In Page");
	}

	@Then("user enters more than  thirty char in email address textbox {string}")
	public void user_enters_more_than_thirty_char_in_email_address_textbox(String emailAddress) {
		Constants.sip = SignInPage.getSignInPage();
		Constants.sip.enterEmailAddress(emailAddress);
		Keywords.loggerInfo("****** Enter more than 30 character in Email Address textbox *****");
		// Constants.extent.createTest("user enters email address");
	}

	@Then("user enters more than  thirty char in password textbox {string}")
	public void user_enters_more_than_thirty_char_in_password_textbox(String password) {
		Constants.sip = SignInPage.getSignInPage();
		Constants.sip.enterPassword(password);
		Keywords.loggerInfo("****** Enter more than 30 character in Password textbox *****");
		// Constants.extent.createTest("user enters password");
	}

	@Then("user click on Remember me checkbox")
	public void user_click_on_remember_me_checkbox() {
		Constants.sip = SignInPage.getSignInPage();
		Constants.sip.clickOnRememberMeCheckbox();
		if (Constants.sip.rememberMeCheckbox.isSelected()) {
			System.out.println("Remember me checkbox toggled on");
		} else {
			System.out.println("Remember me checkbox toggled off");
		}
		Constants.sip.clickOnRememberMeCheckbox();
		if (!Constants.sip.rememberMeCheckbox.isSelected()) {
			System.out.println("Remember me checkbox is now toggeled off");
		}
		// Assert.assertEquals(!Constants.sip.rememberMeCheckbox.isSelected(),
		// !Constants.sip.rememberMeCheckbox.isSelected());
		Keywords.loggerInfo("****** User click on Remember me checkbox *****");
		// Constants.extent.createTest("click on Remember me checkbox");
	}

	@Then("check Remember me checkbox color")
	public void check_remember_me_than_checkbox_color() {
		Keywords.hoverOnElement("CSS", Utility.getProperty("rememberMeCheckbox", propertiesFilepath));
		Keywords.getColor("CSS", Utility.getProperty("rememberMeCheckbox", propertiesFilepath), "outline-color");
		Assert.assertEquals(Constants.actual,
				Utility.getProperty("rememberMeCheckboxAfterClicking", propertiesFilepath));
		Keywords.loggerInfo("****** check Remember me than checkbox color *****");
		// Constants.extent.createTest("check Remember me than checkbox color");
	}

	@When("user click on sign up link it will navigate to register page")
	public void user_click_on_sign_up_link_it_will_navigate_to_register_page() {
		Constants.sip = SignInPage.getSignInPage();
		Constants.sip.clickOnSIgnUpLink();
		Constants.expected = Constants.driver.getCurrentUrl();
		Constants.actual = "https://ijmeet.com/dashboard";
		Assert.assertEquals(Constants.actual, Constants.expected);
		Constants.driver.navigate().back();
		Constants.driver.navigate().back();
		Keywords.loggerInfo("****** User click on sign up link *****");
		// Constants.extent.createTest("click on sign up link");
	}

	@When("user enter valid email address {string}")
	public void user_enter_valid_email_address(String emailAddress) {
		Constants.sip = SignInPage.getSignInPage();
		Constants.sip.enterValidEmailAddress(emailAddress);
		Keywords.loggerInfo("****** User enters valid Email Address in Email Address textbox *****");
		// Constants.extent.createTest("user enters valid email address");
	}

	@When("user enter valid password {string}")
	public void user_enter_enter_valid_password(String password) {
		Constants.sip = SignInPage.getSignInPage();
		Constants.sip.enterValidPassword(password);
		Keywords.loggerInfo("****** User enters valid Password in Password textbox *****");
		// Constants.extent.createTest("user enters valid Password");
	}

	@Then("user click on Sign in button")
	public void user_click_on_sign_in_button() {
		Constants.sip = SignInPage.getSignInPage();
		Constants.sip.clickOnSignInButton();
		Constants.actual = Constants.driver.getCurrentUrl();
		Constants.expected = "";
		Assert.assertEquals(Constants.actual, Constants.expected);
		Keywords.loggerInfo("****** user click on Sign in button *****");
		// Constants.extent.createTest("user click on Sign in button");
	}
}