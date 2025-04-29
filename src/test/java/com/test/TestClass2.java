package com.test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestClass2 extends BaseTest {
    @Test
    public  void test4() throws InterruptedException {
        driver.get("https://mvnrepository.com/artifact/org.testng/testng");
        //driver.manage().wait(3000);
      /*  refreshPage();
        driver.navigate().to("https://mvnrepository.com/artifact/org.testng/testng");
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.titleIs("Maven Repository: org.testng » testng"));
        System.out.println(driver.getTitle());
*/
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));

    }
}
