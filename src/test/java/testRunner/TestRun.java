package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import com.cucumber.listener.ExtentCucumberFormatter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


/*
 * This method is to run feature file 
 * @author Sujit Kolhe
 */

//@RunWith(Cucumber.class)
/*@CucumberOptions(features = ".//src/test/java/Features/SignUp.feature", 
				 glue = "stepDefination",
				 dryRun=false,
				 monochrome = true, 
				 plugin = {"pretty","com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentsCucumberReport.html" })

public class TestRun extends AbstractTestNGCucumberTests {

}*/
//@RunWith(Cucumber.class)
@CucumberOptions(features = {".//src/test/java/Features/SignUp.feature"}, 
				 glue = {"stepDefination"},
				 dryRun=true,
				 monochrome = true, 
				 plugin = {"pretty", "html:Report/ExtentsCucumberReport" })

public class TestRun extends AbstractTestNGCucumberTests{
	
}