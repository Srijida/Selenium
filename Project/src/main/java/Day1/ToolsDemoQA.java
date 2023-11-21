package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToolsDemoQA {
	public static void sleep() {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();//method overriding
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		sleep();
		
		String url=driver.getCurrentUrl();
		System.out.println("Current URL : "+url);
		
		System.out.println();
		System.out.println("Display Details");
		
		WebElement name=driver.findElement(By.xpath("//input[@id='userName']"));
		name.sendKeys("Srijida");
		WebElement emailId=driver.findElement(By.xpath("//input[@id='userEmail']"));
		emailId.sendKeys("srijida@gmail.com");
		WebElement caddress=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		caddress.sendKeys("Palayam,Trivandrum");
		WebElement paddress=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		paddress.sendKeys("Palayam,Trivandrum");
		sleep();
		WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		sleep();
		WebElement name1=driver.findElement(By.xpath("//p[@id='name']"));
	    String n=name1.getText();
	    System.out.println(n);
	    
	    WebElement email1=driver.findElement(By.xpath("//p[@id='email']"));
	    String e=email1.getText();
	    System.out.println(e);
	    
	    WebElement CurrentAddress=driver.findElement(By.xpath("//p[@id='currentAddress']"));
	    String ca=CurrentAddress.getText();
	    System.out.println(ca);
	    
	    WebElement PermanentAddress=driver.findElement(By.xpath("//p[@id='permanentAddress']"));
	    String pa=PermanentAddress.getText();
	    System.out.println(pa);
	    
	    System.out.println();
	    System.out.println("SubString Values");
	    System.out.println(n.substring(5));
	    System.out.println(e.substring(6));
	    System.out.println(ca.substring(17));
	    System.out.println(pa.substring(20));
	    
	    System.out.println();
	    System.out.println("Entered Values");
	    String enteredName = name.getAttribute("value");
	    String enteredEmail = emailId.getAttribute("value");
	    String enteredCurremtAddress = caddress.getAttribute("value");
	    String enteredPermenentAddress = paddress.getAttribute("value");
	    System.out.println("Entered name:" + enteredName); 
	    System.out.println("Entered email:" + enteredEmail);
	    System.out.println("Entered caddress: " + enteredCurremtAddress);
	    System.out.println("Entered paddress:"+enteredPermenentAddress);
	    System.out.println();
	    
	    System.out.println("Test Case Result");
	    if (n.substring(5).equals(enteredName)&&
	    		e.substring(6).equals(enteredEmail)&&
	    		ca.substring(17).equals(enteredCurremtAddress)&&
	    		pa.substring(20).equals(enteredPermenentAddress)) {
	    System.out.println("Test case Passed");
	    } else {
	    System.out.println("Test case Failed");
	    }
	    } 
	    
	    


	    
	    
	    
	}

