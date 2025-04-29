package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestClass1 extends BaseTest {
    @Test
    public  void testOpenGoogle() throws InterruptedException {
        driver.get("https://www.google.com/");
        //driver.manage().wait(3000);
        refreshPage();
        driver.navigate().to("https://mvnrepository.com/artifact/org.testng/testng");
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.titleIs("Maven Repository: org.testng » testng"));
        System.out.println(driver.getTitle());

      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));

    }
}
