package TestRunner;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"Features"},
        glue = {"stepDefinitions"},
        dryRun = true
)
public class RunnerClass {
}
