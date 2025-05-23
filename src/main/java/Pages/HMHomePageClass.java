package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HMHomePageClass {

    WebDriver driver;
    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    public static WebElement signInIcon;
    @FindBy(xpath ="//a[text() ='{category}']")
    public static WebElement category;

    @FindBy(xpath = "//ul[@class='__0XfP']//li")
    List<WebElement> subOptions;

    @FindBy(xpath = "//a[@class='CGae __9y2v vEfo']")
    List<WebElement> categories;

    @FindBy(xpath ="//span[text()='Menu']/parent::button")
    public static WebElement HamBurgerMenu;


    public HMHomePageClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectCategory(String category)
    {
        for(WebElement options:categories)
        {
            if(options.getText().equalsIgnoreCase(category)){
                Actions act = new Actions(driver);
                WebElement categoryOption = driver.findElement(By.xpath("//ul[@class='MLEL']/child::li//a[text()='"+category+"']"));
                act.moveToElement(categoryOption).build().perform();
                break;}
        }
    }

    public void selectSubOptions(String subOption)
    {
        for(WebElement options:subOptions)
        {
            if(options.getText().equalsIgnoreCase(subOption)){
                Actions act = new Actions(driver);
                WebElement categoryOption = driver.findElement(By.xpath("//ul[@class='MLEL']/child::li//a[text()='"+subOption+"']"));
                act.moveToElement(categoryOption).build().perform();
                break;}
        }
    }
}
