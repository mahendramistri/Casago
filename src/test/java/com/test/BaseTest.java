package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    WebDriver driver;
   @BeforeClass
   public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\32bit\\chromedriver-win32\\chromedriver.exe");
       driver = new ChromeDriver();
    }

    @AfterClass
    public void closeBrowser() {
       driver.close();
      // driver.quit();
    }

    public void refreshPage() {
       driver.navigate().refresh();
    }
}
