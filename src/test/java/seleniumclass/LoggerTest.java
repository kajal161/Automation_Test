package seleniumclass;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoggerTest {
	public static Logger log;

	public static void main(String[] args) {
		log = LogManager.getLogger(LoggerTest.class);
		WebDriver driver=new ChromeDriver();
		log.info("chrome launched");
		driver.manage().window().maximize();
		log.info("Maximize the window");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		log.info("implicit wait");
		driver.get("https://www.facebook.com/");
		log.info("URL navigated");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		log.info("Email entered");
		
	
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("passContainer")));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd");
		log.info("password entered");
		driver.quit();
		log.info("Browser closed");

	}

}
