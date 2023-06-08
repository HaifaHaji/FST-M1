package StepDefinition;
/*

This activity will also be using the "LoginTestSteps" file, because most of the steps are the same.
The only step that is different is the @When statement. We will be passing values to the Step Definition directly from the Feature file.
In the Features folder, add a new file named "Activity4.feature".
Rewrite the tag above Feature to "@activity4".
Name the Feature: "Login Test"
Name the Scenario: "Testing Login without Examples"

WHEN: User enters "admin" and "password"
THEN: Read the page title and confirmation message
AND: Close the Browser
In the LoginTestSteps Class, add another @When definition statement.
In this @When, the statement should have \"(.*)\" in place of username and password.
The function below it should have two String arguments, username and password.

Use findElement() to find the username, password, and the login button.
In the username and password text fields type in the value of username and password, respectively from the arguments.
click() the login button.
The rest of the methods will remain the same.
Cucumber will use the @When definition that matches the the statement in the Feature file.
You are using \"(.*)\" regex to find any string entered inside the double quotes in the Feature file.

To run only the third test, modify the ActivitiesRunner Class.

To CucumberOptions, add a new value named tag. Set its value to @activity4 as shown

@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    tag = "@activity4"
)


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



public class LoginTestSteps {

    WebDriver driver;
    WebDriverWait wait;

    @Given("^User is on Login page$")
    public void loginPage() {
        //Setup instances
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

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


    }

    @And("^Close the Browser$")
    public void closeBrowser() {
        //Close browser
        driver.close();
    }

}