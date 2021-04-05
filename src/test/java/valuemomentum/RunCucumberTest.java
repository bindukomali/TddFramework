package valuemomentum;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\valuemomentum\\feature",plugin= {"pretty"})
public class RunCucumberTest {

 

}