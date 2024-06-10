package seleniumclass;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.w3schools.com/");
driver.findElement(By.xpath("(//a[@class='w3-button ga-fp tryit-button'])[1]")).click();

//Get the total number of tabs/window
Set<String> allWindowID = driver.getWindowHandles();//extraction of the window
System.out.println(allWindowID);//PRINT ID

Iterator<String> windowID= allWindowID.iterator();//Store the extracted window
String win1 =windowID.next();//Return 1st window id
String win2 =windowID.next();//return 2nd window id

//print the title of parent tab
driver.switchTo().window(win1);
System.out.println("parent window id" + win1);
System.out.println(driver.getTitle());

//url of child tab
driver.switchTo().window(win2);
System.out.println("child tab id" + win2);
System.out.println(driver.getCurrentUrl());

	}

}
