package stepDefinitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import Pages.RedBus_PF;
//import Pages.RedBus_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RedbusClass {
	WebDriver driver;
	
	@Given("I am a user of the RedBus app")
	public void i_am_a_user_of_the_red_bus_app() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in");driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

	@When("I open the RedBus app")
	public void i_open_the_red_bus_app() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("I should see the RedBus home page")
	public void i_should_see_the_red_bus_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

//scenario1
@When("I enter {string} , {string} , {string}")
public void i_enter(String string, String string2, String string3) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   // driver.findElement(By.id("src")).sendKeys("Hyderabad");
	//driver.findElement(By.id("dest")).sendKeys("Kakinada");
	RedBus_PF bus = new RedBus_PF(driver);
	   bus.bordingPoint("Hyderabad");
	    bus.destination("Vijayawada");
	    bus.Day();
	   // bus.time();
	    bus.date_pick();
	//WebElement day = driver.findElement(By.id("onwardCal"));
	//day.click();
//	    WebElement nav =driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD']/following-sibling::div[2]"));
//		nav.click();
//        try {
//            Thread.sleep(2000);
//        }catch (Exception e){}
//        WebElement  date_31 = driver.findElement(By.xpath("//span[text()='7']"));
        //date_31.click();
	    
 
		

		//driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();
		//driver.findElement(By.xpath("(//div[@role='button'])[3]")).click();
		
	}

	@Then("I click on the search button")
	public void i_click_on_the_search_button() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//driver.findElement(By.id("search_button")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		RedBus_PF bus = new RedBus_PF(driver);
		bus.search();
//		WebElement  search_buses_button = driver.findElement(By.xpath("//button[text()='SEARCH BUSES']"));
//        search_buses_button.click();
	}

	
	//scenario2
    @Given("the user is on the RedBus home page")
	public void the_user_is_on_the_red_bus_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("the user selects the {string} option from the menu")
	public void the_user_selects_the_option_from_the_menu(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RedBus_PF bus = new RedBus_PF(driver);
		bus.Tickets();
		bus.List();
//		driver.findElement(By.xpath("//*[@class='AboutUs__AboutUsContainer-w9osof-0 hmZTra']"));
//		driver.findElement(By.xpath("//a[contains(text(),'Book Train Tickets')]")).click();
	}

	@Then("the user should see a list of available trains for the given route and date")
	public void the_user_should_see_a_list_of_available_trains_for_the_given_route_and_date() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	//Scenario 3
	@Given("I am on the RedBus home page")
	public void i_am_on_the_red_bus_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("I scroll down")
	public void i_scroll_down() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("I should see the {string} picture")
	public void i_should_see_the_picture(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RedBus_PF bus = new RedBus_PF(driver);
		bus.Picture();
		//driver.findElement(By.xpath("//*[@class='AppInstallSection__AppInstallContainer-sc-11kc14c-0 fAiJnC']")).click();
	}

	@Then("I should see scanner to download the app")
	public void i_should_see_scanner_to_download_the_app() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RedBus_PF bus = new RedBus_PF(driver);
		bus.Scan();
		//driver.findElement(By.xpath("//*[@id=\"homeV2-root\"]/div[3]/div[2]/div/div[2]/div[2]/div/div[1]/img")).click();
	}
	
	//Scenario 4
	@When("I scroll down to the Partnered with section")
	public void i_scroll_down_to_the_partnered_with_section() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RedBus_PF bus = new RedBus_PF(driver);
		bus.Partenered();
		//driver.findElement(By.xpath("//*[@class='RtcPartneredWith__RtcPartneredWithSection-sc-1fxl38k-0 iUUZuv']"));
	}

	@Then("I should see a list of RTCS displayed")
	public void i_should_see_a_list_of_rtcs_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RedBus_PF bus = new RedBus_PF(driver);
		bus.Rtcs();
		//driver.findElement(By.xpath("//*[@class='RtcPartneredWith__ViewAll-sc-1fxl38k-3 crqghW']")).click();
	}
	//Scenario 5

@Given("I am on the RedBus home page app")
public void i_am_on_the_red_bus_home_page_app() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}
	@When("I scroll down to the Private Operators section")
	public void i_scroll_down_to_the_private_operators_section() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RedBus_PF bus = new RedBus_PF(driver);
		bus.Operators();
		//driver.findElement(By.xpath("//*[@class='PrivatePartners__PrivatePartnerContainer-sc-2695bf-0 bLGySv']"));
	}

	@Then("I should see a list of travels displayed")
	public void i_should_see_a_list_of_travels_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RedBus_PF bus = new RedBus_PF(driver);
		bus.Travels();
		
	}

	@Then("I click on a specific travels")
	public void i_click_on_a_specific_travels() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RedBus_PF bus = new RedBus_PF(driver);
		//bus.Travels();
		//driver.findElement(By.xpath("//*[@class='PrivatePartners__ViewAll-sc-2695bf-2 dmxFif']")).click();
	}

	@Then("I should be directed to the private bus details page")
	public void i_should_be_directed_to_the_private_bus_details_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	//Scenario 6
	@When("I view the Global presence section")
	public void i_view_the_global_presence_section() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RedBus_PF bus = new RedBus_PF(driver);
		bus.Countries();
		//driver.findElement(By.xpath("//*[@class='GlobalPresence__GlobalPresenceSection-sc-1dii3hq-0 eHkZYY']")).click();
	}

	@Then("I should see a country selector dropdown")
	public void i_should_see_a_country_selector_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}


}
