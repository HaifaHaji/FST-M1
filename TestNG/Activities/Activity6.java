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
Parameters

In the @BeforeClass method, create the a driver instance for FirefoxDriver
Also use the get() method to open the browser with https://www.training-support.net/selenium/login-form
In the @AfterClass method, use close() to close the browser once the test is done.
Write a @Test method, with the annotation @Parameters below @Test.
Pass "username" and "password" as the parameters. Also add them as formal parameters for the test method.
Use findElements() to find the username and password text boxes and the login button.
Use sendKeys() with the variable names as input. Then click() the login button.

n AC5testng.xml,

Add the <parameter> tags before the <classes> tag.
Add name parameters for username and password.
Set their value to "admin" and "password", respectively.
Save all the files and RUN AC5testng.xml, NOT the test script


 */
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {



/*Using Selenium:

Open a new browser to https://training-support.net/selenium/login-form
Get the title of the page and print it to the console.
Find the username field using any locator and enter "admin" into it.
Find the password field using any locator and enter "password" into it.
Find the "Log in" button using any locator and click it.
Close the browser.

*/




    public static void main(String[] args) throws InterruptedException {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");

        System.out.println("Homepage title is  " + driver.getTitle());
        driver.findElement(By.name("Username")).sendKeys("admin");
        driver.findElement(By.name("Password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        String message = driver.findElement(By.cssSelector("#action-confirmation")).getText();
        System.out.println("Message is " + message);
        Thread.sleep(2000);
        driver.close();


    }
}
