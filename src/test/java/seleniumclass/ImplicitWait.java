package seleniumclass;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How stuff works");
		
		//autosuggestion handling
		List<WebElement> autosuggestions =driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(int i=0;i<autosuggestions.size();i++) {
			String Expsuggestion="how stuff works quiz";
			if(autosuggestions.get(i).getText().equalsIgnoreCase(Expsuggestion)) {
				autosuggestions.get(i).click();
			}
		}
		
		

	}

}
