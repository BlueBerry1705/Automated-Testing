import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/addshoppingcart.feature",glue= "steps")
public class RunAddShoppingCartTest extends AbstractTestNGCucumberTests{

}