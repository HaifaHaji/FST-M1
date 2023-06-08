package Activities;
/*Using Selenium:

Open a new browser to https://training-support.net/selenium/login-form
Get the title of the page and print it to the console.
Find the username field using any locator and enter "admin" into it.
Find the password field using any locator and enter "password" into it.
Find the "Log in" button using any locator and click it.
Close the browser.*/


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver dr = new FirefoxDriver();
        dr.get("https://www.training-support.net/selenium/login-form");

        System.out.println("Homepage title is  " + dr.getTitle());
        dr.findElement(By.name("Username")).sendKeys("admin");
        dr.findElement(By.name("Password")).sendKeys("password");
        dr.findElement(By.xpath("//button[text()='Log in']")).click();

        String message = dr.findElement(By.cssSelector("#action-confirmation")).getText();
        System.out.println("Message is " + message);
        Thread.sleep(2000);
        dr.close();


    }
}
