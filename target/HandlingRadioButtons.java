package seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@id, 'u_0_0')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"1\"]")).click();
		System.out.println(driver.findElement(By.xpath("//input[@value=\"1\"]")).isEnabled());
		driver.close();
		
	}

}
