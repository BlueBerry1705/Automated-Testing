import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/newsletter.feature",glue= "steps")
public class RunNewsletterTest extends AbstractTestNGCucumberTests{

}