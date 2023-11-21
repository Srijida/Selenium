package Day1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//System.out.println(driver.getWindowHandle());
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.getWindowHandles();
		Set<String> elements=driver.getWindowHandles();
		System.out.println(elements);
		for (String element : elements) {
			String title=driver.switchTo().window(element).getTitle();
		    System.out.println(element);
		    System.out.println(title);
		    
		    
		     
		   }
		
	}

}
