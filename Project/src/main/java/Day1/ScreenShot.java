package Day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Project\\Screen_Shots\\fullpage.png");
		FileUtils.copyFile(src, target);
		WebElement fp=driver.findElement(By.xpath("(//img[@class='landscape-image'])[3]"));
		File src1=fp.getScreenshotAs(OutputType.FILE);
		File target1=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Project\\Screen_Shots\\particular.png");
		FileUtils.copyFile(src1, target1);

	}

}
