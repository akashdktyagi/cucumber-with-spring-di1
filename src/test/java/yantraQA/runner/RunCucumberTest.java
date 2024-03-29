package yantraQA.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "classpath:features/MyFeatures.feature",
        glue = "yantraQA.stepdefs",
        plugin = {"pretty","summary",
                "html:target/cucumber-reports.html",
                "json:target/json_result.json"
        },
        dryRun = false
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
