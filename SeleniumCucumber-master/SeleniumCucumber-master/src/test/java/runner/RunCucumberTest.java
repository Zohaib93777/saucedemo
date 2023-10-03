package runner;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/cucumber-html-report","json:cucumber.json"},
        features = "src/test/java/features",
        glue = {"stepDefinitions"}
)
public class RunCucumberTest {
}
