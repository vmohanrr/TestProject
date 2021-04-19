package StepDef;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
public class CRMLoginStepDef {
	WebDriver driver = null;
	@Given("user is in login page")
	public void user_is_in_login_page() {
		String projectPath = System.getProperty("user.dir");
		System.out.print(projectPath);
		 System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/driver/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();	
		 driver.get("https://www.freecrm.com");
	//	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("Title of page is free CRM")
	public void title_of_page_is_free_CRM() {
		String title = driver.getTitle();
		Assert.assertEquals("#1 Free CRM customer relationship management software cloud", title);
	}

	@And("User enters username and password")
	public void user_enters_username_and_password() {
		String title = driver.getTitle();
		Assert.assertEquals("#1 Free CRM customer relationship management software cloud", title);
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		String title = driver.getTitle();
		Assert.assertEquals("#1 Free CRM customer relationship management software cloud", title);
	}

	@Then("User is on homepage")
	public void user_is_on_homepage() {
		String title = driver.getTitle();
		Assert.assertEquals("#1 Free CRM customer relationship management software cloud", title);
		driver.quit();

	}

}
