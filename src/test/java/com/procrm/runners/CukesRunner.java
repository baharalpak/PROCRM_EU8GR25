package com.procrm.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber-reports/Cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/procrm/step_definitions",
        dryRun = false,

        tags = "@SCRUM-933"

)

public class CukesRunner {


}
