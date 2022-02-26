package com.HepsiBurada.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/failedcucumber.json",
                "html:target/failed-html-report"},
        features = "@target/rerun.txt",
        glue = "com\\HepsiBurada\\stepdefnitions"
)

public class FailedTestRunner {
}
