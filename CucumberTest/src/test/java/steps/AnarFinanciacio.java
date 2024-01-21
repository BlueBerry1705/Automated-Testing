package steps;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AnarFinanciacio {
	
	WebDriver driver;
	WebDriverWait wait;
	@Given("user is the index page")
	
	public void theUserIsInTheIndexPage2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.mediamarkt.es");
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.id("pwa-consent-layer-accept-all-button")).click();
		Thread.sleep(3000);
	
	}
	@When("user go to financiacion")
	public void UserGoToFinanciacion()
	{
		driver.findElement(By.cssSelector(".sc-f1f881c4-0.icEZxN.sc-9b302e3c-0.gSkKou")).click();
		
	}
	@Then("Financiacion a tu alcance")
	public void FinanciacionATuAlcance()
	{
		String title = driver.findElement(By.xpath("//h1[text()='Ofertas flash']")).getText();

		Assert.assertTrue(title.contains("Ofertas"));
	}
}
