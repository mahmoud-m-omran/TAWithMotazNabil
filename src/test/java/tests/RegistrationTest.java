package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {


    @Test(priority = 1, alwaysRun = true)
    public void registrationTest() {

        homePageObject.openRegistrationPage();
        registrationPageObject.userRegistration("Mahmoudg", "Omrang", "Wecandoit123", "mahmoud5.omran826@gmail.com");
        Assert.assertTrue(registrationPageObject.getSuccessText().contains("Your registration completed"));
    }

    @Test(dependsOnMethods = {"registrationTest"})
    public void logoutTest() {
        registrationPageObject.clickLogOutLink();
    }

    @Test (dependsOnMethods= {"logoutTest"})
    public void loginTest() {
        homePageObject.OpenLoginPage();
        loginPageObject.enterUserName_PasswordAndLogin("mahmoud5.omran826@gmail.com", "Wecandoit123");

    }


}
