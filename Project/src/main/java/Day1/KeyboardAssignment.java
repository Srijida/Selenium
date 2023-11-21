package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://the-internet.herokuapp.com/key_presses");
        driver.manage().window().maximize();
        driver.findElement(By.id("target"));
        Actions act = new Actions(driver);
        act./*keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).
        keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).
        keyDown(Keys.F1).keyUp(Keys.F1).
        keyDown("A").keyUp("A").*/
        keyDown(Keys.INSERT).keyUp(Keys.INSERT).
        perform();
        
        WebElement result1=driver.findElement(By.id("result"));
        String res=result1.getText();
        if(res.contains("result1")) {
        	
        	System.out.println("Passed");
        }
        else {
            System.out.println(" Failed");
   }
        
        
        
       
	}

}
