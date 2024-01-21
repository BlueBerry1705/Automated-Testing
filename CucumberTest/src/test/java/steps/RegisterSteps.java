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



public class RegisterSteps {
	WebDriver driver;
	WebDriverWait wait;
	@Given("the user is the index menu")
	
	public void theUserIsInTheIndexPage4()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.mediamarkt.es");
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.id("pwa-consent-layer-accept-all-button")).click();
		
	}
	
	@When("the user clicks the profile button")
	public void theUserClicksTelevisionButton()
	{
		driver.findElement(By.cssSelector("button[data-test='myaccount-dropdown-button']")).click();
	}
	
	@When("the user clicks the registro button")
	public void theUserClicksRegistroButton() throws InterruptedException
	{
		driver.findElement(By.id("myaccount-dropdown-register-button")).click();
		Thread.sleep(3000);
	}
	
	@When("the user enters an email")
	public void theUserEntersEmail()
	{
		driver.findElement(By.id("email")).sendKeys("aetsjiuutfujfythtr@gmail.com");
	}
	
	@When("the user clicks the enviar codigo button")
	public void theUserClicksSendButton() throws InterruptedException
	{
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
	}
	
	@Then("appears the text Comprueba tu buzón de correo")
	public void ConfirmEmail()
	{
		String title = driver.findElement(By.cssSelector("p.sc-f1f881c4-0.evTnGL span[data-cs-mask='true']")).getText();
		System.out.print(title);
		Assert.assertTrue(title.contains("aetsjiuutfujfythtr@gmail.com"));
	}
	
	@When("the user enters bad email")
	public void theUserEntersBadEmail()
	{
		driver.findElement(By.id("email")).sendKeys("etsjiuutfujfythtr");
	}
	
	@Then("appears the text correo invalido")
	public void correoInvalido()
	{
		String title = driver.findElement(By.cssSelector("[data-test='email__error']")).getText();
		System.out.print(title);
		Assert.assertTrue(title.contains("añade un correo"));
	}
	
	
}