package TestingDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

public class OrangeHRM {
	public String loginToOrangeHRM() {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	       // Find username and password fields and login button
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");

	        // Click the login button
		 WebElement login =driver.findElement(By.xpath("//button[@type='submit']"));
			login.click();
	    String currentUrl=driver.getCurrentUrl();
	      return currentUrl;
	        
}

}
