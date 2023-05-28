package LMS_Proj;
/*Verify the website title
Goal: Read the title of the website and verify the text
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/lms’.
c. Get the title of the website.
d. Make sure it matches “Alchemy LMS – An LMS Application '' exactly.
e. If it matches, close the browser.
*/


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import static org.testng.Assert.assertTrue;

public class Task1 {
    WebDriver dr = new FirefoxDriver();

@BeforeTest
public void bef()
{
    dr.get("https://alchemy.hguy.co/lms");
}
@Test
public void steps()
{
    Boolean verifyTitle = dr.getTitle().equalsIgnoreCase("Alchemy LMS – An LMS Application");
    assertTrue(verifyTitle);
    System.out.println("Title is verified");



}

@AfterTest
public void close()
{
    System.out.println("Closing window");
    dr.close();
}
    public static void main(String[] args) throws InterruptedException {


    }
}