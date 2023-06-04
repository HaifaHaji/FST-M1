package Activities;
/*
Create a TestNG Class with the annotations
@Test
@BeforeClass
@AfterClass
Once the Class file is created, import
By
WebDriver
FirefoxDriver
WebElement
DataProviders


In the @BeforeMethod method, create the a driver instance for FirefoxDriver
Also use the get() method to open the browser with https://www.training-support.net/selenium/login-form
In the @AfterMethod method, use close() to close the browser once the test is done.
Add a @DataProviders method credentials() with the name parameter set to "Authentication".
Set the return type of the method as Object[][].
It should return two Objects with a username and a password each.
Write a @Test method, with the parameter dataProvider set to name of the @DataProvider method.
Add them as formal parameters for the test method.


n the @Test method:

Use findElements() to find the username and password text boxes and the login button.
Use sendKeys() with the variable names as input.
Click the login button.
Run the test script as a TestNG Test.
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity7 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Initialize Firefox driver object
        driver = new FirefoxDriver();
        // Initialize wait object
        //wait = new WebDriverWait(driver,2000);

        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] { { "admin", "password" }};
    }

    @Test (dataProvider = "Authentication")
    public void loginTestCase(String username, String password) {
        //Find username and pasword fields
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        //Enter values
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);

        //Click Log in
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        //Assert Message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }

    @AfterClass
    public void afterClass() {
        //Close browser
        driver.close();
    }

}