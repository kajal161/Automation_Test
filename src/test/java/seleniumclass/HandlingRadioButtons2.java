package seleniumclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtons2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@id, 'u_0_0')]")).click();
		Thread.sleep(2000);
		List<WebElement> radioButton=driver.findElements(By.xpath("//input[@type='radio']"));
		//)
System.out.println("number of radio buttons" + radioButton.size());
Thread.sleep(2000);
radioButton.get(0).click();
System.out.println(radioButton.get(0).isSelected());
driver.close();
	}

}
//This is not prefeble because it is hard code