package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

    public WebDriver driver;
    protected WebDriverWait wait;

    //create constructor
    public PageBase(WebDriver driver){
        //it's a class used to initialize elements which is used with POM
       PageFactory.initElements(driver,this);
        //PageFactory.initElements(getDriver(), this);
        this.driver=driver;
        wait=new WebDriverWait(driver,10);

    }

    public static void click(WebElement webElement){

        webElement.click();

    }

    public static void setTextElementText(WebElement webElement,String value){
        webElement.sendKeys(value);
    }
}
