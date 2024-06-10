package seleniumclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://money.rediff.com/gainers");
		
		//Heading print
		List<WebElement> headingvalue = driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th"));
		
		for(int i=0;i<headingvalue.size();i++) {
			System.out.print(headingvalue.get(i).getText()+"    ");
			
		}
System.out.println();
List<WebElement> entity1 = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]//a"));
List<WebElement> entity2 = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[2]"));
List<WebElement> entity3 = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[3]"));
List<WebElement> entity4 = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[4]"));
List<WebElement> entity5 = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[5]//font"));

String expentity="Angel Fibers";
for(int a=0;a<entity1.size();a++) {
	if(entity1.get(a).getText().equalsIgnoreCase(expentity)) {
		
		//value print
		System.out.print(entity1.get(a).getText()+"   ");
		System.out.print(entity2.get(a).getText()+"   ");
		System.out.print(entity3.get(a).getText()+"   ");
		System.out.print(entity4.get(a).getText()+"   ");
		System.out.print(entity5.get(a).getText()+"   ");
		break;
	}
}
	}

}
