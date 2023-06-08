package Activities;


/*
//Alerts #2

Open a new browser to https://training-support.net/selenium/javascript-alerts
Get the title of the page and print it to the console.
Find the button to open a PROMPT alert and click it.
Switch the focus from the main window to the Alert box and get the text in it and print it.
Type "Awesome!" into the prompt.
Close the alert by clicking Ok.
Close the browser.

*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Activity20 {

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
        dr.findElement(By.id("prompt")).click();

        // Switch focus to the alert
        Alert promtAlert = dr.switchTo().alert();

        // Print the text in the alert
        String alertText = promtAlert.getText();
        System.out.println("Text in alert: " + alertText);
        // Type into the alert
        promtAlert.sendKeys("Awesome!");

        // Close the alert by clicking OK
        promtAlert.accept();

        // Can also close the alert by clicking Cancel
        // promtAlert.dismiss();

        // Close the browser
        dr.quit();
    }
}
