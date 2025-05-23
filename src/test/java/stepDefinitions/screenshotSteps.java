package stepDefinitions;

import ch.qos.logback.core.util.FileUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class screenshotSteps {
    WebDriver driver;

    @Given("I launch browser window")
    public void i_launch_browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Users//DELL//Documents//chromeDriver//chromedriver-win64/chromedriver.exe");
        ChromeOptions cop = new ChromeOptions();
        cop.setBinary("C://Users//DELL//Documents//chrome//chrome-win64//chrome.exe");
        cop.addArguments("--remote-allow-origins=*");
        driver =new ChromeDriver(cop);
        driver.manage().window().maximize();

    }
    @When("I open Login screen")
    public void i_open_homepage() {
        driver.get("https://demoqa.com/");
//driver.findElement(By.linkText("Login automation")).click();
    }

    @Then("wait for sometime")
    public void waitSometimes(){
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @When("User click on Interaction with simple elements screen")
    public void Interacting_with_Elements(){
        WebElement locator = driver.findElement(By.linkText("Interactions with simple elements"));
        locator.click();
    }

    @And("verify user landed into Interaction with simple elements screen")
    public void Verify_page()
    {
        WebElement page = driver.findElement(By.xpath("//h3[contains(text(),'This section has really simple HTML elements')]"));
        if(page.isDisplayed())
            System.out.println("True");
        else
            System.out.println("False");
    }

    @When("User take screen shot of full page")
    public void full_screenshot() throws IOException {
        TakesScreenshot Ts = (TakesScreenshot) driver;
        File src = Ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("Screenshots//fullpage.png");
        FileUtils.copyFile(src,destination);

    }
    @And("User take portion screen shot")
    public void portion_screenshot() throws IOException {
        WebElement portion = driver.findElement(By.xpath("(//a[text()='Terms and conditions']/ancestor::div)[4]"));
        File src = portion.getScreenshotAs(OutputType.FILE);
        File destination = new File("Screenshots//portion.png");
        FileUtils.copyFile(src,destination);

    }
    @And("User take WebElement screen shot")
    public void webElement_screenshot() throws IOException {
        WebElement element = driver.findElement(By.xpath("//a[text()='Terms and conditions']"));
        File src = element.getScreenshotAs(OutputType.FILE);
        File destination = new File("Screenshots//webElement.png");
        FileUtils.copyFile(src,destination);

    }

    @And("User click on elements option")
    public void userClickOnElementsOption() {
        WebElement element=driver.findElement(By.xpath("//h5[contains(text(),'Elements')]"));
        element.click();
    }

    @And("User click on Text box option")
    public void userClickOnTextBoxOption() {
        WebElement element=driver.findElement(By.xpath("//span[contains(text(),'Text Box')]"));
        element.click();
    }
}
