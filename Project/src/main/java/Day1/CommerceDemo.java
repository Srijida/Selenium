package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommerceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.className("search-box-text")).sendKeys("Name");
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("test1");
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("test1");
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("test1");
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("test12");
		
		
	}

}
