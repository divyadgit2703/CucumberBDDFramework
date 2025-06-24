package driver;

import Pages.AmazonHomePageClass;
import config.configLoader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriverFactory {

    private configLoader configLoader;

    public webdriverFactory(configLoader configLoader)
    {
        this.configLoader = configLoader;
    }

    public WebDriver createWebdriver()
    {
        String browser = configLoader.getProperty("browser");
        switch (browser)
        {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C://Users//dell//AutomationBDD//AutomationPractise//src//test//resources//Drivers/chromedriver.exe"); // Or use WebDriverManager
                ChromeOptions cop = new ChromeOptions();
                cop.setBinary("C://Users//dell//Downloads//chrome-win64//chrome-win64/chrome.exe");
                cop.addArguments("--remote-allow-origins=*");
                cop.addArguments("--incognito");
                return new ChromeDriver();
            case "edge":
                System.setProperty("webdriver.edge.driver", "C://Users//dell//AutomationBDD//AutomationPractise//src//test//resources//Drivers/msedgedriver.exe"); // Or use WebDriverManager
                return new EdgeDriver();
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
    }
}
