package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature", glue= {"StepDefinitions"}, monochrome=true,
plugin={"pretty","html:target/HtmlReports/HtmlReports.html",
		"json:target/JSONReports/josnReport.json",
		"junit:target/JUnitReports/Report.xml"
		}
//tags= "@smoketest"
		)

public class TestRunner {

	
	
}
