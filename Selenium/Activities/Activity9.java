package Activities;
/*
Wait2
Using Selenium:

Open a new browser to https://training-support.net/selenium/ajax

Get the title of the page and print it to the console.
On the page, perform:
Find and click the "Change content" button on the page.
Wait for the text to say "HELLO!". Print the message that appears on the page.
Wait for the text to change to contain "I'm late!". Print the new message on the page.
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


public class Activity9 {
    public static void main(String[] args) {
        // Setup the dr
        WebDriverManager.firefoxdriver().setup();
        // Driver object reference
        WebDriver dr = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(10));

        // Open the browse
        dr.get("https://www.training-support.net/selenium/ajax");

        // Find the button and click it
        dr.findElement(By.cssSelector("button.violet")).click();
        // Wait for the new elements to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        // Find and print the new text
        String text = dr.findElement(By.tagName("h1")).getText();
        System.out.println(text);

        WebElement delayedText = dr.findElement(By.tagName("h3"));
        System.out.println(delayedText.getText());
        // Wait for the delayed text and print it
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));
        String lateText = dr.findElement(By.tagName("h3")).getText();
        System.out.println(lateText);

        // Close the browser
        dr.quit();
    }
}


