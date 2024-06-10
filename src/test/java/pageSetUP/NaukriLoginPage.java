package pageSetUP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaukriLoginPage {
	WebDriver driver;
	
	@FindBy(id="login_Layer")
	 WebElement loginTab;
	
	@FindBy(xpath="//input[@placeholder=\"Enter your active Email ID / Username\"]")
	WebElement emailField;
	
	@FindBy(xpath="//input[@placeholder=\"Enter your password\"]")
	WebElement passwordField;
	
	@FindBy(xpath="//button[@class=\"btn-primary loginButton\"]")
	WebElement loginButton;
	
	@FindBy(xpath="//a[@title=\"Jobseeker Register\"]")
	WebElement registerTab;
	
	public NaukriLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickLoginTab() {
		loginTab.click();
	}
	
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	public void enterPassword(String Password) {
		passwordField.sendKeys(Password);
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	public boolean isloginTabDisplayed() {
		return loginTab.isDisplayed();
	}
	public boolean isEmailfieldDisplayed() {
		return emailField.isDisplayed();
	}
	public boolean ispasswordfieldDisplayed() {
		return passwordField.isDisplayed();
	}
	public boolean isloginbuttonDisplayed() {
		return loginButton.isDisplayed();
	}
	public boolean isregisterTabDisplayed() {
		return registerTab.isDisplayed();
	}
	

}
