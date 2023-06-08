package Activities;

/*Open a new browser to https://training-support.net/selenium/drag-drop
Get the title of the page and print it to the console.
On the page, perform:
Find the ball and simulate a click and drag to move it into "Dropzone 1".
Verify that the ball has entered Dropzone 1.
Once verified, move the ball into "Dropzone 2".
Verify that the ball has entered Dropzone 2.
Close the browser.*

 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver dr = new FirefoxDriver();

        dr.get("https://training-support.net/selenium/drag-drop");

        Actions builder = new Actions(dr);
        System.out.println("Homepage title is   " + dr.getTitle());

        WebElement ball=dr.findElement(By.id("draggable"));
        WebElement zone1= dr.findElement(By.id("droppable"));
        WebElement zone2 = dr.findElement(By.id("dropzone2"));

// drop to zone1
        builder.clickAndHold(ball).moveToElement(zone1).release().build().perform();
        System.out.println("Zone1 is  "+zone1.getText());
        Thread.sleep(2000);

      //drop to zone 2
        builder.dragAndDrop(ball, zone2).build().perform();
        System.out.println("Zone2 is  "+zone2.getText());
        Thread.sleep(2000);
        dr.close();
    }
}




