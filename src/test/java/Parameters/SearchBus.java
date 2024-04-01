package Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class SearchBus {

		  @Test(dataProvider = "exceldata")
		  
		  public void login(String source,String destination) throws InterruptedException {
			  WebDriver driver;
			  ChromeOptions options= new ChromeOptions();
				options.addArguments("--disable-notifications");
				driver = new ChromeDriver(options);
			  driver.manage().window().maximize();
		      driver.navigate().to("https://www.redbus.in");
		      driver.findElement(By.id("src")).sendKeys(source);
		  	  driver.findElement(By.id("dest")).sendKeys(destination);
		  	  WebElement day = driver.findElement(By.id("onwardCal"));
			  day.click();
			  WebElement  date_31 = driver.findElement(By.xpath("//span[text()='8']"));
		      date_31.click();
		      Thread.sleep(5000);
		      WebElement  search_buses_button = driver.findElement(By.id("search_button"));
	          search_buses_button.click();
		  }
		 @Test
		 @DataProvider(name="exceldata")
		 public Object[][] a() {
				 ExcelReader obj = new ExcelReader("C:\\excelsheet\\RedbusExcelReader.xlsx");
				 int rows = obj.getrowcount(0);
				 System.out.println(rows);
				 Object[][] logindetails = new Object[rows][2];
				 for(int i=0; i<rows;i++) {
					 for(int j=0;j<2;j++)
					logindetails[i][j]=obj.getCellData(0, i+1, j);
					 
					
				 }
				 
				 return logindetails;
				 
		}
		   
		}


