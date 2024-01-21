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



public class AddShoppingCartSteps {
	WebDriver driver;
	WebDriverWait wait;
	@Given("the user is the index web")
	
	public void theUserIsInTheIndexPage3()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.mediamarkt.es");
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.id("pwa-consent-layer-accept-all-button")).click();
		
	}
	
	@When("the user clicks the television button")
	public void theUserClicksTelevisionButton() throws InterruptedException
	{
		driver.findElement(By.cssSelector("img[src='https://cms-images.mmst.eu/osyynfyvlyjc/2MeGJj1HkAc2z8Rza27ehr/ef924eb8aaf783472bda23f5cfabd96d/1.png?q=80&w=264']")).click();
		Thread.sleep(3000);
	}
	
	@When("the user clicks the añadir carrito button")
	public void theUserClicksAddButton() throws InterruptedException
	{
		driver.findElement(By.className("jCVDoJ")).click();
		Thread.sleep(3000);
	}
	
	@When("the user clicks the no gracias button")
	public void theUserClicksNoButton() throws InterruptedException
	{
		driver.findElement(By.className("eGOVTl")).click();
		Thread.sleep(3000);
	}
	
	@Then("appears the text Su producto fue añadido con éxito al carrito")
	public void theSuccessfullyAdd()
	{
		String title = driver.findElement(By.className("gFMzJu")).getText();
		System.out.print(title);
		Assert.assertTrue(title.contains("Su producto fue añadido con éxito al carrito"));
	}
	
}