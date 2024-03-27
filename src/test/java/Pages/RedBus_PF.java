package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RedBus_PF {
	WebDriver driver;
	public RedBus_PF() {
		this.driver=driver;
	}
	//scenario 1
    @FindBy(id="src") WebElement from;
    @FindBy(id="dest") WebElement to;
    @FindBy(xpath="//i[@class='sc-cSHVUG NyvQv icon icon-datev2']") WebElement date;
    @FindBy(id="search_button") WebElement search;
    public void source() {
    	
    }
}
