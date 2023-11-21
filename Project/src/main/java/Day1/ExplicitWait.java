package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWait  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();
				WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));//declaration
				driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		        driver.manage().window().maximize();
		        
		        WebElement username =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		       // WebElement username = driver.findElement(By.name("username"));
		        //boolean status = username.isDisplayed();
		        username.sendKeys("Admin");
		        WebElement password = driver.findElement(By.name("password"));
		        password.sendKeys("admin123"); 
		      
	}

}