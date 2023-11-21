package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explicitwaitlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		username.sendKeys("Admin");
		WebElement password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		password.sendKeys("admin123");
	    WebElement login =wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//button[@type='submit']"))));
		login.click();
		

}
}
