package Day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement doubleClick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act=new Actions(driver);
		act.doubleClick(doubleClick).build().perform();
		Alert alert1=driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert1.accept();
        
        if(driver.getPageSource().contains("You double clicked me.. Thank You.."))
        {
        	 System.out.println("Test case Passed");
      } else {
             System.out.println("Test case Failed");
    }

	}

}
