package Activities;


/*
//Alerts #1

Using Selenium:

Open a new browser to https://training-support.net/selenium/javascript-alerts
Get the title of the page and print it to the console.
Find the button to open a CONFIRM alert and click it.
Switch the focus from the main window to the Alert box and get the text in it and print it.
Close the alert once with Ok and again with Cancel.
Close the browser.

*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity19 {

    public static void main(String[] args) {
        // Set up Firefox dr
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox dr
        WebDriver dr = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(10));

        // Open the page
        dr.get("https://www.training-support.net/selenium/javascript-alerts");
        // Print the title of the page
        System.out.println("Home page title: " + dr.getTitle());

        // Find and click the button to open the alert
        dr.findElement(By.id("confirm")).click();

        // Switch focus to the alert
        Alert confirmAlert = dr.switchTo().alert();

        // Print the text in the alert
        String alertText = confirmAlert.getText();
        System.out.println("Text in alert: " + alertText);

        // Close the alert by clicking OK
        confirmAlert.accept();

        // Can also close the alert by clicking Cancel
        // confirmAlert.dismiss();

        // Close the browser
        dr.quit();
    }
}
