package Activities;
/*Using Selenium:

Open a new browser to https://training-support.net/selenium/target-practice
Get the title of the page and print it to the console.
Using xpath:
Find the 3rd header on the page and print it's text to the console.
Find the 5th header on the page and print it's color.
Using any other locator:
Find the violet button and print all it's classes.
Find the grey button and print it's text.
Close the browser.*/



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver dr = new FirefoxDriver();

        dr.get("https://training-support.net/selenium/target-practice");
        System.out.println("Homepage title is  " + dr.getTitle());

        String third= dr.findElement(By.xpath("//*[@id=\"third-header\"]")).getText();
        System.out.println("Header is  "+third);


        String fifth=dr.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5")).getCssValue("color");
        System.out.println("color is  " +fifth);


        String violet = dr.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/button[3]")).getAttribute("class");
        System.out.println("class is   "+violet);


        String grey = dr.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("Text is " + grey);
        Thread.sleep(2000);
        dr.close();


    }
}



