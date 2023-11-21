package TestPageFactory;

import java.time.Duration; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageFactory.OrangeHRMHomepage;
import PageFactory.OrangeHRMLogin;

public class TestOrangeHRMLogin {
    WebDriver driver;
    OrangeHRMLogin objLogin;
    OrangeHRMHomepage objHomePage;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 1)
    public void invalid_username() {
        objLogin = new OrangeHRMLogin(driver);
        objLogin.loginToOrangeHRM("Adminstrate", "admin1234");
        Assert.assertTrue(objLogin.getErrorMessage().contains("Invalid credentials"));
    }
    
    @Test(priority=2)
    public void invalid_passwordLogintest(){
    	objLogin = new OrangeHRMLogin(driver);
        objLogin.loginToOrangeHRM("Admin","agstwg");
        Assert.assertTrue(objLogin.getErrorMessage().contains("Invalid credentials"));
		

    }
    @Test(priority=3)
    public void validLogintest(){
    	objHomePage=new  OrangeHRMHomepage(driver);
    	objLogin = new OrangeHRMLogin(driver);
        objLogin.loginToOrangeHRM("Admin", "admin123");
        String text = objLogin.getText(); 
        Assert.assertEquals(text, "Dashboard");
    }
    @AfterMethod
    public void close() {
        driver.close();
    }
}