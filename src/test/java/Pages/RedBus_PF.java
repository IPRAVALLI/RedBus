package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedBus_PF {
	WebDriver driver;
	public RedBus_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//scenario 1
    @FindBy(id="src") WebElement from;
    @FindBy(id="dest") WebElement to;
    @FindBy(id="onwardCal")WebElement day;
   // @FindBy(xpath="//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD']/following-sibling::div[2]") WebElement date;
    @FindBy(xpath="//span[text()='7']")WebElement date_31;
    @FindBy(xpath="//button[text()='SEARCH BUSES']") WebElement search;
    public void source(String string) {
    	System.out.println(string);
    	from.sendKeys("Hyderabad");
    	
    }
    public void destination(String string) {
    	System.out.println(string);
    	to.sendKeys("Visakhapatnam");
    }
    public void Day() {
    	day.click();
    }
//    

    public void Date_31() {
    	date_31.click();
    }
    public void Search() {
    	
    	search.click();
    }
    //Scenario 2
    @FindBy(xpath="//*[@class='AboutUs__AboutUsContainer-w9osof-0 hmZTra']") WebElement tickets;
    @FindBy(xpath="//a[contains(text(),'Book Train Tickets')]") WebElement list;
    public void Tickets() {
    	tickets.click();
    }
    public void List() {
    	list.click();
    }
    //Scenario 3
    @FindBy(xpath="//*[@class='AppInstallSection__AppInstallContainer-sc-11kc14c-0 fAiJnC']") WebElement picture;
    @FindBy(xpath="//img[@class='QrCodeAndPlaystoreSection__QrImg-sc-1xehksy-3 bGbiZT']") WebElement scan;
    public void Picture() {
    	picture.click();
    }
    public void Scan() {
    	scan.click();
    }
    //Scenario 4
    @FindBy(xpath="//*[@class='RtcPartneredWith__RtcPartneredWithSection-sc-1fxl38k-0 iUUZuv']") WebElement partenered;
    @FindBy(xpath="//*[@class='RtcPartneredWith__ViewAll-sc-1fxl38k-3 crqghW']") WebElement rtcs;
    public void Partenered() {
    	partenered.click();
    }
    public void Rtcs() {
    	rtcs.click();
    }
    //Scenario 5
    @FindBy(xpath="//*[@class='PrivatePartners__PrivatePartnerContainer-sc-2695bf-0 bLGySv']") WebElement operators;
    @FindBy(xpath="//*[@class='PrivatePartners__ViewAll-sc-2695bf-2 dmxFif']") WebElement travels;
    public void Operators() {
    	operators.click();
    }
    public void Travels() {
    	travels.click();
    }
    //Scenario 6
    @FindBy(xpath="//*[@class='GlobalPresence__GlobalPresenceSection-sc-1dii3hq-0 eHkZYY']") WebElement countries;
    public void Countries() {
    	countries.click();
    }
    
    
}
