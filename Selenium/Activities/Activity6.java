package Activities;
/*Open a new browser to https://training-support.net/selenium/input-events
Get the title of the page and print it to the console.
On the page, perform:
Press the key of first letter of your name in caps
Press CTRL+a and the CTRL+c to copy all the text on the page.
(Paste the text in a text editor to verify results.)
Close the browser.*/


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity6 {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver dr = new FirefoxDriver();

        dr.get("https://training-support.net/selenium/input-events");

        Actions builder = new Actions(dr);
        System.out.println("Homepage title is   " + dr.getTitle());

// caps name first letter
        builder.sendKeys("H").build().perform();

        //ctrl a  and ctrl c //keydown means press  //keyup releases
        builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        dr.close();


    }
}




