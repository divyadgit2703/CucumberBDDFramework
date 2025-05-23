package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HMLoginPageClass {

    @FindBy(xpath = "//button[text()='Sign in']")
    public static WebElement signInButton;
    @FindBy(xpath = "//button[text()='Accept all cookies']")
    public static WebElement AcceptCookiesButton;
    @FindBy(name = "email")
    public static WebElement emailInputField;
    @FindBy(name = "password")
    public static WebElement passwordInputField;
    @FindBy(xpath = "(//span[text()='Sign in']/parent::button)[2]")
    public static WebElement signInButton2;
    @FindBy(xpath = "//button[text()='Not a member yet? Join here!']")
    public static WebElement notAmemberButtonLink;
    @FindBy(xpath = "//div[@data-testid='dateInput']/input")
    public static WebElement dob;
    @FindBy(xpath = "//input[@id='hmNewsSubscription']/parent::div")
    public static WebElement subscriptionCheckbox;
    @FindBy(xpath = "//span[text()='Become an H&M member']/parent::button")
    public static WebElement BecomeHMmemberButton;


//    public static WebElement username(WebDriver driver)
//    {
//        return driver.findElement(By.id("//strong[text()='Sign Up']"));
//    }

}
