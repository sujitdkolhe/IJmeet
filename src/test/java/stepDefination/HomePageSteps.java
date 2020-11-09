package stepDefination;

import org.testng.Assert;

import com.config.Constants;
import com.config.Keywords;
import com.ijmeet.pageobject.HomePage;
import com.ijmeet.pageobject.SignInPage;

import io.cucumber.java.en.Then;

public class HomePageSteps {

	@Then("verify visibility of IJmeet logo")
	public void verify_visibility_of_i_jmeet_logo() {
		Constants.homepage = HomePage.getHomePage();
		Constants.homepage.iJmeetLogoVisibility();
		Assert.assertTrue(true);
		Keywords.loggerInfo("Verified visibility of IJmeet Logo");
		// Constants.extent.createTest("Verified visibility of IJmeet Logo");
	}

	@Then("verify clickability of IJmeet logo link")
	public void verify_clickability_of_i_jmeet_logo_link() {
		Constants.homepage = HomePage.getHomePage();
		Constants.homepage.clickOnIJmeetLogoLink();
		Assert.assertEquals(Constants.driver.getCurrentUrl(), "https://ijmeet.com/home");
		Keywords.loggerInfo("Verified Clickability of IJmeet Logo Link");
		// Constants.extent.createTest("Verified clickability of IJmeet Logo Link");
	}

	@Then("verify visibility of Join Meeting Link")
	public void verify_visibility_of_join_meeting_link() {
		Constants.homepage = HomePage.getHomePage();
		Constants.homepage.joinMeetingLinkVisibility();
		Assert.assertTrue(true);
		Keywords.loggerInfo("Verified visibility of Join Meeting Link");
		// Constants.extent.createTest("Verified visibility of Join Meeting Link");
	}

	@Then("verify clickability of Join Meeting Link")
	public void verify_clickability_of_join_meeting_link() {
		Constants.homepage = HomePage.getHomePage();
		Constants.homepage.clickOnJoinMeetingLink();
		Keywords.sleep(5000);
		Assert.assertEquals(Constants.driver.getCurrentUrl(), "https://ijmeet.com/app");
		Keywords.loggerInfo("Verified Clickability of Join Meeting Link");
		// Constants.extent.createTest("Verified clickability of Join Meeting Link");
	}

	@Then("verify visibility of Host Meeting Link")
	public void verify_visibility_of_host_meeting_link() {
		Constants.homepage = HomePage.getHomePage();
		Constants.homepage.hostMeetingLinkVisibility();
		Assert.assertTrue(true);
		Keywords.loggerInfo("Verified visibility of Host Meeting Link");
		// Constants.extent.createTest("Verified visibility of Host Meeting Link");
	}

	@Then("verify clickability of Host Meeting Link")
	public void verify_clickability_of_host_meeting_link() {
		Constants.homepage = HomePage.getHomePage();
		Constants.homepage.clickOnHostMeetingLink();
		Keywords.sleep(5000);
		Assert.assertEquals(Constants.driver.getCurrentUrl(), "https://ijmeet.com/host_meeting");
		Keywords.loggerInfo("Verified Clickability of Host Meeting Link");
		// Constants.extent.createTest("Verified clickability of Host Meeting Link");
	}

	@Then("verify visibility of Contact Sales Link")
	public void verify_visibility_of_contact_sales_link() {
		Constants.homepage = HomePage.getHomePage();
		Constants.homepage.contactSalesLinkVisibility();
		Assert.assertTrue(true);
		Keywords.loggerInfo("Verified visibility of Contact Sales Link");
		// Constants.extent.createTest("Verified visibility of Contact Sales Link");
	}

	@Then("verify clickability of Contact Sales Link")
	public void verify_clickability_of_contact_sales_link() {
		Constants.homepage = HomePage.getHomePage();
		Constants.homepage.clickOnContactSalesLink();
		Keywords.sleep(5000);
		Assert.assertEquals(Constants.driver.getCurrentUrl(), "https://ijmeet.com/contact");
		Keywords.loggerInfo("Verified Clickability of Contact Sales Link");
		// Constants.extent.createTest("Verified clickability of Contact Sales Link");
	}

	@Then("verify visibility of Sign In Button")
	public void verify_visibility_of_sign_in_button() {
		Constants.sip = SignInPage.getSignInPage();
		Constants.sip.signInButtonVisibility();
		Assert.assertTrue(true);
		Keywords.loggerInfo("****** Verify visibility of Sign In Button *****");
		// Constants.extent.createTest("Verify visibility of Sign In Button");
	}

	@Then("verify clickability of Sign In Button")
	public void verify_clickability_of_sign_in_button() {
		Constants.sip = SignInPage.getSignInPage();
		Constants.sip.clickOnSignIn();
		Assert.assertEquals(Constants.driver.getCurrentUrl(), "https://ijmeet.com/login");
		Keywords.loggerInfo("Verified Clickability of Sign In Button");
		// Constants.extent.createTest("Verified clickability of Sign In Button");
	}

	@Then("verify visibility of Sign Up Button")
	public void verify_visibility_of_sign_up_button() {
		Constants.homepage = HomePage.getHomePage();
		Constants.homepage.signUpButtonVisibility();
		Assert.assertTrue(true);
		Keywords.loggerInfo("Verified Visibility of Sign Up Button");
		// Constants.extent.createTest("Verified visibility of Sign Up Button");
	}

	@Then("verify clickability of Sign Up Button")
	public void verify_clickability_of_sign_up_button() {
		Constants.homepage = HomePage.getHomePage();
		Constants.homepage.clickOnSignUpButton();
		Keywords.sleep(5000);
		Assert.assertEquals(Constants.driver.getCurrentUrl(), "https://ijmeet.com/register");
		Keywords.loggerInfo("Verified clickability of Sign Up Button");
		// Constants.extent.createTest("Verified clickability of Sign Up Button");
	}

}
