package Activities;
/*Open a new browser to https://www.training-support.net/selenium/input-events
Get the title of the page and print it to the console.
On the page, perform:
Left click and print the value of the side in the front.
Double click to show a random side and print the number.
Right click and print the value shown on the front of the cube.
Close the browser.*/


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver dr = new FirefoxDriver();

        dr.get("https://www.training-support.net/selenium/input-events");

        Actions builder = new Actions(dr);
        System.out.println("Homepage title is   " + dr.getTitle());

// left click
        builder.click().pause(1000).build().perform();
        String frontText = dr.findElement(By.className("active")).getText();
        System.out.println("Front text is "+frontText);

        // doubleclick
        builder.doubleClick().pause(1000).build().perform();
        // Print the front side text
        frontText = dr.findElement(By.className("active")).getText();
        System.out.println("Front text is "+frontText);

        // right click
        builder.contextClick().pause(1000).build().perform();
        frontText = dr.findElement(By.className("active")).getText();
        System.out.println("Front text is "+frontText);
        dr.close();


    }
}




