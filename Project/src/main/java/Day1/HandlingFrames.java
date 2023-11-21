package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		//input[@name='mytext1']
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		driver.switchTo().defaultContent();
		
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Srijida");
		driver.switchTo().defaultContent();
		
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Enter Details");
		WebElement iframe=driver.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));
		driver.switchTo().frame(iframe);
		WebElement rd2=driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]"));
		System.out.println(rd2.isSelected());
		rd2.click();
		WebElement chk1=driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[2]"));
		System.out.println(chk1.isSelected());
		chk1.click();
		WebElement chk2=driver.findElement(By.xpath("(//div[@class='uHMk6b fsHoPb'])[3]"));
		System.out.println(chk2.isSelected());
		chk2.click();
		driver.switchTo().defaultContent();
		
		
		
	}

}
