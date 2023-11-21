package Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chechbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				
				
				
				WebDriver driver=new ChromeDriver(); 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://demoqa.com/checkbox");
				driver.manage().window().maximize();
				List<WebElement> checkboxs=driver.findElements(By.xpath("//*[@stroke='currentColor'and @class='rct-icon rct-icon-uncheck']"));//click HomeCheckbox
				checkboxs.size();
				
				/*for(WebElement checkbox:checkboxs) 
				   {
					checkbox.click();
				   }*/
				
				for(int i=0;i<checkboxs.size();i++)
				{
					if(i==0||i==1)
						
					checkboxs.get(i).click();
				}
				   }}
