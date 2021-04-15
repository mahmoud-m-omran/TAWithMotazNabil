package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserRegistrationPage extends PageBase{
    public UserRegistrationPage(WebDriver driver) {
        super(driver);


    }

    /*@FindBy(linkText = "Log out")
    WebElement logOutLink;*/
    By logOutLink=By.linkText("Log out");

    @FindBy(id = "gender-male")
    WebElement genderRadioBtn;
   // By genderRadioBtn=By.id("gender-male");
   /* @FindBy(id = "FirstName")
    WebElement firstNameTextBox;*/
   By firstNameTextBox=By.id("FirstName");
    /*@FindBy(id = "LastName")
    WebElement lastNameTextBox;*/
    By lastNameTextBox=By.id("LastName");
  /*  @FindBy(id = "Email")
    WebElement emailTextBox;*/
  By emailTextBox=By.id("Email");
    /*@FindBy(id = "Password")
    WebElement passwordTextBox;*/
    By passwordTextBox=By.id("Password");

   /* @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordTextBox;*/
   By confirmPasswordTextBox=By.id("ConfirmPassword");

  /*  @FindBy(id = "register-button")
    WebElement registrationBtn;*/
  By registrationBtn=By.id("register-button");

   /* @FindBy(xpath = "//div[@class='result']")
    WebElement successMessage;*/
   By successMessage=By.xpath("//div[@class='result']");

    public void userRegistration(String firstName,String lastName,String password,String email){

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("gender-male")));
       click(genderRadioBtn);// genderRadioBtn.click();
        setTextElementText(driver.findElement(firstNameTextBox),firstName);//firstNameTextBox.sendKeys(firstName);
        setTextElementText(driver.findElement(lastNameTextBox),lastName);//lastNameTextBox.sendKeys(lastName);
        setTextElementText(driver.findElement(emailTextBox),email);//emailTextBox.sendKeys(email);
        setTextElementText(driver.findElement(passwordTextBox),password);//passwordTextBox.sendKeys(password);
        setTextElementText(driver.findElement(confirmPasswordTextBox),password);//confirmPasswordTextBox.sendKeys(password);
        click(driver.findElement(registrationBtn));//registrationBtn.click();

  // return new UserRegistrationPage(driver);
    }
    public void clickLogOutLink(){
        click(driver.findElement(logOutLink));
       // return new UserRegistrationPage(driver);
    }
    public String getSuccessText(){
        return driver.findElement(successMessage).getText();
    }

}
