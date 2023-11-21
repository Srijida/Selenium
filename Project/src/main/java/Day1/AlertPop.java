package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.manage().window().maximize();
        String result=driver.findElement(By.xpath("//div[@class='example']//child::p")).getText();
        System.out.println(result);
	}

	}


