package Day1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//System.out.println(driver.getWindowHandle());
		Thread.sleep(6000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.getWindowHandles();
		Set<String> elements=driver.getWindowHandles();
		System.out.println(elements);
		for (String element : elements) {
		 System.out.println(element);
		     
		   }
		driver.close();
		} 
	
}

	



