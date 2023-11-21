package Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class StaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		// 1) Find total number of rows 
		List <WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		rows.size();
		System.out.println(rows.size());
		// 2) Find total number of coloumn
		List <WebElement> column = driver.findElements(By.xpath("//table[@name='BookTable']//tr[2]//td"));
		column.size();
		System.out.println(column.size());
		//3) Read specific row & column data
		String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[3]")).getText();
		System.out.println(value);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//4)Read data from all the rows & columns
		for(int i=2;i<=rows.size();i++)
		{
			for(int j=1;j<=column.size();j++)
			{
			String value1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[ "+i+"]//td["+j+"]")).getText();
			  System.out.println(value1);
			}
		}
		//5) Print book names whose author is Amit
		for(int k=2;k<=rows.size();k++) {
			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+k+"]//td[2]")).getText();
			if(author.equals("Amit")) {
				String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+k+"]//td[1]")).getText();
				  System.out.println(bookname);

			}
				

	}

}
}
