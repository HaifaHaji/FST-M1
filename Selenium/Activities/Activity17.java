package Activities;

//Selects #1
/*Using Selenium:

Open a new browser to https://training-support.net/selenium/selects
Get the title of the page and print it to the console.
On the Single Select:
Select the second option using the visible text.
Select the third option using the index.
Select the fourth option using the value.
Get all the options and print them to the console.
Close the browser..*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Activity17 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver dr = new FirefoxDriver();

        // Open the browser
        dr.get("https://training-support.net/selenium/selects");
        System.out.println(dr.getTitle());

        Select opt=new Select(dr.findElement(By.cssSelector("#single-select")));
        opt.selectByVisibleText("Option 2");
        Thread.sleep(2000);

        opt.selectByIndex(3);
        Thread.sleep(2000);

        opt.selectByValue("Option 4");
        Thread.sleep(2000);



        dr.quit();
    }
}
