package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    protected static WebDriver driver;
    @BeforeClass
    public static void basemethod(){
        System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe"); // Setting system properties of FirefoxDriver
        driver=new FirefoxDriver();
    }
@Test
    public static void cleanUp(){
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://www.google.com/");
    }
    @AfterClass
    public static void tearDown(){
        driver.close();
    }
}
