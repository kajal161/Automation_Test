package seleniumclass;
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ObjectRepository {

	public static void main(String[] args) throws Exception {
		//specify the location of the properties file
		File src1 =new File("C:\\Users\\DELL\\eclipse-workspace\\seleniumclass\\Repository\\config.properties");
		File src2 =new File("C:\\Users\\DELL\\eclipse-workspace\\seleniumclass\\Repository\\locator.properties");
		File src3 =new File("C:\\Users\\DELL\\eclipse-workspace\\seleniumclass\\Repository\\testdata.properties");
		
		//FileInputStream class loads the file
		FileInputStream config1 =new FileInputStream(src1);
		FileInputStream locator1 =new FileInputStream(src2);
		FileInputStream testdata1 =new FileInputStream(src3);
		
		//properties class reads the properties file
		Properties config2=new Properties();
		config2.load(config1);//reads config.properties
		Properties locator2=new Properties();
		locator2.load(locator1);
		Properties testdata2=new Properties();
		testdata2.load(testdata1);
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to facebook
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(config2.getProperty("URL"));
		driver.findElement(By.xpath(locator2.getProperty("Email"))).sendKeys(testdata2.getProperty("TestDataEmail"));
		driver.findElement(By.xpath(locator2.getProperty("Password"))).sendKeys(testdata2.getProperty("TestDataPassword"));
		

	}

}
