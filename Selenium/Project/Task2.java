package LMS_Proj;
/*Verify the website heading
Goal: Read the heading of the website and verify the text
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/lms’.
c. Get the heading of the webpage.
d. Make sure it matches “Learn from Industry Experts” exactly.
e. If it matches, close the browser.*/


import  io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver dr = new FirefoxDriver();
        dr.get("https://alchemy.hguy.co/lms");


        String heading = dr.findElement(By.cssSelector(".uagb-ifb-title")).getText();
        System.out.println("Heading is  " + heading);
    String expected="Learn from Industry Experts";
        Assert.assertEquals(heading, expected);

        Thread.sleep(1000);
        dr.quit();

    }

}