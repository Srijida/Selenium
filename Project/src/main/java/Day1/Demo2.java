package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.tutorialspoint.com/online_dev_tools.htm");
		driver.manage().window().maximize();
		
		
		String url=driver.getCurrentUrl();
		System.out.println("Current URL : "+url);
		//System.out.println(driver.getPageSource());
		
		driver.findElement(By.linkText( "Coding Ground")).click();
		
		//driver.navigate().back();
		//driver.navigate().forward();
		List<WebElement> elements =driver.findElements(By.tagName("img"));
		 List<WebElement> links =driver.findElements(By.tagName("a"));
		 System.out.println("Total no: of images : "+elements.size());
		
		 System.out.println("Total no: of links : "+links.size());
		
		driver.findElement(By.partialLinkText("Coding")).getAttribute("href");
		String linkurl=driver.findElement(By.partialLinkText("Coding")).getAttribute("href");
		System.out.println("Anchor Text : "+linkurl);      
		
		driver.findElement(By.partialLinkText("Coding")).click();
		String anchorurl=driver.getCurrentUrl();
		System.out.println(anchorurl);
		//driver.findElement(By.tagName("img"));
		//driver.findElements(By.tagName("img"));
		
		
		/*if(
			linkurl.equals(anchorurl)) {
				System.out.println("Test case passed");
			}
		else {
			System.out.println("Test case Failed");
		}*/
	driver.quit();
		}
		 
		
	}
   

