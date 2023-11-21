package Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("Java");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']//li/descendant::div[@class='eIPGRd']"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			
			String droplist=list.get(i).getText();
			System.out.println(droplist);
			if(droplist.contains("javatpoint"))
			{
				list.get(i).click();
				break;
			}
		}

	}

}
