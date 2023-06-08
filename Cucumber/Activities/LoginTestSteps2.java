package StepDefinition;
/*

This activity will also be using the "LoginTestSteps" file, because most of the steps are the same.
The only step that is different is the @When statement. We will be passing variables to the Step Definition directly from the Feature file.
In the Features folder, add a new file named "Activity5.feature".
Rewrite the tag above Feature to "@activity5".
Name the Feature: "Login Test"
Name the Scenario Outline: "Testing Login with Example"
Note: We will be using Scenario Outline instead of Scenario in this activity.

GIVEN: User is on Login page
WHEN: User enters "<Usernames>" and "<Passwords>"
THEN: Read the page title and confirmation message
AND: Close the Browser
Examples:
Use the '|' symbol as a delimiter to represent a table.
First row is the header. Set the header value as Usernames and Passwords
Second row will have the values "admin" and "password"

In the LoginTestSteps Class, add another @When definition statement.
In this @When, the statement should have \"(.*)\" in place of username and password.
The function below it should have two String arguments, username and password.
The (.*) is used to get the string values that will be added during the running of the test.
Use the same actions from the other @When statements.
Add another row to the Examples section. This will make Cucumber run the Scenario twice.

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    tags = "@activity5"
)

public class ActivitiesRunner {}

 */




import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class LoginTestSteps2 {
    WebDriver driver;
    WebDriverWait wait;

    @Given("^User is on Login page$")
    public void loginPage() {
        //Setup instances
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @When("^User enters username and password$")
    public void enterCredentials() {
        //Enter username
        driver.findElement(By.id("username")).sendKeys("admin");
        //Enter password
        driver.findElement(By.id("password")).sendKeys("password");
        //Click Login
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_and(String username, String password) throws Throwable {
        //Enter username from Feature file
        driver.findElement(By.id("username")).sendKeys(username);
        //Enter password from Feature file
        driver.findElement(By.id("password")).sendKeys(password);
        //Click Login
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("^Read the page title and confirmation message$")
    public void readTitleAndHeading() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));

        //Read the page title and heading
        String pageTitle = driver.getTitle();
        String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();

        //Print the page title and heading
        System.out.println("Page title is: " + pageTitle);
        System.out.println("Login message is: " + confirmMessage);

        if(confirmMessage.contains("admin")) {
            Assert.assertEquals(confirmMessage, "Welcome Back, admin");
        } else {
            Assert.assertEquals(confirmMessage, "Invalid Credentials");
        }
    }

    @And("^Close the Browser$")
    public void closeBrowser() {
        //Close browser
        driver.close();
    }
}
