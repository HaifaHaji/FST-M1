package LMS_Proj;
/*

Contact the admin
Goal: Navigate to the “Contact Us” page and complete the form.
a. Open a browser.
b. Navigate to ‘https://alchemy.hguy.co/lms’.
c. Find the navigation bar.
d. Select the menu item that says “Contact” and click it.
e. Find the contact form fields (Full Name, email, etc.)
f. Fill in the information and leave a message.
g. Click submit.
h. Read and print the message displayed after submission.
i. Close the browser
*/


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task8 {



    public  static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver dr = new FirefoxDriver();
        dr.get("https://alchemy.hguy.co/lms");


        dr.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[4]/a")).click();

        dr.findElement(By.id("wpforms-8-field_0")).sendKeys("Haifa Haji");
        dr.findElement(By.id("wpforms-8-field_1")).sendKeys("haji.test@ibm.com");
        dr.findElement(By.id("wpforms-8-field_2")).sendKeys("Works as expected");
        dr.findElement(By.id("wpforms-submit-8")).click();
        String text=dr.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[4]/div[2]/div[2]/div[2]")).getText();
        System.out.println("Text is "+text);


        Thread.sleep(1000);
        dr.quit();


    }


}