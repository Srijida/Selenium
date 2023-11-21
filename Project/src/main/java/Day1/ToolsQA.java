package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQA {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		String url=driver.getCurrentUrl();
		System.out.println("Current URL : "+url);
		WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
		firstname.sendKeys("Srijida");
		
		WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.sendKeys("Nazif");
		
		WebElement emailId=driver.findElement(By.xpath("//input[@id='userEmail']"));
		emailId.sendKeys("srijida@gmail.com");
		
		WebElement male_rd=driver.findElement(By.xpath("//label[@class='custom-control-label' and text()='Male']"));
		System.out.println(male_rd.isSelected());
		male_rd.click();
		
	
		WebElement female_rd=driver.findElement(By.xpath("//label[@class='custom-control-label' and text()='Female']"));
		female_rd.click();
		System.out.println(female_rd.isSelected());
		
		WebElement mobileNum=driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobileNum.sendKeys("7012842593");

		/*WebElement subject=driver.findElement(By.xpath("//*[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
		subject.sendKeys("Maths,Science");*/
		WebElement caddress=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		caddress.sendKeys("Palayam,Trivandrum");
		
		

			}

}
