package Day1;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;


public class DragAndDropGuru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions guru = new Actions(driver);
		//Drag Bank and Drop at Debit side 
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement des1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		guru.dragAndDrop(src1, des1).build().perform();
		//Drag Bank and Drop at Debit side 
		WebElement src2 = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
		WebElement des2 = driver.findElement(By.xpath("//ol[@id='amt7']"));
		guru.dragAndDrop(src2, des2).build().perform();
		
		
		WebElement src3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement des3 = driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']//li"));
		guru.dragAndDrop(src3, des3).build().perform();
		
		
		WebElement src4 = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebElement des4= driver.findElement(By.xpath("//ol[@id='amt8']"));
		guru.dragAndDrop(src4, des4).build().perform();
		
		if(driver.getPageSource().contains("Perfect!"))
        {
        	 System.out.println("Test case Passed");
      } else {
             System.out.println("Test case Failed");
    }
	}

	}
