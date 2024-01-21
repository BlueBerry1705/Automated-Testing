package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class SearchBagsSteps {
	WebDriver driver;
	WebDriverWait wait;
	@Given("the user is the index page")
	
	public void theUserIsInTheIndexPage1()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.mediamarkt.es");
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.id("pwa-consent-layer-accept-all-button")).click();
		
	}
	
	@When("the user enters bags in the search bar")
	public void theUserEntersBagsInTheSearchBar()
	{
		driver.findElement(By.id("search-form")).sendKeys("ordenador");
	}
	
	@When("the user clicks the search button")
	public void theUserClicksTheSearchButton() throws InterruptedException
	{
		driver.findElement(By.className("sc-fcb74dff-0")).click();
		Thread.sleep(3000);
	}
	
	@Then("the bags list appears")
	public void theBagsListAppears()
	{
		
		String title = driver.findElement(By.className("fWwqjO")).getText();
		Assert.assertTrue(title.contains("ordenador"));
	}
	
}
