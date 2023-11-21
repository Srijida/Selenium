package PomTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMLoginPage {
	//driver initialize
	WebDriver driver;
	 //constructor
	 public OrangeHRMLoginPage(WebDriver driver){

	        this.driver = driver;

	    }
	 By username=By.name("username");
	 By password=By.name("password");
	 By login=By.xpath("//button[@type='submit']");
	 By titleText=By.xpath("//div[@class=\"orangehrm-login-branding\"]");
	 By errorMessage=By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");
	 
	 public void setUsername(String strusername) {
		 
		 driver.findElement(username).sendKeys(strusername);
	 }
	 
 public void setPassword(String strpassword) {
		 
		 driver.findElement(password).sendKeys(strpassword);
	 }
 public void clickLogin() {
	 
	 driver.findElement(login).click();
 }
 public String getLoginTitle(){

     return    driver.findElement(titleText).getText();

    }


     
     public void loginToOrangeHRM(String strusername,String strpassword){
         this.setUsername(strusername);
         this.setPassword(strpassword);
         this.clickLogin();        
     }
     
    
     public String getErrorMessage() {
    	 return driver.findElement(errorMessage).getText();
       
     }

}