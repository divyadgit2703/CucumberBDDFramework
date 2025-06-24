package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonHomePageClass {

//    WebDriver driver;
    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    public static WebElement signInIcon;
    @FindBy(xpath ="//a[text() ='{category}']")
    public static WebElement category;
    @FindBy(xpath = "//ul[@class='__0XfP']//li")
    List<WebElement> subOptions;
    @FindBy(xpath = "//a[@class='CGae __9y2v vEfo']")
    List<WebElement> categories;
    @FindBy(xpath ="//div[@id='nav-search-dropdown-card']")
    public static WebElement categoryDropdown;
    @FindBy(id="searchDropdownBox")
    public static WebElement categoryOption;
    @FindBy(id="twotabsearchtextbox")
    public static WebElement searchContent;
    @FindBy(xpath = "//span[contains(text(),'results for')]/following-sibling::span[contains(@class,'a-text-bold')]")
    public static WebElement searchResult;
    @FindBy(xpath="//span[contains(text(),\"%s\") and contains(text(),\"%s\")]/../../../following-sibling::div//span[@id=\"price-link\"]/following-sibling::a//span[text()=\"%s\"")
    public static WebElement ProducttypeAndColor;
    @FindBy(xpath="(//span[text()='Add to Cart'])[2]")
    public static WebElement AddToCartButton;
    @FindBy(xpath="//h1[contains(text(),'Added to cart')]")
    public static WebElement AddedToCartTextMessage;
    @FindBy(xpath="//a[@id=\"nav-cart\"]")
    public static WebElement ShoppingCartIcon;



    public static void selectCategoryByVisibleText(String text) {
        Select select = new Select(categoryOption);
        select.selectByVisibleText(text); // or selectByValue / selectByIndex :contentReference[oaicite:2]{index=2}
    }



public static String getSearchFieldValue(){
        return searchResult.getAttribute("innerText").replace("\"","");
}


//    public void selectCategory(String category)
//    {
//        for(WebElement options:categories)
//        {
//            if(options.getText().equalsIgnoreCase(category)){
//                Actions act = new Actions(driver);
//                WebElement categoryOption = driver.findElement(By.xpath("//ul[@class='MLEL']/child::li//a[text()='"+category+"']"));
//                act.moveToElement(categoryOption).build().perform();
//                break;}
//        }
//    }

//    public void selectSubOptions(String subOption)
//    {
//        for(WebElement options:subOptions)
//        {
//            if(options.getText().equalsIgnoreCase(subOption)){
//                Actions act = new Actions(driver);
//                WebElement categoryOption = driver.findElement(By.xpath("//ul[@class='MLEL']/child::li//a[text()='"+subOption+"']"));
//                act.moveToElement(categoryOption).build().perform();
//                break;}
//        }
//    }
}
