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



public class NewsletterSteps {
	WebDriver driver;
	WebDriverWait wait;
	@Given("the user is the index")
	
	public void theUserIsInTheIndexPage2()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.mediamarkt.es");
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.id("pwa-consent-layer-accept-all-button")).click();
		
	}
	
	@When("the user clicks the suscribe button")
	public void theUserClicksSuscribeButton()
	{
		driver.findElement(By.className("iWuUrL")).click();
		driver.findElement(By.linkText("Suscríbete")).click();

	}
	
	@When("the user enters his name, last name and email")
	public void theUserEntersNameLastEmail()
	{
		driver.findElement(By.id("firstName")).sendKeys("Sergio");
		driver.findElement(By.id("lastName")).sendKeys("Gomez");
		driver.findElement(By.id("email")).sendKeys("feafeaeggasa@gmail.com");
		driver.findElement(By.className("bTrxxL")).click();
	}
	
	@When("the user clicks the send button")
	public void theUserClicksTheSendButton() throws InterruptedException
	{
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
	}
	
	@Then("appears the text You have successfully subscribed to this newsletter")
	public void theSuccessfullyAppears()
	{
		String title = driver.findElement(By.cssSelector("p[data-test='myaccount-status-description']")).getText();
		System.out.print(title);
		Assert.assertTrue(title.contains("feafeaeggasa@gmail.com"));
	}
	
}