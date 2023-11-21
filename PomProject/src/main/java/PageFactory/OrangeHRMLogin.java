package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLogin {
	WebDriver driver;

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
     WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
     WebElement login;

    @FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']")
    WebElement text;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
     WebElement invalid;

    public OrangeHRMLogin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String strusername) {
        username.sendKeys(strusername);
    }

    public void setPassword(String strpassword) {
        password.sendKeys(strpassword);
    }

    public void clickLogin() {
        login.click();
    }

    public String getText() {
        return text.getText();
    }

    public void loginToOrangeHRM(String strusername, String strpassword) {
        setUsername(strusername);
        setPassword(strpassword);
        clickLogin();
    }

    public String getErrorMessage() {
        return invalid.getText();
    }

}