package Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class DropDownWithoutSelectTag {
	public static void main(String args[]) {
		
		   WebDriver driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.navigate().to("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states");
		   driver.manage().window().maximize();
		   WebElement countryDropdown = driver.findElement(By.xpath("//select[@id='country-list']"));
		   countryDropdown.click();
		   List<WebElement> count =driver.findElements(By.xpath("//select[@id='country-list']"));
		   
	      
	        
		   System.out.println(count.size());
           
	        for (WebElement option : count) {
	        	System.out.println(option.getText());
	            
	        }
	        
          
	} 
}