package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = true,
       tags = "@navigate"//when you want to run only one scenario or
        // tags = "@driver"
        //tags = "@login" it will look login tags
        //tags = "@smoke" you will run smoke suit
)
public class CukesRunner {


}
