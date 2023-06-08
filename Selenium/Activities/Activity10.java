package Activities;
/*
Check if elements are displayed

Open a new browser to https://training-support.net/selenium/dynamic-controls
Get the title of the page and print it to the console.
On the page, perform:
Find the checkbox input element.
Check if it is visible on the page.
Click the "Remove Checkbox" button.
Check if it is visible again and print the result.
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

public class Activity10 {

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

        // Find the checkbox
        WebElement checkbox = dr.findElement(By.className("willDisappear"));
        // Find the toggle button and click it
        WebElement checkboxToggle = dr.findElement(By.id("toggleCheckbox"));
        checkboxToggle.click();
        // Wait for the checkbox to disappear
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("willDisappear")));
        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
        // Click the button again
        checkboxToggle.click();
        // Wait for the element to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
        // Click the checkbox
        dr.findElement(By.xpath("//input[@class='willDisappear']")).click();

        // Close the browser
        dr.close();
    }
}
