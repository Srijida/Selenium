package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();//method overriding
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url=driver.getCurrentUrl();
		System.out.println("url" +url);
		//System.out.println(driver.getTitle());
		//driver.close();
		//driver.quit();
		//driver.findElement(By.id("username"));
		WebElement username=driver.findElement(By.name("username"));
		//boolean status=username.isDisplayed();
		
		username.sendKeys("Admin");
		//driver.findElement(By.id("password"));
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");
	    WebElement login =driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		System.out.println(driver.getTitle());
		String expectedTitle="OrangeHRM";
		String title=driver.getTitle();
		if(title.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Title Matched");
		}else {
			System.out.println("Not Matching");
		}
		
		//driver.close();
	}

}
