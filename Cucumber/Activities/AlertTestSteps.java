package StepDefinition;
/*
Add Tags to the Scenarios:

@SimpleAlert and @SmokeTest for Scenario one
@ConfirmAlert for Scenario two
@PromptAlert for Scenario Outline
The Annotations for @SimpleAlert are:

GIVEN: User is on the page
WHEN: User clicks the Simple Alert button
THEN: Alert opens
AND: Read the text from it and print it
AND: Close the alert
AND: Read the result text
AND: Close Browser

The Annotations for @ConfirmAlert are:

GIVEN: User is on the page
WHEN: User clicks the Confirm Alert button
THEN: Alert opens
AND: Read the text from it and print it
AND: Close the alert with Cancel
AND: Read the result text
AND: Close Browser

The Annotations for @PromptAlert are:

GIVEN: User is on the page
WHEN: User clicks the Prompt Alert button
THEN: Alert opens
AND: Read the text from it and print it
AND: Write a custom message in it
AND: Close the alert
AND: Read the result text
AND: Close Browser

For the Step Definition,

First import all the Selenium and Cucumber Classes.
For the @Given definition,
Create the driver and wait Instances
Use get() to open the browser with https://www.training-support.net/selenium/javascript-alerts
For the Simple Alert @When definition,
Use findElement() to find the first button on the page and click it.
For the Confirm Alert @When definition,
Use findElement() to find the second button on the page and click it.
For the Prompt Alert @When definition,
Use findElement() to find the third button on the page and click it.

For Alert Opens @Then definition,
Use driver.switchTo().alert() to switch focus to the alert.
For the Read the text @And definition,
getText() the text in the alert and print it.
For the Write @And definition for the prompt,
Use sendKeys() to type in the text box in the prompt alert.
For Closing the alert @And definition,
Use alert.accept() to close the alert
For Closing the alert with cancel @And definition,
Use alert.dismiss() to close the alert. This will only work with confirm and prompt alerts.

For showing the result @And definition,
Use findElement() to find the text <p> tag with the id "result"
Use getText() to get the text from it and print it
For close browser @And definition,
close() the browser.
To run the test, Test Runner has to be modified as shown,

@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    tags = "@SmokeTest",
    strict = true
)

For this activity, we will be modified the CucumberOptions, more specifically, the tag option. Use the following tags for tests,

@SmokeTest - Should run only the simple alert Scenario
@SimpleTest, @ConfirmAlert - Should run the simple alert Scenario and the confirm alert Scenario
@PromptAlert - Should run only the prompt alert Scenario
@activity3 - Should run the all the Scenarios
 */


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class AlertTestSteps {
    WebDriver driver;
    WebDriverWait wait;
    Alert alert;

    @Given("^User is on the page$")
    public void openPage() {
        //Create Instances
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Open browser
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }

    @When("^User clicks the Simple Alert button$")
    public void openSimpleAlert() {
        driver.findElement(By.cssSelector("#simple")).click();
    }

    @When("^User clicks the Confirm Alert button$")
    public void openConfirmAlert() {
        driver.findElement(By.cssSelector("#confirm")).click();
    }

    @When("^User clicks the Prompt Alert button$")
    public void openPromptAlert() {
        driver.findElement(By.cssSelector("#prompt")).click();
    }

    @Then("^Alert opens$")
    public void switchFocus() {
        alert = driver.switchTo().alert();
    }

    @And("^Read the text from it and print it$")
    public void readAlert() {
        System.out.println("Alert says: " + alert.getText());
    }

    @And("^Write a custom message in it$")
    public void writeToPrompt() {
        alert.sendKeys("Custom Message");
    }

    @And("^Close the alert$")
    public void closeAlert() {
        alert.accept();
    }

    @And("^Close the alert with Cancel$")
    public void closeAlertWithCAncel() {
        alert.dismiss();
    }

    @And("^Close Browser$")
    public void closeBrowser() {
        driver.close();
    }
}
