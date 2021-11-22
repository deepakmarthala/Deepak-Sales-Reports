package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "src/test/java/features", //for all tests which are there in feature
	    glue="stepDefinitions",tags="@Reports")
public class testRunner {

}