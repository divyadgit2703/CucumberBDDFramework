package stepDefinitions;

import Pages.HMHomePageClass;
import Pages.HMLoginPageClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotEquals;

public class HMLoginPageSteps {
    WebDriver driver;

    @Given("User launch browser window")
    public void user_launch_browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Users//DELL//Documents//chromeDriver//chromedriver-win64/chromedriver.exe");
        ChromeOptions cop = new ChromeOptions();
        cop.setBinary("C://Users//DELL//Documents//chrome//chrome-win64//chrome.exe");
        cop.addArguments("--remote-allow-origins=*");
        cop.addArguments("--incognito");
        driver =new ChromeDriver(cop);
        driver.manage().window().maximize();

    }
    @When("User open H&M.com")
    public void user_open_phptravels_com() {
        driver.get("https://www2.hm.com/en_in/index.html");
    }

    @Then("wait for few seconds")
    public void page_waitSometimes(){
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @And("verify and hover on signInButton")
    public void verify_and_click_on_sign_up_buttton() {
        PageFactory.initElements(driver, HMLoginPageClass.class);
        HMLoginPageClass.AcceptCookiesButton.click();
        Actions act = new Actions(driver);
        act.moveToElement(HMHomePageClass.signInIcon).build().perform();
        HMLoginPageClass.signInButton.click();
    }


    @And("User click on signInButton")
    public void userClickOnSignInButton() {
        HMLoginPageClass.signInButton2.click();
    }



    @Then("User enter {string} and {string}")
    public void userEnterEmailAndPassword(String email, String password) {
        HMLoginPageClass.emailInputField.sendKeys(email);
        HMLoginPageClass.passwordInputField.sendKeys(password);
    }



    @And("User click on Not A member join now button")
    public void userClickOnNotAMemberJoinNowButton() {
        PageFactory.initElements(driver, HMLoginPageClass.class);
        HMLoginPageClass.AcceptCookiesButton.click();
        Actions act = new Actions(driver);
        act.moveToElement(HMHomePageClass.signInIcon).build().perform();
        HMLoginPageClass.notAmemberButtonLink.click();
    }

    @Then("User enter {string}")
    public void userEnter(String dob) {
        HMLoginPageClass.dob.sendKeys(dob);
    }

    @And("User click on subscriptionCheckbox and BecomeAnH&Mmember button")
    public void userClickOnSubscriptionCheckboxAndBecomeAnHMmemberButton() {
        if(!HMLoginPageClass.subscriptionCheckbox.isSelected()) {
            HMLoginPageClass.subscriptionCheckbox.click();
        }
        HMLoginPageClass.BecomeHMmemberButton.click();

    }
}
