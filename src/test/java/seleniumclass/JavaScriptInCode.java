package seleniumclass;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptInCode {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//navigate to facebook
		driver.get("https://www.facebook.com/");
		
		//javascript executor interface
		JavascriptExecutor newdriver = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		newdriver.executeScript("document.getElementById('email').value='abc@gmail.com'");
		Thread.sleep(2000);
		newdriver.executeScript("document.getElementById('pass').value='abcd'");
		
		//scroll down
		Thread.sleep(2000);
		newdriver.executeScript("window.scrollBy(0,300)");
		
		//scroll up
		Thread.sleep(2000);
		newdriver.executeScript("window.scrollBy(0,-300)");
		
	}

}
