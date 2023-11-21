package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resgister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println(male_rd.isSelected());
		male_rd.click();
		System.out.println(male_rd.isSelected());
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println(female_rd.isSelected());
		female_rd.click();
		System.out.println(female_rd.isSelected());
		

	}

}
