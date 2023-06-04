package Activities;
/*
This activity will show the usage of AC5testng.xml to execute multiple classes.

[Optional] Create a package named suiteExample
Create a new TestNG class file named DemoOne.java in the package.
It will have two @Test methods


 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity4_DemoOne {



    @Test
    public void firstTestCase() {
        System.out.println("I'm in first test case from demoOne Class");
    }

    @Test
    public void secondTestCase() {
        System.out.println("I'm in second test case from demoOne Class");
    }
}
