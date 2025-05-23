package stepDefinitions;

import Pages.HMHomePageClass;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class HMShoppingCartSteps {

    WebDriver driver = new ChromeDriver();
    HMHomePageClass hmHomePage = new HMHomePageClass(driver);

//    @Given("I launch browser")
//    public void i_launch_browser() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","C://Users//DELL//Documents//chromeDriver//chromedriver-win64/chromedriver.exe");
//        ChromeOptions cop = new ChromeOptions();
//        cop.setBinary("C://Users//DELL//Documents//chrome//chrome-win64//chrome.exe");
//        cop.addArguments("--remote-allow-origins=*");
//        driver =new ChromeDriver(cop);
//        driver.manage().window().maximize();
//
//   }

    @Then("I verify that logo present")
    public void i_verify_that_logo_present() {

    }


    @Then("Login <user name> and <password>")
    public void loginUserNameAndPassword() {
    }

    @When("user hover on Education dropdown")
    public void EducationDropdown() {
        WebElement dropdown = driver.findElement(By.xpath("(//a[text()='Education']/parent::li)[1]"));
        Actions act = new Actions(driver);
        act.moveToElement(dropdown).perform();

    }

@When("^User click on dropdown using index")
public void clickDropdown_using_index(){
    WebElement dropdown = driver.findElement(By.tagName("select"));
    Select options = new Select(dropdown);
    options.selectByIndex(1);
}
    @When("^User click on dropdown using value")
    public void clickDropdown_using_value(){
        WebElement dropdown = driver.findElement(By.tagName("select"));
        Select options = new Select(dropdown);
        options.selectByValue("opel");
    }

    @When("^User click on dropdown using text")
    public void clickDropdown_using_text(){
        WebElement dropdown = driver.findElement(By.tagName("select"));
        Select options = new Select(dropdown);
        options.selectByVisibleText("Audi");
    }


    @When("User click on Interaction with simple elements page")
    public void Interacting_with_Elements(){
        WebElement locator = driver.findElement(By.linkText("Interactions with simple elements"));
        locator.click();
    }

    @And("verify user landed into Interaction with simple elements page")
    public void Verify_page()
    {

        WebElement page = driver.findElement(By.xpath("//h3[contains(text(),'This section has really simple HTML elements')]"));
        if(page.isDisplayed())
            System.out.println("True");
        else
            System.out.println("False");
    }


    @Then("wait for sometimes")
    public void waitSometimes(){
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @Then("I click on the Login page link")
    public void iClickOnLoginpageUrl() {
        WebElement element=driver.findElement(By.linkText("Login automation"));
        element.click();
//         WebElement e = driver.findElement(By.className("page__heading"));
//        String pageTitle = e.getText();
//        Assert.assertEquals("Welcome Back!",pageTitle);
//        Select select=new Select(element);
//        select.selectByIndex(0);
    }

    @Then("validate label Email and password")
    public void EmailAndPasswordLabel() {
        WebElement Email = driver.findElement(By.xpath("//label[contains(text(),'Email')]"));
                WebElement Password = driver.findElement(By.xpath("//label[contains(text(),'Password')]"));
                if(Email.isDisplayed()&& Password.isDisplayed())
                {
                    System.out.println("True");
                }
                else
                {
                    System.out.println("False");
                }
    }

    @When("User enters username and password")
    public void EmailAndPassword() {
WebElement Email = driver.findElement(By.id("user[email]"));
Email.sendKeys("divyad2703@gmail.com");
WebElement password = driver.findElement(By.id("user[password]"));
password.sendKeys("User@123");
    }
//    @And("User click on SignInButton")
//    public void clickSignInButton(){
//        WebElement SignInBtn = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
//        SignInBtn.click();
//    }
    @And("Invalid error message displayed")
    public void InvalidErrMsg(){
        WebElement InvalidErrMsg = driver.findElement(By.xpath("//li[contains(text(),'Invalid email or password.')]"));
        if(InvalidErrMsg.isDisplayed())
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }

    @When("user hover on {string}")
    public void userHoverOn(String category) {
hmHomePage.selectCategory(category);
    }

    @Then("I click on the {string}")
    public void iClickOnThe(String subOptions) {
        hmHomePage.selectSubOptions(subOptions);
    }

    @When("user click on hamburger menu")
    public void userClickOnHamburgerMenu() {
         HMHomePageClass.HamBurgerMenu.click();
    }
}