package stepDefinitions;

import Pages.AmazonHomePageClass;
import Pages.AmazonLoginPageClass;
import base.BaseSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotEquals;

public class AmazonLoginPageSteps extends BaseSteps {
    WebDriver driver;

    public AmazonLoginPageSteps(){
        this.driver=getDriver();
    }

    @Given("User launch browser window")
    public void launch_browser() throws InterruptedException {
        driver.get("https://www.amazon.in/");
    }

    @Then("wait for few seconds")
    public void page_waitSometimes(){
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @And("verify and hover on signInButton")
    public void verify_and_click_on_sign_up_buttton() {
        PageFactory.initElements(driver, AmazonLoginPageClass.class);
        Actions act = new Actions(driver);
        act.moveToElement(AmazonLoginPageClass.signInButton).build().perform();
//        AmazonLoginPageClass.signInBtn.click();
    }

    @And("User click on continueButton")
    public void userClickOnSignInButton() {
        AmazonLoginPageClass.continueButton.click();
    }

    @Then("User enter emailorPhoneNo {string}")
    public void userEnterEmailAndPassword(String email) {
        AmazonLoginPageClass.emailInputField.sendKeys(email);
    }

    @And("User enter password {string}")
    public void userEnterPassword(String password) {
        AmazonLoginPageClass.password.sendKeys(password);
    }


    @And("User click on Not A member join now button")
    public void userClickOnNotAMemberJoinNowButton() {
        PageFactory.initElements(driver, AmazonLoginPageClass.class);
        Actions act = new Actions(driver);
        act.moveToElement(AmazonHomePageClass.signInIcon).build().perform();
//        HMLoginPageClass.notAmemberButtonLink.click();
    }

    @And("User click on signInButton in Login page")
    public void userClickOnSignInButtonInLoginPage() {
AmazonLoginPageClass.signInSubmitButton.click();
    }

    @And("validate password incorrect message is displayed")
    public void validatePasswordIncorrectMessageIsDisplayed() {
    AmazonLoginPageClass.passwordIncorrectMsg.isDisplayed();

    }

    @Then("validate Email incorrect message is displayed")
    public void validateEmailIncorrectMessageIsDisplayed() {
AmazonLoginPageClass.emailIncorrectMsg.isDisplayed();
    }

    @And("User click on signInBtn")
    public void userClickOnSignInBtn() {
        AmazonLoginPageClass.signInBtn.click();
    }
}
