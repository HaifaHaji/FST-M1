package LMS_Proj;
/*

Username: root
Password: pa$$w0rd

Count the number of courses
Goal: Navigate to the “All Courses” page and count the number of courses.
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/lms’.
c. Find the navigation bar.
d. Select the menu item that says “All Courses” and click it.
e. Find all the courses on the page.
f. Print the number of courses on the page.
*/


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class Task7 {
    WebDriver dr;

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
    public void test() throws InterruptedException {


        WebElement all_courses=dr.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[2]/a"));


        all_courses.click();
    Actions builder = new Actions(dr);
    builder.sendKeys(Keys.PAGE_DOWN).build().perform();

    List<WebElement> course_no = dr.findElements(By.xpath("//h3[@class='entry-title']"));


        System.out.println("No. of Courses: " + course_no.size());



    for (WebElement list_course : course_no) {

        System.out.println("The courses are" + list_course.getText());
    }


    }

    @AfterClass
    public void afterClass() throws InterruptedException {
        Thread.sleep(1000);
        dr.quit();
    }
}
