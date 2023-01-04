package teststore.tests;

import driver.cash.WebDriverCash;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected WebDriver driver = WebDriverCash.getDriver();

    @BeforeSuite
    public void setUp(){
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void driverQuit(){
        driver.quit();
    }
}
