package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * @author Divakar Verma
 * @created_at : 04/04/2024 - 12:28 pm
 * @mail_to: vermadivakar2022@gmail.com
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepdef"},
        tags = "not @ignore and @TM", // Skips scenarios and steps with @ignore or @skip tags
//      tags =  "~@SKIP",
        plugin = {"json:target/cucumber-report.json", "pretty", "html:target/test-report.html"},
        publish = true,
        monochrome = true
)
public class TestRunner {
}
