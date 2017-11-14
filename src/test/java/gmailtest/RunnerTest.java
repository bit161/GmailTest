package gmailtest;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/java/gmailtest",
        glue = "src/test/java/step_definitions",
        tags = "@all",
        dryRun = false,
        strict = false,
        snippets = SnippetType.UNDERSCORE

)
public class RunnerTest {
}//