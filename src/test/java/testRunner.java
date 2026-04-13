import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="C://Users//Dell//IdeaProjects//CucumberLoginProj//src//test//resources//feature.feature",
        glue="stepDefinitionLogin"
)

public class testRunner {
}
