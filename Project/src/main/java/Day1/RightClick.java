package Day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement rightClick=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions(driver);
		act.contextClick(rightClick).build().perform();
		
		
		 driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-cut']")).click();
		 Alert cut=driver.switchTo().alert();
	     System.out.println(cut.getText());
	     cut.accept();
	     if(driver.getPageSource().contains("cut"))
	        {
	        	 System.out.println("Test case Passed");
	      } else {
	             System.out.println("Test case Failed");
	    }


	}

}
