package seleniumclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		//specifying the location
		File src = new File("C:\\Users\\DELL\\eclipse-workspace\\seleniumclass\\Excel\\New Microsoft Office Excel Worksheet.xlsx");
		
		//load file
		FileInputStream workbook = new FileInputStream(src);
		
		//load workbook
		XSSFWorkbook wb = new XSSFWorkbook(workbook);
		//load sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		System.out.println(sheet.getSheetName());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		
		System.out.println(sheet.getRow(2).getCell(0).getNumericCellValue());
		double cellvalue=sheet.getRow(2).getCell(0).getNumericCellValue();
		System.out.println((int)cellvalue);
		
		//total no of row
		System.out.println(sheet.getPhysicalNumberOfRows());
		
		//Total no of column
		System.out.println(sheet.getRow(0).getPhysicalNumberOfCells());
		
		//Fetching value from excel to url
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to facebook
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		String email=sheet.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		
		

	}

}
