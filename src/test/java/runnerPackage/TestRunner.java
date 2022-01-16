/**
 * Design Pattern used - Page Object Model (POM) by using Page Factory. 
 * The TestRunner.Java file is used to run the run the step defination file steps
 *
 * @author  Sachin Nagare
 * @version 1.0
 * @since   2020-01-16
 */

package runnerPackage;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features"
		,glue={"stepDefinations"}
,tags="@smoke"
)

public class TestRunner {

}
