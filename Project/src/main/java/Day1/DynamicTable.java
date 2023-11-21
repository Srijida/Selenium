package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.findElement(By.id("input-username")).sendKeys("demo");
		driver.findElement(By.id("input-password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[@class=\"btn-close\"]")).click();
		driver.findElement(By.xpath("//a[@href='#collapse-5']")).click();
		driver.findElement(By.xpath("//a[text()='Customers']")).click();
		String pages=driver.findElement(By.xpath("//div[text()='Showing 1 to 10 of 16047 (1605 Pages)']")).getText();
		System.out.println(pages);
		
		int totalpages=Integer.valueOf(pages.substring(pages.indexOf("(")+1, pages.indexOf("pages")-1));
         System.out.println(totalpages);
	}

}
