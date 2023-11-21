package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://demoqa.com/checkbox");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement home = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[1]"));
        js.executeScript("arguments[0].click();",home );
        /*WebElement desktop = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[2]"));
        js.executeScript("arguments[0].click();",desktop );
        WebElement downloads = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[4]"));
        js.executeScript("arguments[0].click();",downloads );*/

	}

}
