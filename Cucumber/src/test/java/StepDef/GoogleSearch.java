package StepDef;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
public class GoogleSearch {

	WebDriver driver = null;
	@Given("Browser is open")
	public void browser_is_open() {
		String projectPath = System.getProperty("user.dir");
		System.out.print(projectPath);
		 System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/driver/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
				 

	}

	@And("User is in google search page")
	public void user_is_in_google_search_page() {
		driver.get("https://www.google.com");

	}

	@When("User enters a text in search")
	public void user_enters_a_text_in_search() {
		driver.findElement(By.name("q")).sendKeys("selenuim");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@And("hit enter")
	public void hit_enter() {
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

	@Then("Search results will display")
	public void search_results_will_display() {
		driver.getPageSource().contains("SeleniumHQ Browser Automation");
		driver.quit();

	}

}
