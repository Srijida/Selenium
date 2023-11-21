package Day1;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		
		WebElement departure=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select dep=new Select(departure);
		dep.selectByVisibleText("Philadelphia");
		
		WebElement arrival=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select arvl=new Select(arrival);
		arvl.selectByVisibleText("Dublin");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List <WebElement> price=driver.findElements(By.xpath("//table[@class='table']//td[6]"));
		System.out.println(price.size());
		ArrayList<String> prices=new ArrayList<String>();
		for(int i=0;i<price.size();i++){
		//System.out.println(price.get(i).getText());
			String priceInt = String.valueOf(price.get(i).getText().replaceAll("\\$", ""));
		prices.add(priceInt);
		System.out.println(priceInt);
		System.out.println();
		}
		String minPrice = Collections.min(prices);
		System.out.println("Min Price is "+minPrice);
		
		//compare all the prices with lowest price and click the corresponding choose button
				for(int i=0;i<price.size();i++){
					String priceInt1 = String.valueOf(price.get(i).getText().replaceAll("\\$", ""));
				//String price1 = price.get(i).getText();
				System.out.println(priceInt1);
				if(priceInt1.equals(minPrice)){
					List<WebElement> choose = driver.findElements(By.xpath("//input[@value='Choose This Flight']"));
					choose.get(i).click();
				break;

			}

		}
				driver.findElement(By.xpath("//input[@name='inputName']")).sendKeys("Srijida");
				driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Thampuranmukku");
				driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Tvm");
				driver.findElement(By.xpath("//input[@name='state']")).sendKeys("kerala");
				driver.findElement(By.xpath("//input[@name='zipCode']")).sendKeys("695034");
				driver.findElement(By.xpath("//input[@name='creditCardNumber']")).sendKeys("7012842593");
				driver.findElement(By.xpath("//input[@name='nameOnCard']")).sendKeys("Srijida");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				
				
		        WebElement Message = driver.findElement(By.tagName("h1"));
		        String message = Message.getText();

		        if (message.equals("Thank you for your purchase today!")) {
		            System.out.println("Test Case Passed");
		        } else {
		            System.out.println("Test Case Failed");
		        }

		      


		

		

	}

}
