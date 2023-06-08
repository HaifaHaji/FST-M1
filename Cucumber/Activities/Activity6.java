package StepDefinition;
/*

This activity will be using the HTML and the JUnit reporter with pretty and usage options.
This file will only be modifying the TestRunner.
We will be adding a new options - plugin and monochrome - that helps report results in a more readable and easy to understand manner.
Set the plugin option be set to "pretty" and the option monochrome should be set to true.

@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    tags = "@SmokeTest",
    plugin = {"pretty"},
    monochrome = true
)

Run a test with the tag @SmokeTest. This should run the first activity Scenario and the Simple Alert Scenario.

The output will now look different in the Eclipse Console.

Now we add the code to add the test report in an HTML file. The plugin option should be modified to push the test result to html with the .html file stored in a folder named test-reports.

@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    tags = "@SmokeTest",
    plugin = {"html: test-reports"},
    monochrome = true
)
The plugin option here writes the test result to a index.html file in a folder named test-reports.

ActivitesRunner.java Solution for pretty reports. This will print in the console.

Solutions

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    tags = "@SimpleAlert",
    plugin = {"pretty"},
    monochrome = true
)

public class ActivitiesRunner {
    //This is intentionally blank
}

ActivitesRunner.java Solution for HTML report. This will create a new folder named test-reports.

Solutions

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    tags = "@SimpleAlert",
    plugin = {"html: test-reports"},
    monochrome = true
)

public class ActivitiesRunner {}

ActivitesRunner.java Solution for JSON report. This will create a new file named json-report.json in test-reports folder

Solutions

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    tags = "@SimpleAlert",
    plugin = {"json: test-reports/json-report.json"},
    monochrome = true
)

public class ActivitiesRunner {}


 */
public class Activity6{
}
