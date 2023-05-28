package LMS_Proj;
/*
Verify the title of the first info box
Goal: Read the title of the first info box on the website and verify the text
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/lms’.
c. Get the title of the first info box.
d. Make sure it matches “Actionable Training” exactly.
e. If it matches, close the browser.
*/


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Task3 {



    public  static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver dr = new FirefoxDriver();
        dr.get("https://alchemy.hguy.co/lms");


        String first_box = dr.findElement(By.cssSelector("h3.uagb-ifb-title")).getText();
        System.out.println("title of the first info box is  " + first_box);
        Assert.assertEquals(first_box, "Actionable Training");

        Thread.sleep(1000);
        dr.quit();


    }


}