package Activities;

/*Open a new browser to https://training-support.net/selenium/dynamic-controls
Get the title of the page and print it to the console.
On the page, perform:
Find the checkbox toggle button and click it.
Wait till the checkbox disappears.
Click the button again. Wait till it appears and check the checkbox.
Close the browser.
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity8 {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        // Set up Firefox dr
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox dr
        WebDriver dr = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(10));

        // Open the page
        dr.get("https://www.training-support.net/selenium/dynamic-controls");
        // Print the title of the page
        System.out.println("Home page title: " + dr.getTitle());

        // Find the toggle button and click it
        WebElement checkbox = dr.findElement(By.id("toggleCheckbox"));
        checkbox.click();
        // Wait for the checkbox to disappear
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println(checkbox.isDisplayed());
        // Click the button again
        checkbox.click();
        // Wait for the element to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println(checkbox.isDisplayed());

        // Close the browser
        dr.close();
    }
}




