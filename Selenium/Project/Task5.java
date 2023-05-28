package LMS_Proj;
/*
Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/lms’.
c. Find the navigation bar.
d. Select the menu item that says “My Account” and click it.
e. Read the page title and verify that you are on the correct page.
f. Close the browser.
*/


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task5 {



    public  static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver dr = new FirefoxDriver();
        dr.get("https://alchemy.hguy.co/lms");
        dr.findElement(By.linkText("My Account")).click();

        String title =dr.getTitle();
        System.out.println("Title is  "+title);
        Thread.sleep(1000);
        dr.quit();


    }


}