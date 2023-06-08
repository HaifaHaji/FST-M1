package Activities;
/*
Check if elements are enabled

Using Selenium:

Open a new browser to https://training-support.net/selenium/dynamic-controls
Get the title of the page and print it to the console.
On the page, perform:
Find the text field.
Check if the text field is enabled and print it.
Click the "Enable Input" button to enable the input field.
Check if the text field is enabled again and print it.
Close the browser.
 */


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12 {

    public static void main(String[] args) {
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

        // Find the text field
        WebElement textbox = dr.findElement(By.id("input-text"));
        // Check if it is enabled
        System.out.println("Input field is enabled: " + textbox.isEnabled());
        // Click the toggle button to enable it
        dr.findElement(By.id("toggleInput")).click();
        // Check if the text field is enabled
        System.out.println("Input field is enabled: " + textbox.isEnabled());

        // Close the browser
        dr.close();
    }
}
