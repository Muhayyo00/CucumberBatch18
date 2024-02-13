package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class FailedRunnerClass {
    @RunWith(Cucumber.class)
//cucumber options decide what to execute, where to execute
    @CucumberOptions(
            //features we use to provide the path of the feature files

            features = "@target/failed.txt",
            //whenever we want to call a file from target package, we use @ sign

            //glue is the keyword we use to find the gherkin step def
            //we provide  the path of "steps" package where we have all step definitions
            glue = "steps",//glue is used to stick the feature path with steps package
            //dry run stops the actual execution when set to true
            //it will scan all the steps definitions and provide if there is any step def missing
            //dryRun = false,
            //tags = "@sprint1 and @sprint4"
            //  tags = "@sprint1 or @sprint5 or @sprint2 or @sprint6"
            //tags = "@carlos",
            //{"pretty"}-is used to print our code in console pretty (i.e.detailed and organized)
            plugin = {"pretty"}
    )

    public class RunnerClass {

    }
}
