package runnerPkg;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// 1. define running with cucumber class -> @RunWith
@RunWith(Cucumber.class)

// 2. Cucumber options to use multiple options -> @CucumberOptions
@CucumberOptions(features="C:\\Users\\User\\eclipse-workspace\\AugustCucumberSession\\src\\test\\java\\features",
				 glue="step_definitions",
				 monochrome=true,
				 plugin={"pretty", "html:target/ExecutionReport"},
				 tags="@Release1.0")

// 1. Continue working in TDD POM framework - same application
// 2. Build BDD POM framework - same application

public class Runner {

}
