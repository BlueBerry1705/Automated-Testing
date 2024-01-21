import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/AnarOfertaFlash.feature",glue= "steps")
public class RunAnarFinanciacio extends AbstractTestNGCucumberTests{

}