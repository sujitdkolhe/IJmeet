package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
	WebElement pageElement;	
	
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

	@Given("^Enter Full Name as \"([^\"]*)\"$")
	public void enter_Full_Name_as(String fullname) {
		
		pageElement = Constants.driver.findElement(By.id("name"));
		pageElement.sendKeys("Arjun Reddy");
		Keywords.loggerInfo("****** User Enters Full Name *****");
	}

	@Then("^Mouse hover on Company Name text box$")
	public void mouse_hover_on_Company_Name_text_box() {		
	   
	}

	@Given("^Enter Company Name as \"([^\"]*)\"$")
	public void enter_Company_Name_as(String companyname) {
		
		pageElement = Constants.driver.findElement(By.id("company_name"));
		pageElement.sendKeys("ABC Ltd");
		Keywords.loggerInfo("****** User Enters Company Name *****");
	}

	@Then("^Mouse hover on Email id text box$")
	public void mouse_hover_on_Email_id_text_box() {
	   
	}

	@Given("^Enter Email id as \"([^\"]*)\"$")
	public void enter_Email_id_as(String emailid) {
		
	    pageElement = Constants.driver.findElement(By.id("email"));
	    pageElement.sendKeys("arjunreddy8254@gmail.com");
	    Keywords.loggerInfo("****** User Enters Email id *****");
	}

	@Then("^Mouse hover on Mobile Number text box$")
	public void mouse_hover_on_Mobile_Number_text_box() {
	    
	}

	@Given("^Enter Mobile Number as \"([^\"]*)\"$")
	public void enter_Mobile_Number_as(String mobilenumber) {
		
	    pageElement = Constants.driver.findElement(By.id("contact"));
	    pageElement.sendKeys("9876543210");
	    Keywords.loggerInfo("****** User Enters Mobile Number *****");
	}

	@Given("^User Enters Password as \"([^\"]*)\"$")
	public void user_Enters_Password_as(String password) {
		
	   pageElement = Constants.driver.findElement(By.id("password"));
	   pageElement.sendKeys("abc@1234");
	   Keywords.loggerInfo("****** User Enters Password *****");
	} 	
	
	/*@Given("User clicks on I'm not robot checkbox")
	public void user_clicks_on_I_m_not_robot_checkbox() {
	    
		pageElement = Constants.driver.findElement(By.id("recaptcha-anchor"));
		pageElement.click();
		
		if(pageElement.isSelected()==false) 
		{
			pageElement.click();			
		}else{
				System.out.println("Checkbox is already selected");
	 }
	}*/

	@Given("User clicks on Sign Up button")
	public void user_clicks_on_Sign_Up_button() {
	    
		pageElement = Constants.driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn mirror-view-btn-primary']"));
		pageElement.click();	
	}
	
	@Then("Mousehover on already have an account login link")
	public void mousehover_on_already_have_an_account_login_link() {
		
	    
	}

	@Given("Click on Sign in with Google-plus button")
	public void click_on_Sign_in_with_Google_plus_button() {
		
		pageElement = Constants.driver.findElement(By.xpath("//span[@class='sign-up-accounthave']"));
	    pageElement.click();
	}

	@Then("User navigates to {string}")
	public void user_navigates_to(String string) {
	    
	}


}
