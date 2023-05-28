package LMS_Proj;
/*

Username: root
Password: pa$$w0rd

Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/lms’.
c. Find the navigation bar.
d. Select the menu item that says “My Account” and click it.
Logging into the site
Goal: Open the website and log-in using the provided credentials.
Verify that you have logged in.
k. Close the browser.
*/


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Task6 {
    WebDriver dr = new FirefoxDriver();

    @BeforeClass
    public void beforeClass() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        dr = new FirefoxDriver();

        dr.get("https://alchemy.hguy.co/lms");
    }

    @Test
public void Login()
{

    WebElement username= dr.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/section[2]/div[2]/div[2]/div[2]/div[2]/a"));
    username.sendKeys("root");
    dr.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
    dr.findElement(By.id("wp-submit")).click();
}

    @Test  (dependsOnMethods = { "Login" })
    public  void test() throws InterruptedException {


        dr.findElement(By.linkText("My Account")).click();
        dr.findElement(By.cssSelector(".ld-login")).click();



        Boolean verifyTitle = dr.getTitle().contains("My Account – Alchemy LMS");
        assertTrue(verifyTitle);

        Thread.sleep(1000);
        dr.quit();


    }


}