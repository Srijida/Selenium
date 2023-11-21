package Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountryWithoutSelect {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//select[@name='country']"));
		WebElement drpcountryele=driver.findElement(By.xpath("//select[@id='country-list']//option"));
		drpcountryele.click();
		List<WebElement> drop=driver.findElements(By.xpath("//select[@id='country-list']//option"));
		System.out.println(drop.size());
		
		 for (WebElement option : drop) {
	        	System.out.println(option.getText());
	}

	}
}