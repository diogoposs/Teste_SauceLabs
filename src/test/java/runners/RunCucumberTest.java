package runners;

import org.junit.runner.RunWith;  // <-- isso que está faltando
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        plugin = {"pretty", "html:target/cucumber-report.html"}
)
public class RunCucumberTest {
}
