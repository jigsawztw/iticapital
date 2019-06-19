import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author Nikolay Streltsov on 02.09.2018
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/stories/",
        glue = {"com.aplana.chameleon"},
        plugin = {"pretty"}
)
public class TestRunner {

}
