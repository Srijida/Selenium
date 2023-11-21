package PomTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	WebDriver driver;

    By dashBoard= By.xpath("//div[@class='oxd-topbar-header-title']");
    public Home(WebDriver driver){

        this.driver = driver;
      //Get the User name from Home Page
    }
        public String getHomePageDashboardText()
        {
           System.out.println(driver.findElement(dashBoard).getText());
         return    driver.findElement(dashBoard).getText();
         
         

        }
		


}
