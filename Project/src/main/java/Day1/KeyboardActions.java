package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://text-compare.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("inputText1")).sendKeys("Welcome");
        Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
        WebElement com=driver.findElement(By.xpath("//div[@class='compareButtonText']"));
        com.click();
        if(driver.getPageSource().contains("The two texts are identical!"))
        {
        	 System.out.println("Test case Passed");
      } else {
             System.out.println("Test case Failed");
    }


	}

}
