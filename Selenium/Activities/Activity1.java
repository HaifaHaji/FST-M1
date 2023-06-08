package Activities;
/*Open a new browser to https://training-support.net.
Get the title of the page and print it to the console.
Find the "About Us" button on the page using it's id.
Click on that button.
Get the title of the new page and print it to the console.*/

import  io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://training-support.net");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("about-link")).click();
       String tit= driver.getTitle();
        System.out.println("New title is  " +tit);

        driver.quit();
    }
}
