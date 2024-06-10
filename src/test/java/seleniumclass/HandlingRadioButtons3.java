package seleniumclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingRadioButtons3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@id, 'u_0_0')]")).click();
		Thread.sleep(2000);
		List<WebElement> radioButton=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("number of radio buttons" + radioButton.size());
		String expradiobutton="Female";
		for(int i=0;i<radioButton.size();i++) {
			if(radioButton.get(i).getText().equalsIgnoreCase(expradiobutton));
			radioButton.get(i).click();
			Thread.sleep(2000);
			System.out.println("radio button is clicked");
			break;
				
		}
driver.close();
	}

}
