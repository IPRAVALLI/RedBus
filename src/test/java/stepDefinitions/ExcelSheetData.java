package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.ExcelData;
import Pages.RedBus_PF;

public class ExcelSheetData {
	WebDriver driver;
	@DataProvider(name="testdata")
	public Object getData() {
		ExcelData utils=new ExcelData("C:\\excelsheet\\RedbusExcelReader.xlsx");
		int rows=utils.getRowCount(0);
		Object[][] obj=new Object[rows][2];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<2;j++) {
				obj[i][j]=utils.getdata(0,i+1, j);
				System.out.println(obj[i][j]);
			}
		}
		return obj;
	}
	@BeforeMethod public void before1() {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in");driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test(dataProvider="testdata")
	public void pickup(String From, String To) throws InterruptedException {
		RedBus_PF obj1=new RedBus_PF(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		obj1.data(From, To);
		obj1.Day();
		obj1.date_pick();
		obj1.search();
		
		
	}
}