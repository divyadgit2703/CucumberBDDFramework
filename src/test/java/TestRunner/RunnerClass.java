package TestRunner;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features/AmazonLoginTestcases.feature"},
        glue = {"stepDefinitions","hooks"},
        tags = "@EmailPhonNoValidation",
        plugin = {"pretty", "html:target/cucumber.html"}
)
public class RunnerClass {
}
