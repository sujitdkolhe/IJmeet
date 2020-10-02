//package stepDefination;
//
//import org.junit.runner.RunWith;
//import org.testng.Assert;
//
//import com.config.Constants;
//import com.config.Keywords;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
////@RunWith(Cucumber.class)
//public class HostMeetngStep {
//	@Given("^User Launch chrome Browser$")
//    public void user_launch_chrome_browser() throws Throwable {
//		Keywords.openBrowser("Chrome");
//		Keywords.maximizeBrowser();
//		Keywords.loggerInfo("****** Launching chrome browser *****");
//		// Constants.extent.createTest("Launching chrome browser");   
//    }
//
//    @When("^User opens URL \"([^\"]*)\"$")
//    public void user_opens_url_something(String URL) throws Throwable {
//    	Constants.driver.get(URL);
//    	Constants.actual = Constants.driver.getCurrentUrl();
//		String expectedUrl = "https://ijmeet.com/";
//		Assert.assertEquals(Constants.actual, expectedUrl);
//		Keywords.loggerInfo("****** Open URL *****");
//		// Constants.extent.createTest("Open URL");
//    }
//
//    @Then("^HomePage of IJMEET should  be open$")
//    public void homepage_of_ijmeet_shoul_be_open() throws Throwable {
//      
//    }
//
//    @Then("^Verify visibility of \"([^\"]*)\" button$")
//    public void verify_visibility_of_something_button(String strArg1) throws Throwable {
//        
//    }
//
//    @Then("^Click on \"([^\"]*)\" Button$")
//    public void click_on_something_button(String strArg1) throws Throwable {
//      
//    }
//
//    @Then("^Verify \"([^\"]*)\" should be Open$")
//    public void verify_something_should_be_open(String strArg1) throws Throwable {
//       
//    }
//}
