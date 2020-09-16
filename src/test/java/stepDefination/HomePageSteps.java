package stepDefination;

import org.testng.Assert;

import com.config.Constants;
import com.config.Keywords;
import com.ijmeet.pageobject.HomePage;

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
		Constants.homepage= HomePage.getHomePage();
		Constants.homepage.clickOnIJmeetLogoLink();
		Assert.assertEquals(Constants.driver.getCurrentUrl(), "https://ijmeet.com/home");
		Keywords.loggerInfo("Verified Clickability of IJmeet Logo Link");
		// Constants.extent.createTest("Verified clickability of IJmeet Logo Link");
	}

}
