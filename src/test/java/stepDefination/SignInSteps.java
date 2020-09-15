package stepDefination;

import org.testng.Assert;

import com.config.Constants;
import com.config.Keywords;
import com.ijmeet.pageobject.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SignInSteps {
	
	@Given("launch chrome browser")
	public void launch_chrome_browser() {
	   
		Keywords.openBrowser("Chrome");
		Keywords.maximizeBrowser();
		Keywords.loggerInfo("****** Launching chrome browser *****");
	}

	
	@When("^User opens URL \"([^\"]*)\"$")
	public void user_opens_URL(String url) {

	}

	//public class SignInSteps {
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
		Constants.sip.clickOnSign();
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

	@Then("Mouse hover on Email Address text box")
	public void mouse_hover_on_email_address_text_box() {
	}

	@Then("user enters email address {string}")
	public void user_enters_email_address(String string) {
	}

	@Then("Mouse hover on Password text box")
	public void mouse_hover_on_password_text_box() {
	}

	@Then("user enters password {string}")
	public void user_enters_password(String string) {
	}
}
	
