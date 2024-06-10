package seleniumclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumclass1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//launch the browser
		driver.get("https://www.google.com");//open the url
		Thread.sleep(2000);//stops the operation for the given time
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all the cookies
		driver.navigate().to("https://www.youtube.com");//navigate to the provided url
		driver.navigate().refresh();//refresh the page
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		System.out.println (driver.getTitle());
		driver.close();//close the current window
		driver.quit();//close all the window
		
//)
		
	

}
}