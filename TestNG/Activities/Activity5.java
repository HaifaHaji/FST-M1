package Activities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;
/*



Create a TestNG Class with the annotations
@Test
@BeforeClass
@AfterClass
In the @BeforeClass method, create the a driver instance for FirefoxDriver
Also use the get() method to open the browser with https://www.training-support.net/selenium/target-practice
In the @AfterClass method, use close() to close the browser once the test is done.

Write tests for:

Checking the page title
Header Tests:
Find the third header and assert the text in the h3 tag.
Find and assert the colour of the fifth header tag element.
Button Tests:
Find the button with the class olive and assert it text.
Find and assert the colour of the first button in the third row.
Group the Header tests under a group, HeaderTests.
Group the Button tests under a group, ButtonTests

In AC5testng.xml:

Run all the tests from this activity.
Run only the tests that are in the HeaderTests group.
Run only the tests that are in the ButtonTests group.
Exclude the tests that are in the HeaderTests group.


 */
public class Activity5 {
    WebDriver driver;
    //Include alwaysRun property on the @BeforeTest
    //to make sure the page opens
    @BeforeTest(alwaysRun = true)
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test (groups = {"HeaderTests", "ButtonTests"})
    public void pageTitleTest() {
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        Assert.assertEquals(title, "Target Practice");
    }

    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})
    public void HeaderTest1() {
        WebElement header3 = driver.findElement(By.cssSelector("h3#third-header"));
        Assert.assertEquals(header3.getText(), "Third header");
    }

    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})
    public void HeaderTest2() {
        WebElement header5 = driver.findElement(By.cssSelector("h3#third-header"));
        Assert.assertEquals(header5.getCssValue("color"), "rgb(251, 189, 8)");
    }

    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
    public void ButtonTest1() {
        WebElement button1 = driver.findElement(By.cssSelector("button.olive"));
        Assert.assertEquals(button1.getText(), "Olive");
    }

    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
    public void ButtonTest2() {
        WebElement button2 = driver.findElement(By.cssSelector("button.brown"));
        Assert.assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)");
    }

    //Include alwaysRun property on the @AfterTest
    //to make sure the page closes
    @AfterTest(alwaysRun = true)
    public void afterMethod() {
        //Close the browser
        driver.close();
    }

}
