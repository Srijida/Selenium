package Day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ExcelRead {
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	   public static void sleep() {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
	}

	
	public static void main(String[] args) throws IOException,InterruptedException {
		//WebDriverManager.chromedriver().setup();
		File file=new File("C:\\Users\\ADMIN\\eclipse-workspace\\Project\\src\\main\\resources\\trial excel\\Trialxcel.xlsx");
		
        FileInputStream inputStream =new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(inputStream);
		XSSFSheet sheet=wb.getSheetAt(0); 
		//String cellValue=sheet.getRow(0).getCell(0).getStringCellValue();
		//System.out.println(cellValue);
		
		int rowCount =sheet.getPhysicalNumberOfRows();
		for(int i=1;i<rowCount;i++) {
			XSSFRow row =sheet.getRow(i);
			
			int cellCount=row.getPhysicalNumberOfCells();
			for(int j=0;j<cellCount;j++) {
			XSSFCell cell=row.getCell(j);
			System.out.println(getCellValue(cell));
		}
			System.out.println();
			
		}
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		String url=driver.getCurrentUrl();
		System.out.println("Current URL : "+url);
		WebElement name=driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement emailId=driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement caddress=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		WebElement paddress=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		sleep();
		for(int i=1;rowCount<i;i++) {
		name.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
		emailId.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
		caddress.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
		paddress.sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
		
		sleep();
		WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
		sleep();
		wb.close();
		inputStream.close();
		
		}
	}
	public static String getCellValue(XSSFCell cell) {
		switch(cell.getCellType()) {
		
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		case STRING:
			return cell.getStringCellValue();
		default:
			return cell.getStringCellValue();
			
			
		
		}
		
		
		
		
	
		

	}
}
