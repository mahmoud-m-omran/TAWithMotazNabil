package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.HomePage;
import pages.LoginPage;
import pages.PageBase;
import pages.UserRegistrationPage;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    /***************************/
    public HomePage homePageObject;
    public UserRegistrationPage registrationPageObject;
    public LoginPage loginPageObject;
    public PageBase pageBaseObject;
  //  public PageBase pageBase;

    @BeforeSuite
    @Parameters(("browser"))
    public void startDriver(@Optional("chrome") String browser){
       if(browser.equalsIgnoreCase("chrome")){
           System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
           driver=new ChromeDriver();
       }
       else if (browser.equalsIgnoreCase("firefox")){
           System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
           driver=new FirefoxDriver();
       }
       else if(browser.equalsIgnoreCase("ie")){
           System.setProperty("webdriver.ie.driver","resources/IEDriverServer.exe");
           driver=new InternetExplorerDriver();
       }

        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //pageBaseObject=new PageBase(driver);
        registrationPageObject=new UserRegistrationPage(driver);
        homePageObject=new HomePage(driver);
        loginPageObject=new LoginPage(driver);
    }

    @AfterSuite
    public void closeDriver(){
    //driver.quit();
    }
}
