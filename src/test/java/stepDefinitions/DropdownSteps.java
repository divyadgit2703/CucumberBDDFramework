//package stepDefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.Select;
//
//import java.util.concurrent.TimeUnit;
//
//public class DropdownSteps {
//
//    WebDriver driver;
//    @Given("I launch browser")
//    public void i_launch_browser() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","C://Users//divya#1998//Downloads//ChromeOptions//chromedriver-win64//chromedriver-win64/chromedriver.exe");
//        ChromeOptions cop = new ChromeOptions();
//        cop.setBinary("C://Users//divya#1998//Downloads//ChromeOptions//chrome-win64//chrome-win64//chrome.exe");
//        cop.addArguments("--remote-allow-origins=*");
//        driver =new ChromeDriver(cop);
//        driver.manage().window().maximize();
//
//    }
//    @When("I open Login page")
//    public void i_open_homepage() {
//        driver.get("https://ultimateqa.com/automation");
//    }
//
//    @Then("wait for sometimes")
//    public void waitSometimes(){
//        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//    }
//
//    @When("^User click on dropdown using index")
//    public void clickDropdown_using_index(){
//        WebElement dropdown = driver.findElement(By.tagName("select"));
//        Select options = new Select(dropdown);
//        options.selectByIndex(1);
//    }
//    @When("^User click on dropdown using value")
//    public void clickDropdown_using_value(){
//        WebElement dropdown = driver.findElement(By.tagName("select"));
//        Select options = new Select(dropdown);
//        options.selectByValue("opel");
//    }
//    @When("^User click on dropdown using text")
//    public void clickDropdown_using_text(){
//        WebElement dropdown = driver.findElement(By.tagName("select"));
//        Select options = new Select(dropdown);
//        options.selectByVisibleText("Audi");
//    }
//    @When("User click on Interaction with simple elements page")
//    public void Interacting_with_Elements(){
//        WebElement locator = driver.findElement(By.linkText("Interactions with simple elements"));
//        locator.click();
//    }
//    @And("verify user landed into Interaction with simple elements page")
//    public void Verify_page()
//    {
//
//        WebElement page = driver.findElement(By.xpath("//h3[contains(text(),'This section has really simple HTML elements')]"));
//        if(page.isDisplayed())
//            System.out.println("True");
//        else
//            System.out.println("False");
//    }
//
//
//}
