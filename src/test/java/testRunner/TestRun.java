package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

/*
 * This method is to run feature file 
 * @author Sujit Kolhe
 */

//@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/java/Features/SignIn.feature", glue = "stepDefination",
monochrome = true,  plugin = {"pretty", "html:Report/ExtentsCucumberReport" })
public class TestRun extends AbstractTestNGCucumberTests{
}
