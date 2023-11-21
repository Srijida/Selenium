package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://demo.opencart.com/");
        driver.manage().window().maximize();
        WebElement desktop=driver.findElement(By.xpath("//a[text()='Desktops']"));
        String navlinkText=desktop.getText();
        System.out.println("Navigation Link to be click is : "+navlinkText);
        WebElement mac=driver.findElement(By.xpath("//*[text()='Mac (1)']"));
        Actions act=new Actions(driver);
        desktop.click();
        String list1=mac.getText();
        act.moveToElement(mac).click().perform();
        System.out.println("First Listed element on navigation link Desktop is : "+list1);

	}

}
