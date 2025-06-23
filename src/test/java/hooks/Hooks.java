package hooks;

import base.BaseSteps;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.nio.file.Files;


public class Hooks extends BaseSteps {

    @Before
    public void setUp() {
        initializeDriver(); // Launches browser
        System.out.println("Browser launched");
    }

    @After(order = 0)
    public void tearDown() {
        quitDriver(); // Closes browser
        System.out.println("Browser closed");
    }

    @After(order = 1)
    public void takeScreenshotOnFailure(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failure Screenshot");
            System.out.println("Screenshot captured");
        }
    }

}
