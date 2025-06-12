package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonLoginPageClass {

    @FindBy(xpath = "//div[@id='nav-link-accountList']")
    public static WebElement signInButton;
    @FindBy(xpath = "//span[text()='Sign in']")
    public static WebElement signInBtn;
    @FindBy(name = "email")
    public static WebElement emailInputField;
    @FindBy(id = "continue")
    public static WebElement continueButton;
    @FindBy(id = "ap_password")
    public static WebElement password;
    @FindBy(id = "signInSubmit")
    public static WebElement signInSubmitButton;
    @FindBy(xpath = "//div[contains(text(),'Your password is incorrect')]")
    public static WebElement passwordIncorrectMsg;
    @FindBy(xpath = "//div[contains(text(),'Invalid email address.')]")
    public static WebElement emailIncorrectMsg;
    @FindBy(xpath = "//div[contains(text(),'Invalid mobile number')]")
    public static WebElement mobileNoIncorrectMsg;


}
