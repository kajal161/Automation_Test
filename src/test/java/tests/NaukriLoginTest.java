package tests;

import org.testng.Assert;
import org.testng.annotations.*;

import pageSetUP.NaukriLoginPage;
import utils.BaseTest;

public class NaukriLoginTest extends BaseTest{
	
	@Test
	public void testUrLValidation() {
		String expectedUrl="https://www.naukri.com/";
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,expectedUrl, "URL Validation failed");
		
	}
	@Test
	public void testTitleValidation() {
		NaukriLoginPage loginpage=new NaukriLoginPage(driver);
		String expectedTitle="Jobs-Requirement-Job Search-Employment-job Vacancies";
		String actualTitle=loginpage.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Title validation failed");
	}
	@Test
	public void testloginTab() {
		NaukriLoginPage loginpage=new NaukriLoginPage(driver);
		Assert.assertTrue(loginpage.isloginTabDisplayed(),"Login tab is not displayed");
}
	@Test
	public void testinputField() {
		NaukriLoginPage loginpage=new NaukriLoginPage(driver);
		loginpage.clickLoginTab();
		Assert.assertTrue(loginpage.isEmailfieldDisplayed(),"Email field is not displayed");
		Assert.assertTrue(loginpage.ispasswordfieldDisplayed(),"password field is not displayed");
	}
	@Test
	public void testloginbutton() {
		NaukriLoginPage loginpage=new NaukriLoginPage(driver);
		loginpage.clickLoginTab();
		Assert.assertTrue(loginpage.isloginbuttonDisplayed(),"login button is not displayed");;
	}
	@Test
	public void testregistertab() {
		NaukriLoginPage loginpage=new NaukriLoginPage(driver);
		Assert.assertTrue(loginpage.isregisterTabDisplayed(),"register tab is not displayed");
	}

	
	
	
	

}
