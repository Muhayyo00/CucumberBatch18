package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//we need RunWith options to run cucumber with junit
@RunWith(Cucumber.class)
//cucumber options decide what to execute, where to execute
@CucumberOptions(
        //features we use to provide the path of the feature files
        features = "src/test/resources/features/",
        //glue is the keyword we use to find the gherkin step def
        //we provide  the path of "steps" package where we have all step definitions
        glue = "steps",//glue is used to stick the feature path with steps package
        //dry run stops the actual execution when set to true
        //it will scan all the steps definitions and provide if there is any step def missing
        dryRun = false,
        //tags = "@sprint1 and @sprint4"
        //  tags = "@sprint1 or @sprint5 or @sprint2 or @sprint6"
        tags = "@datatable",
        //{"pretty"}-is used to print our code in console pretty (i.e.detailed and organized)
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "rerun:target/failed.txt"}
        //rerun plugin generates the txt file of all failed test cases
)

public class RunnerClass {

}