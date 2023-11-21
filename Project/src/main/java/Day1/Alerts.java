package Day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
       //Click on js Alert 
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert alert1=driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert1.accept();
        if(driver.getPageSource().contains("You successfully clicked an alert"))
        {
        	 System.out.println("Test case Passed");
      } else {
             System.out.println("Test case Failed");
    }
        System.out.println("===============");
        
        //Click on js confirm
        
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert alert2=driver.switchTo().alert();
        System.out.println(alert2.getText());
      alert2.accept();
        if(driver.getPageSource().contains("You clicked: Ok"))
        {
        	 System.out.println("Test case Passed");
        } else {
             System.out.println("Test case Failed");
      }
        
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert alert3=driver.switchTo().alert();
        System.out.println(alert3.getText());
        alert3.dismiss();
        if(driver.getPageSource().contains("You clicked: Cancel"))
        {
        	 System.out.println("Test case Passed");
      } else {
             System.out.println("Test case Failed");
    }
        System.out.println("===============");
        //Click on js prompt
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert alert4=driver.switchTo().alert();
        System.out.println(alert4.getText());
        alert4.sendKeys("Hello World!!");
        alert4.accept();
        if(driver.getPageSource().contains("You entered: Hello World!!"))
        {
        	 System.out.println("Test case Passed");
      } else {
             System.out.println("Test case Failed");
    }
       
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert alert5=driver.switchTo().alert();
        System.out.println(alert4.getText());
        alert5.sendKeys("Hello World!!");
        alert5.dismiss();
        if(driver.getPageSource().contains("You entered: null"))
        {
        	 System.out.println("Test case Passed");
      } else {
             System.out.println("Test case Failed");
    }
        System.out.println("===============");
  }
        

	}


