package Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownWithSelectTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//select[@name='country']"));
		WebElement drpcountryele=driver.findElement(By.xpath("//select[@name='country']"));
		Select drpcountry=new Select(drpcountryele);
		//drpcountry.selectByVisibleText("Brazil");
		//drpcountry.selectByValue("3");
		//drpcountry.selectByIndex(3);
		List<WebElement> options =drpcountry.getOptions();
		int op=options.size();
		for(int i=0;i<op;i++){
			String option=options.get(i).getText();
			System.out.println(option);
		}
		/*for(WebElement option:options) {
			System.out.println(option.getText());
			
		}*/
			
			
		}
		
	}
