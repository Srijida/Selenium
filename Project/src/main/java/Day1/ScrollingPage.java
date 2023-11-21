package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.countries-ofthe-world.com/flags-of-the-world.html");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,3000)", "");
        //System.out.println(js.executeScript("return window.pageYOffset;"));
        /*js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");*/
        WebElement flag=driver.findElement(By.xpath("//img[@src='flags-normal/flag-of-India.png']"));
        js.executeScript("arguments[0].scrollIntoView();", flag);
        System.out.println(js.executeScript("return window.pageYOffset;"));

	}

}
