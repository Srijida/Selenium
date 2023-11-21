package Day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertRediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        WebElement username=driver.findElement(By.xpath("//input[@id='login1']"));
        username.sendKeys("Srijida");
       /* WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("12345");*/
        WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();
        Alert alertWindow  =  mywait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alertWindow.getText());
        
        
       

	}

}
