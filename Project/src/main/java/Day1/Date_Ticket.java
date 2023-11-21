package Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_Ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.findElement(By.id("dob")).click();//input[@id='dob']
		
		WebElement drpmonele=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select drpmon=new Select(drpmonele);
		drpmon.selectByVisibleText("Oct");
		
		WebElement drpyrele=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select drpyear=new Select(drpyrele);
		drpyear.selectByVisibleText("1990");
		
		String date="26";
		List<WebElement>All_Dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td"));
		for(int i=0;i<=All_Dates.size();i++) 
		{
			if(All_Dates.get(i).getText().equals(date)) {
				All_Dates.get(i).click();
				break;
				
			}
				
			
		}
		
		

	}

}
