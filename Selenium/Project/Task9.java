package LMS_Proj;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;





/*
Complete a simple lesson
Goal: Navigate to a particular lesson and complete it.
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/lms’.
c. Find the navigation bar.
d. Select the menu item that says “All Courses” and click it.
e. Select any course and open it.
f. Click on a lesson in the course. Verify the title of the course.
g. Click the Mark Complete button on the page (if available).
h. Close the browser.
*/

public class Task9 {



    public void test9() throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver dr = new FirefoxDriver();
        dr.get("https://alchemy.hguy.co/lms");


        dr.findElement(By.linkText("My Account")).click();
        dr.findElement(By.cssSelector(".ld-login")).click();

        WebElement username = dr.findElement(By.id("user_login"));
        username.sendKeys("root");
        dr.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        dr.findElement(By.id("wp-submit")).click();

        dr.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div/div[3]/div/nav/div/ul/li[2]/a")).click();
        dr.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div/div/div/div[1]/article/div[2]/p[2]/a")).click();
        dr.findElement(By.xpath("/html/body/div[1]/div/div/div/main/article/div/div/div/div/div[3]/div[2]/div[1]/div[1]")).click();
        String title = dr.getTitle();
        System.out.println("The title is  " + title);
        dr.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/a/span")).click();


        WebElement button = dr.findElement(By.cssSelector(".learndash_mark_complete_button"));
        if(button.isDisplayed())
        {
            button.click();
        }
        else {
            System.out.println("Course isn'y completed");
        }

        Thread.sleep(2000);
        dr.quit();


    }
}