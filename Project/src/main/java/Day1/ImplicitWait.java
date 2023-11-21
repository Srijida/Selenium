package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");
	    WebElement login =driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		
		} 
	}


