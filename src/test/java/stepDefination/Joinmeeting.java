package stepDefination;

import org.testng.Assert;

import com.config.Constants;
import com.config.Keywords;
import com.ijmeet.pageobject.JoinMeetingPage;
import com.ijmeet.pageobject.SignInPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Joinmeeting {
	@When("User Enters URL {string}")
	public void user_enters_url(String url) {
		Constants.driver.get(url);
		Constants.actual = Constants.driver.getCurrentUrl();
		String expectedUrl = "https://ijmeet.com/";
		Assert.assertEquals(Constants.actual, expectedUrl);
		Keywords.loggerInfo("****** Open URL *****");
	    
	}

	@Then("Verify visibility of Join meting Link")
	public void verify_visibility_of_join_meting_Link() {

		Constants.jmp = JoinMeetingPage.getJoinMeetingPage();
		Constants.jmp.joinMeetingVisibility();
		Assert.assertTrue(true);
		Keywords.loggerInfo("****** Verify visibility of Join meeting Link *****");
		// Constants.extent.createTest("Verify visibility of Join meeting Link");
	
	    	}

	@Then("Click on Join meeting")
	public void click_on_join_meeting() {
	    Constants.jmp=JoinMeetingPage.getJoinMeetingPage();
	    Constants.jmp.clickOnJoin_Meeting();
	}

	@Then("Navigate to Join meeting Window")
	public void navigate_to_join_meeting_window() {
		Keywords.switchToWindow(0);
		
		Constants.expected= "https://ijmeet.com/app";
		Constants.actual= Constants.driver.getCurrentUrl();
		Assert.assertEquals(Constants.actual, Constants.expected);
		Keywords.loggerInfo("****** Navigate to join meeting window*****");
		// Constants.extent.createTest("Navigate to join meeting window");
	}

	@Then("user enters name {string}")
	public void user_enters_name(String string) {
		Keywords.enterText("XPATH", "//input[@id='username']", "Punam");


	}

	@Then("user enters meeting id  {string}")
	public void user_enters_meeting_id(String string) {
		Keywords.enterText("XPATH", "//input[@id='meetingid']", "7732948");
	    
	}
	@Then("click on join Meeting button")
	public void click_on_join_meeting_button() {

    Keywords.clickOnElement("XPATH", "//button[@id='before_start']");
	}



	


}
