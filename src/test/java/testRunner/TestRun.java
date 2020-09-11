package testRunner;

import org.junit.runner.RunWith;
<<<<<<< HEAD
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import com.cucumber.listener.ExtentCucumberFormatter;
=======
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

>>>>>>> c9730fc99413124e79b6ec320065d8c7fa80f15f
/*
 * This method is to run feature file 
 * @author Sujit Kolhe
 */

<<<<<<< HEAD
//@RunWith(Cucumber.class)
@CucumberOptions(features = ".//src/test/java/Features/SignUp.feature", 
				 glue = "stepDefination",
				 monochrome = true, 
				 plugin = {"pretty","com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentsCucumberReport.html" })

public class TestRun extends AbstractTestNGCucumberTests {
=======
@RunWith(Cucumber.class)
@CucumberOptions(features = ".//src/test/java/Features/SignIn.feature", glue = "stepDefination", monochrome = true, plugin = {
		"pretty", "html:Report/ExtentsCucumberReport" })
public class TestRun extends AbstractTestNGCucumberTests{

>>>>>>> c9730fc99413124e79b6ec320065d8c7fa80f15f
}