package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import com.cucumber.listener.ExtentCucumberFormatter;
/*
 * This method is to run feature file 
 * @author Sujit Kolhe
 */

//@RunWith(Cucumber.class)
@CucumberOptions(features = ".//src/test/java/Features/SignIn.feature", glue = "stepDefination",monochrome = true, plugin = {"pretty",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentsCucumberReport.html" })
public class TestRun extends AbstractTestNGCucumberTests {
}