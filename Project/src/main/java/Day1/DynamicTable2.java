package Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		 // Number of columns
        List<WebElement> col
            = driver.findElements(By.xpath("//table[@id='productTable']//tr//th"));
        System.out.println("No of columns : " + col.size());
 
        // Number of rows
        List<WebElement> rows
            = driver.findElements(By.xpath("//table[@id='productTable']//tr"));
        System.out.println("No of rows : " + rows.size());
        
        int total_pages=driver.findElements(By.xpath("//li//a[@href='#']")).size();
		System.out.println("Total number of pages = "+total_pages);
		  
		for(int p=1;p<=total_pages;p++) 
		  {
			  WebElement active_page=driver.findElement(By.xpath("(//li//a[@href='#'])["+p+"]"));
			  System.out.println("Active page is : "+active_page.getText());
			  active_page.click();
			  int rowsActpage = driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
				 System.out.println("Total number of rows in the table : "+rowsActpage);
			  int coloumsActPage=driver.findElements(By.xpath("//table[@id='productTable']//tr//th")).size();
				 System.out.println("Total number of coloums in the table : "+coloumsActPage);
				 System.out.println("========================");
				 
		
	
		 //4)Read data from all the rows & columns
	     System.out.println("======Data in the Current table======");
	     for(int j = 1;j<=rowsActpage;j++) 
			{
				String Id=driver.findElement(By.xpath("//table[@id='productTable']//tr["+j+"]//td[1]")).getText();
				String Name=driver.findElement(By.xpath("//table[@id='productTable']//tr["+j+"]//td[2]")).getText();
				String Price=driver.findElement(By.xpath("//table[@id='productTable']//tr["+j+"]//td[3]")).getText();
				System.out.println("Id :"+Id);
				System.out.println("Name :"+Name);
				System.out.println("Price :"+Price);
				System.out.println("===========================");
				System.out.println();
			}
	     /*String page=Integer.toString(p+1);
	 	driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+page+"']")).click();*/
		  }
}
}