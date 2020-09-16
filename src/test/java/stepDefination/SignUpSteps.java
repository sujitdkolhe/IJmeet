package stepDefination;

import org.testng.Assert;

import com.config.Constants;
import com.config.Keywords;
import com.ijmeet.pageobject.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSteps {
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
	
}
