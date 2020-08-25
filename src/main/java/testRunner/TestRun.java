package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features/SignIn.feature", glue = "stepDefination", plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentsCucumberReport.html" })
public class TestRun {
}
