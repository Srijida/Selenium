package Day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
	        driver.manage().window().maximize();
	       // driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	        //Alert alertWindow = driver.switchTo().alert();
	       // WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
	       // Alert alertWindow       =  mywait.until(ExpectedConditions.alertIsPresent());
	       //alertWindow.accept();//OK will Click 
	        
	        //alertWindow.dismiss();
	       driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	       //Alert alertWindow = driver.switchTo().alert();
	       WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
	       Alert alertWindow       =  mywait.until(ExpectedConditions.alertIsPresent());
	       System.out.println( alertWindow.getText());
	       alertWindow.sendKeys("hello");
	       alertWindow.accept();//OK will Click 
	      
	      
	      }
	    
	       //alertWindow.dismiss();

	}


