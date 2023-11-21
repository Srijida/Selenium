package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMHomepage {
	WebDriver driver;

	@FindBy( xpath="//h6[text()='Dashboard']")
	WebElement homePageUserName;    

	    

	    public OrangeHRMHomepage(WebDriver driver){

	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    //Get the User name from Home Page

	        public String getHomePageDashboardUserName(){
	            return    homePageUserName.getText();

	        }


}
