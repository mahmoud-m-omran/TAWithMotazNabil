package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends PageBase{
 // WebDriver driver;
    public HomePage(WebDriver driver) {
        super(driver);

        //this.driver=driver;
    }

    @FindBy(xpath = "//div[@class='header-links']//a[text()='Register']")
    WebElement registerLink;

    @FindBy(linkText = "Log in")
    WebElement logInLink;

    public void openRegistrationPage(){
        registerLink.click();
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("gender-male")));
       // return new UserRegistrationPage(driver);
    }
    public LoginPage OpenLoginPage(){

        logInLink.click();
        return new LoginPage(driver);
    }
}
