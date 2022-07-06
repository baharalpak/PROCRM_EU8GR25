package com.procrm.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html"
        },
        features = "src/test/resources/features",
        glue = "com/procrm/step_definitions",
        dryRun = false,
        tags = "@feature"

)

public class CukesRunner {



}
