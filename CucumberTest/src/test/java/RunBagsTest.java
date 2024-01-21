import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/searchbags.feature",glue= "steps")
public class RunBagsTest extends AbstractTestNGCucumberTests{

}
