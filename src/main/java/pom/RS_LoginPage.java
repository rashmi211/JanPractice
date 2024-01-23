package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RS_LoginPage {
	
	@FindBy(xpath="//input[@id='user-name']")         private WebElement userName;
	@FindBy(xpath="//input[@id='password']") 		  private WebElement password;
	@FindBy(xpath="//input[@value='Login']")          private WebElement loginButton;
	
	
	public RS_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String username) {
		userName.sendKeys(username);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public String validateLoginPageTitle(WebDriver driver) {
		return driver.getTitle();
	}
	
	public String validateHomePageTitle(WebDriver driver) {
		return driver.getTitle();
	}
	

}
