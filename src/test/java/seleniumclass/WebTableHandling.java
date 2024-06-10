package seleniumclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> webtable = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]//a"));
		for(int i=0;i<webtable.size();i++) {
			String Exptext="PMC Fincorp";
			if(webtable.get(i).getText().equalsIgnoreCase(Exptext)) {
				webtable.get(i).click();
				break;
			}

	}

	}
}