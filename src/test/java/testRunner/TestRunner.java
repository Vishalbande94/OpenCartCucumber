package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/",glue ={ "testDefinition","hooks"},plugin= {"pretty", "html:reports/myreport.html"},monochrome=true,    // to avoid junk characters in output
        publish=true

)
public class TestRunner {
}
