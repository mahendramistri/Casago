package com.test;

import org.testng.annotations.Test;
public class TestClass1 extends BaseTest {
    @Test (groups = "regression")
    public  void test1() throws InterruptedException {
        driver.get("https://www.google.com/");

    }
    @Test (groups = "smoke" , priority = 1)
    public  void test2() throws InterruptedException {

    }
    @Test (groups = "smoke")
    public  void test3() throws InterruptedException {

    }
}
