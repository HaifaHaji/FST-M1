package LMS_Proj;
/*
Verify the title of the second most popular course
Goal: Read the title of the second most popular course on the website and verify the
text
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/lms’.
c. Get the title of the second most popular course.
d. Make sure it matches “Email Marketing Strategies” exactly.
e. If it matches, close the browser.

*/


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Task4 {



    public  static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver dr = new FirefoxDriver();
        dr.get("https://alchemy.hguy.co/lms");


        String second_pop = dr.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div/div[2]/div/div/div/div[2]/article/div[2]/h3")).getText();
        System.out.println("second most popular course is  " + second_pop);
        Assert.assertEquals(second_pop, "Email Marketing Strategies");

        Thread.sleep(1000);
        dr.quit();


    }


}