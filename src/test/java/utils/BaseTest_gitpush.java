package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest_gitpush {

	protected WebDriver driver;
	
	@BeforeMethod
	public void setup() {
	 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.naukri.com/");
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		if (driver !=null) {
			driver.quit();;
		}
	}
}
