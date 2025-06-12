package base;
import config.configLoader;
import driver.webdriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseSteps {


protected static WebDriver driver;

    public void initializeDriver() {
        if (driver == null) {

            configLoader configLoader = new configLoader("C://Users//dell//AutomationBDD//AutomationPractise/config.properties");
            webdriverFactory webdriverFactory = new webdriverFactory(configLoader);
            driver =webdriverFactory.createWebdriver();
            driver.manage().window().maximize();

        }
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

}
