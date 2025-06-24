package stepDefinitions;

import Pages.AmazonHomePageClass;
import Pages.AmazonLoginPageClass;
import base.BaseSteps;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class AmazonShoppingCartSteps extends BaseSteps {

    WebDriver driver;//        this.driver=getDriver();

    public AmazonShoppingCartSteps()
    {
        this.driver=getDriver();
        PageFactory.initElements(driver, AmazonHomePageClass.class);

    }

    @Then("wait for sometimes")
    public void waitSometimes(){
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }


    @When("user click on {string}")
    public void userHoverOn(String category) {
        AmazonHomePageClass.selectCategoryByVisibleText(category);
    }


    @When("user click on Categories dropdown")
    public void userClickOnHamburgerMenu() {
        AmazonHomePageClass.categoryDropdown.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(115));
    }


    @Then("user search with {string}")
    public void userSearchWith(String searchContent) {
        AmazonHomePageClass.searchContent.sendKeys(searchContent);
AmazonHomePageClass.searchContent.sendKeys(Keys.ENTER);
    }


    @Then("validate all the relavant products of {string} are displayed")
    public void validateAllTheRelavantProductsOfAreDisplayed(String searchContent) {
        String actualText = AmazonHomePageClass.getSearchFieldValue();
        String expectedText = searchContent;
        Assert.assertEquals("search field value mismatch", expectedText.trim(),actualText.trim());

    }

    @Then("User select iphone with feature {string} and {string} and {string}")
    public void userSelectIphoneWithFeatureAnd(String type, String color,String price) {
        String xpath = String.format(
                "//span[contains(text(),'%s') and contains(text(),'%s')]/../../../following-sibling::div//span[@id='price-link']/following-sibling::a//span[text()='%s']",
                type, color, price
        );
        System.out.println("Using XPath: " + xpath);  // 🔍 debug-print
        WebElement el = driver.findElement(By.xpath(xpath));
        Actions act = new Actions(driver);
        act.scrollToElement(el).moveToElement(el).click().perform();
        String ExpectedProductNameXpath = String.format("//span[contains(text(),'%s') and contains(text(),'%s')]",type,color);
        WebElement ProductElement = driver.findElement(By.xpath(ExpectedProductNameXpath));
        String ExpectedProductName = ProductElement.getAttribute("innerText");
        System.out.println(ExpectedProductName);
    }

    @Then("User click on Add to cart button")
    public void userClickOnAddToCartButton() {
        Actions act= new Actions(driver);
        act.moveToElement(AmazonHomePageClass.AddToCartButton).click().perform();

    }

    @Then("Validate Added to cart text is displayed and click on shopping cart Icon")
    public void validateAddedToCartTextIsDisplayedAndClickOnAddToCartButton() {
        AmazonHomePageClass.AddedToCartTextMessage.isDisplayed();
        AmazonHomePageClass.ShoppingCartIcon.click();

    }

    @Then("Vaidate Same product is added to cart by validating {string} and {string}")
    public void vaidateSameProductIsAddedToCartByValidatingAndAnd(String type, String color) {
        String ExpectedProductNameXpath = String.format("//span[contains(text(),'%s') and contains(text(),'%s')]",type,color);
        WebElement ProductElement = driver.findElement(By.xpath(ExpectedProductNameXpath));
        String ExpectedProductName = ProductElement.getAttribute("innerText");
        System.out.println(ExpectedProductName);
    }
}