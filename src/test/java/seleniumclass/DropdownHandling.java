package seleniumclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//navigate to facebook
		driver.get("https://www.facebook.com/");
		//click on create new account button
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		
		//1st way
		List<WebElement> birthmonth = driver.findElements(By.xpath("//select[(@id='month')]//option"));
		System.out.println("number of dropdown value " + birthmonth.size());
		birthmonth.get(8).click();
		
		//2nd way
		WebElement birthmonth1=driver.findElement(By.xpath("//select[(@id='month')]")); //stores node
		Select month =new Select(birthmonth1);
		month.selectByVisibleText("Apr");//Apr
		month.selectByValue("10");//Oct
		month.selectByIndex(5);//May
		System.out.println(month.getFirstSelectedOption().getText());// Returns the current value
		
		//3rd way
		List<WebElement> dropdown=month.getOptions();
		String monthname="Sep";
		for(int i=0;i<dropdown.size();i++) {
			if(dropdown.get(i).getText().equalsIgnoreCase(monthname));
			dropdown.get(i).click();
			//System.out.println("Desired month clicked");
			
			//4th way
			birthmonth1.sendKeys("Jul");
			
			//5th way
			driver.findElement(By.xpath("//select[@id='month']")).sendKeys("May");
		}
		

	}

}
