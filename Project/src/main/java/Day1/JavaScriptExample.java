package Day1;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
       WebElement name = driver.findElement(By.id("name"));
       js.executeScript("arguments[0].setAttribute('value','Srijida')", name);
       WebElement email=driver.findElement(By.id("email"));
       js.executeScript("arguments[0].setAttribute('value','srijida@gmail.com')", email);
       WebElement mobnum=driver.findElement(By.id("phone"));
       js.executeScript("arguments[0].setAttribute('value','7012842593')", mobnum);
       WebElement address=driver.findElement(By.xpath("//textarea[@class='form-control']"));
       js.executeScript("arguments[0].setAttribute('value','Palayam,Trivandrum')", address);
       WebElement female = driver.findElement(By.id("female"));
       //female.click();
       js.executeScript("arguments[0].click();",female );
       WebElement day2 = driver.findElement(By.id("monday"));
       js.executeScript("arguments[0].click();",day2 );
       WebElement day4 = driver.findElement(By.id("wednesday"));
       js.executeScript("arguments[0].click();",day4 );
       WebElement day6 = driver.findElement(By.id("friday"));
       js.executeScript("arguments[0].click();",day6 );
       WebElement selectcountry = driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
       selectcountry.click();
       WebElement country=driver.findElement(By.xpath("(//select[@id='country']//option)[10]"));
       country.click();
       WebElement selectcolour = driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
       selectcolour.click();
       WebElement colour=driver.findElement(By.xpath("//select[@id='colors']//option[@value='red']"));
       colour.click();
	  
	   
       
	}
	  
}
