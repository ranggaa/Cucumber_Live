package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeatureFiles"},glue= {"stepDefination"},monochrome=true,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html,","pretty", "html:target/cucumber-reports"})
public class Runner extends AbstractTestNGCucumberTests {

}
