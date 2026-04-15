package de.phonebook.core;

import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager
            (System.getProperty("browser", Browser.CHROME.browserName()));
@BeforeSuite
   // @BeforeMethod
    public void setUp() {
        app.init();
    }
@AfterSuite
    //@AfterMethod(enabled = true)
    public void tearDown() {
        app.stop();
    }

}
