package Day1;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// 1) Find total number of rows 
		
	     int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		 System.out.println("Total number of rows in the table : "+rows);
		 System.out.println("========================");
		// 2) Find total number of coloumn
		 
		 int coloums=driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
		 System.out.println("Total number of coloums in the table : "+coloums);
		 System.out.println("========================");
		//3) Read specific row & column data
		 
		 String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[3]")).getText();
	     System.out.println("The value is :"+value);
	     System.out.println("========================");
	   //4)Read data from all the rows & columns
	     System.out.println("======Data in the table======");
	       for(int r=2;r<=rows;r++) 
	     {
	    	 for(int c=1;c<=coloums;c++) 
	    	 {
	    		 String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
	    	     System.out.println(data +"   ");
	    	    
	    		 
	    	 }
	    	 System.out.println();
	    	 
	     }
	       System.out.println("========================");
	     //5) Print book names whose author is Amit
	       
	       for(int i=2;i<=rows;i++) {
				String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
				if(author.equals("Amit")) {
					String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
					  System.out.println("Bookwritten by Amit is :"+bookname);

				}
			
					

		}
	       System.out.println("========================");
	   //6.Print book name whose prices are 300
	       
	       
	       for(int i=2;i<=rows;i++) {
				String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();
				if(price.equals("300")) {
					String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
					  System.out.println("Book with price 300 :"+bookname);

				}
			
	       }
	       System.out.println("========================");
	  //7.Print subjects whose author is Mukesh
					
				for(int k=2;k<=rows;k++) {
					String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+k+"]//td[2]")).getText();
					if(author.equals("Mukesh")) {
						String subject = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+k+"]//td[3]")).getText();
						  System.out.println("Subjects whose author is Mukesh is :"+subject);

					}
					
       
	}
	System.out.println("========================");		
	//8.print price of the book selenium	
				
				for(int k=2;k<=rows;k++) {
					String subject = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+k+"]//td[3]")).getText();
					if(subject.equals("Selenium")) {
						String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+k+"]//td[4]")).getText();
						  System.out.println("Price of the  book selenium :"+price);

					}
					
     
	}
	System.out.println("========================");	
	//9.Total price of all thge books
				
				
				int sum_price=0;
				for(int s=2;s<=rows;s++) {
				
                 String rate=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+s+"]//td[4]")).getText();
                
					sum_price= sum_price+Integer.parseInt(rate);
					
					 
				}
				 System.out.println("total price: "+sum_price);
}
}

