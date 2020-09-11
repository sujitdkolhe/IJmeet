package stepDefination;

import org.testng.Assert;

import com.config.Constants;
import com.config.Keywords;
import com.ijmeet.pageobject.SignInPage;
import com.ijmeet.pageobject.SignUpPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpSteps {
	
	public SignUpPage sp;
	
	@Given("^Launch chrome browser$")
	public void Launch_chrome_browser() {
		Keywords.openBrowser("Chrome");
		Keywords.maximizeBrowser();
		Keywords.loggerInfo("****** Launching chrome browser *****");
		//Constants.extent.createTest("Launching chrome browser");
	}
	@When("^Opens URL \"([^\"]*)\"$")
	public void Opens_URL(String url) {
		Constants.driver.get(url);
		Constants.actual = Constants.driver.getCurrentUrl();
		String expectedUrl = "https://ijmeet.com/";
		Assert.assertEquals(Constants.actual, expectedUrl);
		Keywords.loggerInfo("****** Open URL *****");
		//Constants.extent.createTest("Open URL");
	}
	
	@Then("^Check visibility of Sign Up button$")
	public void Check_visibility_of_Sign_Up_button() {
	    
	    Constants.signUpPage = new SignUpPage();
	    Constants.signUpPage.SignUpButtonVisibility();
	    Assert.assertTrue(true);
	    Keywords.loggerInfo("*****Verify visibility of Sign Up button******");	    
	}

	@Then("^Click on Sign Up button$")
	public void click_on_Sign_Up_button() {
		
		 Constants.signUpPage = new SignUpPage();
		 Constants.signUpPage.clickOnSignUp();	    
	}

	@Then("^Navigate to Sign Up Page$")
	public void navigate_to_Sign_Up_Page() {
		
		Keywords.switchToWindow(0);
		String expectedUrl = Constants.driver.getCurrentUrl();
		Constants.actual = "https://ijmeet.com/register";
		Assert.assertEquals(Constants.actual, expectedUrl);
		Keywords.loggerInfo("****** Navigate to Sign Up Page *****");	    
	}

	@Then("^Mouse hover on Full Name text box$")
	public void mouse_hover_on_Full_Name_text_box() {		
	    
	}

	@Then("^Enter Full Name as \"([^\"]*)\"$")
	public void enter_Full_Name_as(String fullname) {
		
		//sp.enterFullName(fullname);
		//Keywords.loggerInfo("****** User Enters Full Name *****");
	}

	@Then("^Mouse hover on Company Name text box$")
	public void mouse_hover_on_Company_Name_text_box() {		
	   
	}

	@Then("^Enter Company Name as \"([^\"]*)\"$")
	public void enter_Company_Name_as(String companyname) {
		
		//sp.entercompanyname(companyname);
		//Keywords.loggerInfo("****** User Enters Company Name *****");
	}

	@Then("^Mouse hover on Email id text box$")
	public void mouse_hover_on_Email_id_text_box() {
	   
	}

	@Then("^Enter Email id as \"([^\"]*)\"$")
	public void enter_Email_id_as(String emailid) {
		
	    //sp.enterEmailid(emailid);
	    //Keywords.loggerInfo("****** User Enters Email id *****");
	}

	@Then("^Mouse hover on Mobile Number text box$")
	public void mouse_hover_on_Mobile_Number_text_box() {
	    
	}

	@Then("^Enter Mobile Number as \"([^\"]*)\"$")
	public void enter_Mobile_Number_as(String mobilenumber) {
		
	    //sp.entermobilenumber(mobilenumber);
	    //Keywords.loggerInfo("****** User Enters Mobile Number *****");
	}

	@Then("^User Enters Password as \"([^\"]*)\"$")
	public void user_Enters_Password_as(String password) {
		
	   //sp.enterpassword(password);
	   //Keywords.loggerInfo("****** User Enters Password *****");
	}    
}
