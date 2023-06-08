package Activities;


/*
Multiple Tabs


Using Selenium:

Open a new browser to https://www.training-support.net/selenium/tab-opener
Get the title of the page and print it to the console.
Find the button to open a new tab and click it.
Wait for the new tab to open.
Print all the handles.
Switch to the newly opened tab, print it's title and heading.
Repeat the steps by clicking the button in the new tab page.
Close the browser.


*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity21 {

    public static void main(String[] args) {
        // Set up Firefox dr
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox dr
        WebDriver dr = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(10));

        // Open the page
        dr.get("https://www.training-support.net/selenium/tab-opener");
        // Print the title of the page
        System.out.println("Home page title: " + dr.getTitle());

        // Print the handle of the parent window
        System.out.println("Current tab: " + dr.getWindowHandle());
        // Find button to open new tab
        dr.findElement(By.id("launcher")).click();

        // Wait for the second tab to open
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        // Print all window handles
        System.out.println("Currently open windows: " + dr.getWindowHandles());

        // Switch focus
        for(String handle : dr.getWindowHandles()) {
            dr.switchTo().window(handle);
        }

        // Wait for the new page to load
        wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));
        // Print the handle of the current tab
        System.out.println("Current tab: " + dr.getWindowHandle());
        // Print the title and heading of the new page
        System.out.println("Page title: " + dr.getTitle());
        String pageHeading = dr.findElement(By.className("content")).getText();
        System.out.println("Page Heading: " + pageHeading);
        // Find and click the button on page to open another tab
        dr.findElement(By.id("actionButton")).click();

        // Wait for new tab to open
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        // Switch focus
        for(String handle : dr.getWindowHandles()) {
            dr.switchTo().window(handle);
        }

        // Wait for the new page to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("content")));
        // Print the handle of the current tab
        System.out.println("Current tab: " + dr.getWindowHandle());
        // Print the title and heading of the new page
        System.out.println("Page title: " + dr.getTitle());
        pageHeading = dr.findElement(By.className("content")).getText();
        System.out.println("Page Heading: " + pageHeading);

        // Close the browser
        dr.quit();
    }
}
