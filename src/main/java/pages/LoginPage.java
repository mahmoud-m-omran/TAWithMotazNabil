package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

     @FindBy(id = "Email")
     WebElement emailTextBox;

     @FindBy(id = "Password")
     WebElement passwordTextBox;

    //css="input.button-1.login-button"
    @FindBy(xpath="//div[@class='buttons']/button[text()='Log in']")
    WebElement loginBtn;

    public void enterUserName_PasswordAndLogin(String userName,String password){
      //  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Email")));
        setTextElementText(emailTextBox,userName);
        setTextElementText(passwordTextBox,password);
       // wait.until(ExpectedConditions.visibilityOf(loginBtn));
        click(loginBtn);
    }

}
