package br.com.sicredi.automation_web.tests;

import br.com.sicredi.automation_web.util.TestRule;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.ClassRule;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
        tags = "@endToEnd",
        glue = "",
        monochrome = false,
        dryRun = false
)

public class RunTest {

    @ClassRule
    public static TestRule testRule = new TestRule();

}