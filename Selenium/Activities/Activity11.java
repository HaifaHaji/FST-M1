package Activities;
/*
Check if elements are selected

Open a new browser to https://training-support.net/selenium/dynamic-controls
Get the title of the page and print it to the console.
On the page, perform:
Find the checkbox input element.
Check if the checkbox is selected and print the result.
Click the checkbox to select it.
Check if the checkbox is selected again and print the result.
Close the browser.

 */


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11 {

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

        // Find the checkbox and click it
        WebElement checkbox = dr.findElement(By.name("toggled"));
        checkbox.click();
        System.out.println("Checkbox is selected: " + checkbox.isSelected());
        // Click the checkbox to deselect it
        checkbox.click();
        System.out.println("Checkbox is selected: " + checkbox.isSelected());

        // Close the browser
        dr.close();
    }
}
