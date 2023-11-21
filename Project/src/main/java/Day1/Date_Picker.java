package Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		//WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		String date="10";
		String month="May";
		String year="2022";
		while (true) 
		{
			String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String year1=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if (mon.equals(month)&&year1.equals(year)) {
				
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			
		}
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
