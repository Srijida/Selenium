package Day1;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.switchTo().newWindow(WindowType.TAB);//New window gets open on another tab
		driver.switchTo().newWindow(WindowType.WINDOW);//New window will be opened on the same tab
		driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

	}

}
